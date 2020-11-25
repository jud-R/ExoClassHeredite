package com.company.Véhicules.Mécaniques.Terrestre;

import com.company.Véhicules.Mécaniques.Mecaniques;

public class Terrestre extends Mecaniques {

  public Terrestre(String nom, String marque, int poids, int puissanceMoteur, int nbRoues) {
    super(nom, marque, poids, puissanceMoteur, nbRoues);
  }

  public void avance() {
    System.out.println("C'est un " + nom + " de marque " + this.marque + " pèse " + this.poids
        + " kg. Il a une puissance moteur de " + this.puissanceMoteur + " ch, " + nbRoues
        + " roues. Et il roule.");
  }

}
