package com.example.premierleague;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class game extends AppCompatActivity {
    Random random = new Random();
    Data data = new Data();
    Button start, back;
    TextView time_count;
    CountDownTimer time;

    Integer[] posimg = {
            R.id.imageButton15, R.id.imageButton16, R.id.imageButton17,
            R.id.imageButton18, R.id.imageButton19, R.id.imageButton20,
            R.id.imageButton21, R.id.imageButton22
    };

    MediaPlayer  soundMatch,soundIncorrect,soundCorrect,soundClock;
    int sound;

    int [] keep_team = new int[4]; // 4
    int [] check_position = new int[posimg.length]; // 8
    int [] keep_pos = new int[posimg.length]; // 8

    ImageButton[] img = new ImageButton[posimg.length]; // 8
    int MatchGame = 0;
    int StartMatchGame = -1;
    int EndMatchGame = -1;
    boolean turnOver = false;
    int count;
    String [] click_ch = new String[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        statusbarcolor();

        start = (Button) findViewById(R.id.btnStart);
        back = (Button) findViewById(R.id.btnBack);
        time_count = (TextView) findViewById(R.id.timeCount);

        // create sound
        createMedia();
        // show Detail
        showDialogDetail();
        // createMinigame
        createMinigame();

        // ปุ่มเริ่มเกม
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame();
            }
        });
        // ปุ่มออกหน้าเกม
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time.cancel();
                stopMedia();
                createMedia();
                finish();
            }
        });

        time = new CountDownTimer(10000,1000) {
            public void onTick(long millisUntilFinished) {
                int sec = (int) millisUntilFinished / 1000;
                time_count.setText("00 : 0"+sec);
                if (sec == 5) {
                    soundClock.start();
                }

                for (int i = 0; i < posimg.length; i++) {
                    int index = i;
                    img[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // กดดูรูปที่เลือก
                            if (click_ch[index].equals("click") && !turnOver) {
                                img[index].setImageResource(check_position[index]);
                                click_ch[index] = "Noclick";
                                // เช็คถ้ายังไม่เคยกดรูปอิ่น
                                if (MatchGame == 0) {
                                    StartMatchGame = index;
                                }
                                else if (MatchGame == 1) {
                                    EndMatchGame = index;
                                }
                                MatchGame++;
                            }
                            // ปิดรูปที่จับคู่
                            else if (click_ch[index].equals("Noclick")) {
                                img[index].setImageResource(R.drawable.premier_league_logo);
                                click_ch[index] = "click";
                                turnOver = false;
                                if (MatchGame == 0) {
                                    StartMatchGame = -1;
                                }
                                else if (MatchGame == 1) {
                                    EndMatchGame = -1;
                                }
                                MatchGame--;
                            }

                            if (MatchGame == 2) {
                                turnOver = true;
                                // เช็คทีมเหมือนกัน
                                if (check_position[StartMatchGame] == check_position[EndMatchGame])
                                {
                                    soundMatch = MediaPlayer.create(game.this,R.raw.match);
                                    soundMatch.start();

                                    img[index].setEnabled(false);
                                    img[StartMatchGame].setEnabled(false);
                                    Toast.makeText(game.this,"Congratulations!!!",
                                            Toast.LENGTH_SHORT).show();
                                    MatchGame = 0;
                                    turnOver = false;
                                    count++;
                                }
                                else { //ถ้าทายผิด จบเกมส์เลย
                                    stopMedia();
                                    soundIncorrect.start();

                                    for (int i = 0; i < img.length; i++) {
                                        img[i].setEnabled(false);
                                    }
                                    Toast.makeText(game.this,"Game Over!!",
                                            Toast.LENGTH_SHORT).show();
                                    time.cancel();
                                    DialogIncorrect();
                                }
                            }
                            // ถ้าถูกหมด ก็จบเกมส์
                            if (count == 4) {
                                stopMedia();
                                for (int i = 0; i < img.length; i++) {
                                    img[i].setEnabled(false);
                                }
                                soundCorrect.start();
                                time.cancel();
                                Dialogcorrect();
                            }
                        }
                    });
                }
            }
            // เมื่อเวลาหมด
            @Override
            public void onFinish() {
                stopMedia();
                soundIncorrect.start();

                for (int i = 0; i < img.length; i++) {
                    img[i].setEnabled(false);
                }
                Toast.makeText(game.this,"Game Over!!",
                        Toast.LENGTH_SHORT).show();
                DialogIncorrect();
            }
        };
    }

    private void createMedia() {
        soundMatch = soundIncorrect = soundCorrect =  soundClock = null;
        soundClock = MediaPlayer.create(game.this,R.raw.clock);
        soundIncorrect = MediaPlayer.create(game.this,R.raw.incorrect);
        soundCorrect = MediaPlayer.create(game.this,R.raw.correct);
        soundMatch = MediaPlayer.create(game.this,R.raw.match);
    }

    private void stopMedia() {
        if (soundClock.isPlaying() && soundClock != null){
            soundClock.stop();
            soundClock.release();
            soundClock = null;
        }
        else if (!soundClock.isPlaying() && soundClock != null) {
            soundClock.release();
            soundClock = null;
        }
    }

    private void Dialogcorrect() {
        Dialog dialog = new Dialog(this,R.style.DialogStyle);
        dialog.setContentView(R.layout.game_correct);
        // set bg
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.cornor_1);

        Button btnTry_again = dialog.findViewById(R.id.buttonPlayagain);
        btnTry_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createMedia();
                setDefail();
                createMinigame();
                dialog.dismiss();
            }
        });
        Button btnHome = dialog.findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        dialog.show();
    }

    private void DialogIncorrect() {
        Dialog dialog = new Dialog(this,R.style.DialogStyle);
        dialog.setContentView(R.layout.game_incorrect);
        // set bg
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.cornor_1);

        Button btnTry_again = dialog.findViewById(R.id.buttonPlayagain);
        btnTry_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createMedia();
                setDefail();
                createMinigame();
                dialog.dismiss();
            }
        });
        Button btnHome = dialog.findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        dialog.show();
    }

    private void createMinigame() {
        Arrays.fill(check_position,R.drawable.premier_league_logo); // 8
        int index_pos = 0;
        int index = 0;
        int count = 0;
        // สุ่มทีม 4 ทีม
        while (true) {
            int randTeam = random.nextInt(20);
            int chLogo = data.logo[randTeam];
            boolean check = IntStream.of(keep_team).anyMatch(x -> x == chLogo);
            if (!check) {
                keep_team[index] = chLogo;
                index++;
                count++;
            }

            // quit loop
            if (count == 4){
                break;
            }
        }

        // สุ่มตำแหน่งที่วางทีม
        index = 0;
        count = 0;
        while (true)  {
            int randPos = random.nextInt(8);
            boolean check_pos = IntStream.of(keep_pos).anyMatch(pos -> pos == randPos);
            if (!check_pos) {
                keep_pos[index_pos] = randPos;
                check_position[randPos] = keep_team[index];
                index_pos++;
                index++;
                count++;
            }

            if (count == 4) {
                break;
            }
        }

        index = 0;
        for (int i = 0; i < check_position.length ; i++) {
            if (check_position[i] == R.drawable.premier_league_logo) {
                check_position[i] = keep_team[index];
                index++;
            }
        }
        // Keep possition img เก็บและโชว์
        for (int i = 0; i < posimg.length; i++) {
            img[i] = (ImageButton) findViewById(posimg[i]);
            img[i].setImageResource(check_position[i]);
        }
    }

    private void setDefail() {
        MatchGame = 0;
        StartMatchGame = -1;
        EndMatchGame = -1;
        turnOver = false;
        count = 0;
        Arrays.fill(click_ch,"click");
        time_count.setText("00 : 00");
    }

    private void startGame() {
        setDefail();

        for (int i = 0; i < img.length; i++) {
            img[i].setImageResource(R.drawable.premier_league_logo);
            img[i].setEnabled(true);
        }
        time.start();
    }

    private void showDialogDetail() {
        Dialog dialog = new Dialog(this,R.style.DialogStyle);
        dialog.setContentView(R.layout.detail_game);
        // set bg
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.cornor_1);

        Button btnOk = dialog.findViewById(R.id.buttonPlayagain);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void statusbarcolor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.pink));
        }
    }
}