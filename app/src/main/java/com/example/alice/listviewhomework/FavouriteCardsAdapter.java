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
        listItemView.setBackgroundColor(getColour(currentCard.getFaction()));

        return listItemView;
    }

    private int getColour (Factions faction) {

        if (faction.equals(Factions.ANARCH)) {
//            return Color.HSVToColor(new float[] {1.0f, 0.5f, 2.0f});
            return Color.argb(255, 209, 70, 5);
            }
        if (faction.equals(Factions.NBN)) {
            return Color.YELLOW;
            }
        if (faction.equals(Factions.HAASBIOROID)) {
            return Color.argb(255, 126, 7, 176);
            }
        if (faction.equals(Factions.JINTEKI)) {
            return Color.RED;
            }
        if (faction.equals(Factions.SHAPER)) {
            return Color.GREEN;
            }
        if (faction.equals(Factions.CRIMINAL)) {
            return Color.BLUE;
            }
        if (faction.equals(Factions.WEYLAND)) {
            return Color.argb(255, 6, 152, 86);
            }
        return Color.LTGRAY;
    }
}
