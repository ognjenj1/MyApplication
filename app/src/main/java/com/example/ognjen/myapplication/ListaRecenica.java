package com.example.ognjen.myapplication;

import android.graphics.Color;

import java.util.Random;

public class ListaRecenica {
    private final String[] niz = {"Crvena", "Siva", "Zelena", "Ljubicasta", "Svetlo Plava"};
    private final int[] boje = {Color.RED,Color.GRAY,Color.GREEN,Color.MAGENTA,Color.CYAN};
    private int boja;
    public String getRecenica() {
        String recenica = "";
        Random generator = new Random();
        int i = generator.nextInt(niz.length);
        recenica = niz[i];
        boja = boje[i];
        return recenica;
    }

    public int getBoja() {
        return boja;
    }
}
