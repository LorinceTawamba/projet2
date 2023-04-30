package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println("==== PROJET 2 =====");
        int[] tab = {25, -4, 18};
        Traitements traitements = new Traitements(tab);
        System.out.println(traitements.rechercherPosition(-4));
    }
}