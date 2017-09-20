package com.example.alice.listviewhomework;

/**
 * Created by alice on 20/09/2017.
 */

public class Card {
    private String name;
    private Factions faction;
    private String type;
    private Integer cost;

    public Card(String name, Factions faction, String type, Integer cost) {
        this.name = name;
        this.faction = faction;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Factions getFaction() {
        return faction;
    }

    public String getType() {
        return type;
    }

    public Integer getCost() {
        return cost;
    }
}
