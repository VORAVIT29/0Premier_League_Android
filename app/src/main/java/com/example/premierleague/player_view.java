package com.example.premierleague;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class player_view extends ArrayAdapter<String> {
    private final Context context;
    private final String [] names;
    private final Integer [] player;
    private  final Integer [] number;
    private  final Integer [] color;
    private  final int index;

    public player_view(Context ctx,String [] names, Integer [] player,Integer [] numbers) {
        super(ctx,R.layout.player_view,names);
        index_team indexTeam = new index_team();
        Data data = new Data();
        this.context = ctx;
        this.names = names;
        this.player = player;
        this.number = numbers;
        this.color = data.color_bg;
        this.index = (int) indexTeam.getValue();

    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.player_view,null,true);

        TextView name = rowView.findViewById(R.id.pName);
        TextView numplay = rowView.findViewById(R.id.playerNum);
        CardView bg_color = rowView.findViewById(R.id.bg_detail);

        bg_color.setBackgroundTintList(ColorStateList.valueOf(
                context.getResources().getColor(color[index])));
        name.setText(names[position]);
        numplay.setText(number[position]+"");
        return rowView;
    }
}
