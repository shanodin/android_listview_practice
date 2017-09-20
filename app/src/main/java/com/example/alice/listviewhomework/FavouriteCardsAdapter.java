package com.example.alice.listviewhomework;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.graphics.Color.*;
import static android.graphics.Color.argb;
import static com.example.alice.listviewhomework.Factions.*;

/**
 * Created by alice on 20/09/2017.
 */

public class FavouriteCardsAdapter extends ArrayAdapter<Card> {

    public FavouriteCardsAdapter(Context context, ArrayList<Card> cards) {
        super(context, 0, cards);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_card_item,
                    parent, false);
        }
        Card currentCard = getItem(position);

        TextView faction = listItemView.findViewById(R.id.faction);
        faction.setText(currentCard.getFaction().toString().toLowerCase());

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentCard.getName());

        TextView cost = listItemView.findViewById(R.id.cost);
        cost.setText(currentCard.getCost().toString());

        TextView type = listItemView.findViewById(R.id.type);
        type.setText(currentCard.getType());

        listItemView.setTag(currentCard);

//        if(currentCard.getFaction().equals(ANARCH)) {
//            listItemView.setBackgroundColor (Color.argb(1, 209, 70, 5));
//        }
//        if(currentCard.getFaction().equals(NBN)) {
//            listItemView.setBackgroundColor (Color.YELLOW);
//        }
//        if(currentCard.getFaction().equals(HAASBIOROID)) {
//            listItemView.setBackgroundColor (Color.argb(1, 126, 7, 176));
//        }
//        if(getItem(position).getFaction().equals(JINTEKI)) {
//            listItemView.setBackgroundColor (Color.RED);
//        }
//        if(getItem(position).getFaction().equals(SHAPER)) {
//            listItemView.setBackgroundColor (Color.GREEN);
//        }
//        if(getItem(position).getFaction().equals(CRIMINAL)) {
//            listItemView.setBackgroundColor (Color.BLUE);
//        }
//        if(getItem(position).getFaction().equals(WEYLAND)) {
//            listItemView.setBackgroundColor (Color.argb(1, 6, 152, 86));
//        }
//        else
//        {
//            listItemView.setBackgroundColor (Color.LTGRAY);
//        }

        return listItemView;
    }
}
