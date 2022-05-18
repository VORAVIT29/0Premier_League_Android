package com.example.premierleague;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

// chelsea
class team_view_chelsea extends ArrayAdapter {
    public team_view_chelsea(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_chelsea,page);
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_chelsea,null,true);
        return rowView;
    }
}

// arsenal
class team_view_arsenal extends ArrayAdapter<String> {
    public team_view_arsenal(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_arsenal,page);
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_arsenal,null,true);
        return rowView;
    }
}

// man u
class team_view_man_u extends ArrayAdapter<String> {

    public team_view_man_u(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_man_u,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_man_u,null,true);
        return rowView;
    }
}

// liverpool
class team_view_liverpool extends ArrayAdapter<String> {

    public team_view_liverpool(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_liverpool,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_liverpool,null,true);
        return rowView;
    }
}

// Man city
class team_view_man_city extends ArrayAdapter<String> {

    public team_view_man_city(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_mancity,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_mancity,null,true);
        return rowView;
    }
}

// spur
class team_view_spur extends ArrayAdapter<String> {

    public team_view_spur(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_spur,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_spur,null,true);
        return rowView;
    }
}

// leicester
class team_view_leicester extends ArrayAdapter<String> {

    public team_view_leicester(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_leicester,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_leicester,null,true);
        return rowView;
    }
}

// Aston villa
class team_view_astonVilla extends ArrayAdapter<String> {

    public team_view_astonVilla(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_astonvila,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_astonvila,null,true);
        return rowView;
    }
}

// brentford
class team_view_brenford extends ArrayAdapter<String> {

    public team_view_brenford(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_brentford,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_brentford,null,true);
        return rowView;
    }
}

// brighton
class team_view_brighton extends ArrayAdapter<String> {

    public team_view_brighton(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_briton,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_briton,null,true);
        return rowView;
    }
}

// burnley
class team_view_burnley extends ArrayAdapter<String> {

    public team_view_burnley(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_burnley,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_burnley,null,true);
        return rowView;
    }
}

// palace
class team_view_palace extends ArrayAdapter<String> {

    public team_view_palace(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_crystalpalace,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_crystalpalace,null,true);
        return rowView;
    }
}

// everton
class team_view_everton extends ArrayAdapter<String> {

    public team_view_everton(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_everton,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_everton,null,true);
        return rowView;
    }
}

// leeds
class team_view_leeds extends ArrayAdapter<String> {

    public team_view_leeds(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_leeds,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_leeds,null,true);
        return rowView;
    }
}

// newcastle
class team_view_newcastle extends ArrayAdapter<String> {

    public team_view_newcastle(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_newcastleunited,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_newcastleunited,null,true);
        return rowView;
    }
}

// norwich
class team_view_norwich extends ArrayAdapter<String> {

    public team_view_norwich(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_norwichcity,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_norwichcity,null,true);
        return rowView;
    }
}

// southampton
class team_view_southampton extends ArrayAdapter<String> {

    public team_view_southampton(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_southampton,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_southampton,null,true);
        return rowView;
    }
}

// watford
class team_view_watford extends ArrayAdapter<String> {

    public team_view_watford(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_watford,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_watford,null,true);
        return rowView;
    }
}

//westham
class team_view_westham extends ArrayAdapter<String> {

    public team_view_westham(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_westham_united,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_westham_united,null,true);
        return rowView;
    }
}
// wolve
class team_view_wolve extends ArrayAdapter<String> {

    public team_view_wolve(Context ctx, String [] page) {
        super(ctx,R.layout.team_view_wolverhamptonwanderers,page);
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.team_view_wolverhamptonwanderers,null,true);
        return rowView;
    }
}