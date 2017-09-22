package com.example.alice.listviewhomework;

import java.util.ArrayList;

/**
 * Created by alice on 20/09/2017.
 */

public class FavouriteCards {
    private ArrayList<Card> list;

    public FavouriteCards() {
        list = new ArrayList<Card>();
        list.add(new Card("Account Siphon", Factions.CRIMINAL, "Event", 0));
        list.add(new Card("Celebrity Gift", Factions.JINTEKI, "Operation", 3));
        list.add(new Card("Boom!", Factions.WEYLAND, "Operation", 4));
        list.add(new Card("Sweeps Week", Factions.NBN, "Operation", 1));
        list.add(new Card("Paperclip", Factions.ANARCH, "Program", 4));
        list.add(new Card("Accelerated Beta Test", Factions.HAASBIOROID, "Agenda", 3));
        list.add(new Card("Hayley Kaplan", Factions.SHAPER, "Identity", 0));
        list.add(new Card("Desperado", Factions.CRIMINAL, "Hardware", 3));
    }

    public ArrayList<Card> getList() {
        return new ArrayList<>(list);
    }
}
