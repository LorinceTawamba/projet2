package org.example;

public class Traitements {
    // Projet 2
    // - Recherche un element dans un tableau
    // - Inserer un element dans un tableau
    // - Supprimer un element dans un tableau

    private int[] tab;

    public Traitements(int[] tab) {
        this.tab = tab;
    }

    public int rechercherPosition(int val) {
        int pos = -1;
        for (int i=0; i<tab.length; i++) {
            if(tab[i]==val) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}
