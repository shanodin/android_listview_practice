package com.example.alice.listviewhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class FavouriteCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_card);

        FavouriteCards favouriteCards = new FavouriteCards();
        ArrayList<Card> list = favouriteCards.getList();

        FavouriteCardsAdapter cardAdapter = new FavouriteCardsAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(cardAdapter);
    }

    public void getCard(View listItem) {
        Card card = (Card) listItem.getTag();
        Log.d("Card Name: ", card.getName());
    }
}
