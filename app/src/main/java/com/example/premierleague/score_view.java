package com.example.premierleague;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class score_view extends ArrayAdapter<String> {
    private final Context context;
    private final String [] items;
    private final Integer [] Team;
    private final int [] score;
    private final int index;

    public score_view(Context ctx, String [] name_team, Integer [] Team,String []countMatch,
                      int [] score,int index_team) {
        super(ctx,R.layout.sore_view, countMatch);
        this.context = ctx;
        this.items = name_team;
        this.Team = Team;
        this.score = score;
        this.index = index_team;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.sore_view,null,true);

        TextView date = (TextView) rowView.findViewById(R.id.date);
        ImageView image = (ImageView) rowView.findViewById(R.id.teamA);
        TextView title =(TextView) rowView.findViewById(R.id.nameteamA);
        ImageView image2 = (ImageView) rowView.findViewById(R.id.teamB);
        TextView title2 = (TextView) rowView.findViewById(R.id.nameteamB);
        TextView num1 = (TextView) rowView.findViewById(R.id.num1);
        TextView num2 = (TextView) rowView.findViewById(R.id.num2);

        Data data = new Data();
        String [] name = data.items;
        Integer [] LG = data.logo;

        // Date
        date.setText("30/02/22");

//        Log.i("pooh", "getView: "+index);
        //Home
        image.setImageResource(LG[index]);
        title.setText(name[index]);

        //Away
        image2.setImageResource(Team[position]);
        title2.setText(items[position]);


        //Score
        num1.setText(score[position] +"");
        num2.setText(score[position+1] +"");

        return rowView;
    }
}
