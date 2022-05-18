package com.example.premierleague;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import pl.droidsonroids.gif.GifImageView;

public class Activity_team extends AppCompatActivity implements AdapterView.OnItemClickListener {
    // ================================== Set Value ======================================
    // set class index
    index_team set = new index_team();
    // get index Team
    int index_team = (int) set.getValue();
    BottomNavigationView bottomNavigationView;
    ListView listview;
    // get imgTeam
    ImageView imgTeam;
    TextView nameTeam;

    // set Class Data
    Data data = new Data();
    String [] items = data.items;
    Integer [] logo = data.logo;
    Integer [] gifbg = data.gifbg;
    Integer [] player;
    String [] names;
    Integer [] numbers;
    GifImageView gif;
    boolean ch = false;
    LayoutInflater layoutInflater;
    View detailPlayer;

    //page 1
    String [] page = {"1"};

    // ================================== End Set Value ====================================

    private void getTeam() {

        if ( index_team == 0) {
            player_Arsenal team = new player_Arsenal();
            player = team.player;
            names = team.names;
            numbers = team.numbers;

        } else if (index_team == 1) {
            player_chelsea team = new player_chelsea();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        } else if (index_team == 2) {
            player_liverpool team = new player_liverpool();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        } else if (index_team == 3) {
            player_man_city team = new player_man_city();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 4) {
            player_man_u team = new player_man_u();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 5) {
            player_spur team = new player_spur();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 6) {
            player_leicestercity team = new player_leicestercity();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 7) {
            player_aston_villa team = new player_aston_villa();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 8) {
            player_brenford team = new player_brenford();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 9) {
            player_Brighton_and_Hove_Albion team = new player_Brighton_and_Hove_Albion();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 10) {
            player_burnley team = new player_burnley();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 11) {
            player_crystalPalace team = new player_crystalPalace();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 12) {
            player_everton team = new player_everton();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 13) {
            player_leeds team = new player_leeds();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 14) {
            player_newcastleunited team = new player_newcastleunited();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 15) {
            player_norwichcity team = new player_norwichcity();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 16) {
            player_southampton team = new player_southampton();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 17) {
            player_watford team = new player_watford();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 18) {
            player_westhamunited team = new player_westhamunited();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
        else if (index_team == 19) {
            player_wolverhamptonwanderers team = new player_wolverhamptonwanderers();
            player = team.player;
            names = team.names;
            numbers = team.numbers;
        }
    }
    private void getPage_team(){
        if ( index_team == 0) {
            team_view_arsenal teamView = new team_view_arsenal(this,page);
            listview.setAdapter(teamView);
        } else if (index_team == 1) {
            team_view_chelsea teamView = new team_view_chelsea(this,page);
            listview.setAdapter(teamView);
        } else if (index_team == 2) {
            team_view_liverpool teamView = new team_view_liverpool(this,page);
            listview.setAdapter(teamView);
        } else if (index_team == 3) {
            team_view_man_city teamView = new team_view_man_city(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 4) {
            team_view_man_u teamView = new team_view_man_u(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 5) {
            team_view_spur teamView = new team_view_spur(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 6) {
            team_view_leicester teamView = new team_view_leicester(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 7) {
            team_view_astonVilla teamView = new team_view_astonVilla(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 8) {
            team_view_brenford teamView = new team_view_brenford(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 9) {
            team_view_brighton teamView = new team_view_brighton(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 10) {
            team_view_burnley teamView = new team_view_burnley(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 11) {
            team_view_palace teamView = new team_view_palace(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 12) {
            team_view_everton teamView = new team_view_everton(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 13) {
            team_view_leeds teamView = new team_view_leeds(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 14) {
            team_view_newcastle teamView = new team_view_newcastle(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 15) {
            team_view_norwich teamView = new team_view_norwich(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 16) {
            team_view_southampton teamView = new team_view_southampton(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 17) {
            team_view_watford teamView = new team_view_watford(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 18) {
            team_view_westham teamView = new team_view_westham(this,page);
            listview.setAdapter(teamView);
        }
        else if (index_team == 19) {
            team_view_wolve teamView = new team_view_wolve(this,page);
            listview.setAdapter(teamView);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_team);

        gif = (GifImageView) findViewById(R.id.gifimgpng);
        listview = (ListView) findViewById(R.id.listview);
//        imgTeam = (ImageView) findViewById(R.id.logoTeam);
//        nameTeam = (TextView) findViewById(R.id.nameTeam);

//        imgTeam.setImageResource(logo[index_team]);
//        nameTeam.setText(items[index_team]);
        gif.setImageResource(gifbg[index_team]);
        getTeam();

        // โชว์หน้านักเตะ
        layoutInflater = getLayoutInflater();
        detailPlayer = layoutInflater.inflate(R.layout.layout_detail_player,
                (ViewGroup) findViewById(R.id.viewGroud));

        // เปิด class เริ่มต้น
        openDefaul();

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.team:
                                ch = false;
                                // เปิด class เริ่มต้น
                                openDefaul();
                                break;
                            case R.id.players:
                                ch = true;
                                // get class player_view
                                player_view playerView = new player_view(Activity_team.this,names,player,numbers);
                                listview.setAdapter(playerView);
                                listview.setOnItemClickListener(Activity_team.this);
                                break;
                            case R.id.match:
                                ch = false;
                                setTeam();;
                                break;
                        }
                        return true;
                    }
                }
        );
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        // กดดูรายละเอียนดนักเตะ
        if (ch) {
            ImageView img = detailPlayer.findViewById(R.id.imgPlay);
            TextView name = detailPlayer.findViewById(R.id.namePlay);
            TextView numPlayer = detailPlayer.findViewById(R.id.numPlayer);

            img.setImageResource(player[position]);
            // set bg detail player
            img.setBackgroundTintList(ColorStateList.valueOf(
                    getResources().getColor(data.color_bg[index_team])));
            name.setText(names[position]);
            numPlayer.setText(numbers[position]+"");

            Toast detailPage;
            detailPage = Toast.makeText(this,"Open Detail",Toast.LENGTH_SHORT);
            detailPage.setGravity(Gravity.CENTER,0,0);
            detailPage.setView(detailPlayer);
            detailPage.show();
        }
    }

    // เปิดหน้าเริ่มต้้น
    private void openDefaul(){
        getPage_team();
    }

    // set team
    private void setTeam() {
        String [] count_match = new String[6];
        Integer [] Team = new Integer[7];
        String [] name_team = new String[7];
        int [] score = new int[7];


        // Random team
        for (int i = 0; i < Team.length; i++) {
            int rand;
            while (true){
                rand = rnd(0,19);
                if (rand != set.getValue())
                    break;
            }
            Team[i] = logo[rand];
            name_team[i] = items[rand];
        }
        // Random score
        for (int i = 0; i < score.length ; i++) {
            int rand = rnd(0,5);
            score[i] = rand;
        }

        // Get class score_view
        score_view scoreView = new score_view(this,name_team,Team,count_match,score, index_team);
        listview.setAdapter(scoreView);
    }

    // random
    public int rnd(int min,int max) {
        float num = (max - min + 1) + min;
        int random_int = (int) Math.floor(Math.random() * num);
        return (random_int);
    }
}