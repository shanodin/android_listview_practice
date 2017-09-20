package com.example.alice.listviewhomework;

import org.junit.Before;
import org.junit.Test;

import static com.example.alice.listviewhomework.Factions.*;
import static junit.framework.Assert.assertEquals;

/**
 * Created by alice on 20/09/2017.
 */

public class CardTest {

    Card card1;

    @Before
    public void before() {
        card1 = new Card("Account Siphon", Factions.CRIMINAL, "Event", 0);
    }

    @Test
    public void testName() {
        assertEquals("Account Siphon", card1.getName());
    }

    @Test
    public void testFaction() {
        assertEquals(CRIMINAL, card1.getFaction());
    }

    @Test
    public void testType() {
        assertEquals("Event", card1.getType());
    }

    @Test
    public void testCost() {
        assertEquals(0, card1.getCost());
    }
}
