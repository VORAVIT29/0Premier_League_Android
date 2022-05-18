package com.example.premierleague;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    GridView gridView;
    Data data = new Data();
    String [] items = data.items;
    Integer [] logo = data.logo;
    BottomNavigationView bottomNavigationView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        CustomAdapter adapter = new CustomAdapter(this,items, logo);
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);
        bottomNavigationView1 = (BottomNavigationView) findViewById(R.id.navigation1);
        bottomNavigationView1.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.home:
                                break;
                            case R.id.game:
                                Toast.makeText(MainActivity2.this,"Open Mini Game",Toast.LENGTH_SHORT).show();
                                NextPage(game.class);
                                break;
                        }
                        return true;
                    }
                }
        );
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        index_team set = new index_team();
        set.setValue(id);

        // รอเปลี่ยนหน้า
        NextPage(Activity_team.class);
    }

    // Next Page
    private void NextPage(Class page) {
        Intent Page = new Intent(MainActivity2.this,page);
        startActivity(Page);
    }
}

// New Class
class CustomAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String [] items;
    private final Integer [] logo;

    public CustomAdapter(Context ctx, String []items, Integer [] logo) {
        super(ctx,R.layout.grid_layou, items);
        this.context = ctx;
        this.items = items;
        this.logo = logo;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)getContext().
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.grid_layou,null,true);

        TextView title =(TextView) rowView.findViewById(R.id.textView);
        ImageView image = (ImageView) rowView.findViewById(R.id.imgview);
        title.setText(items[position]);
        image.setImageResource(logo[position]);
        return rowView;
    }
}