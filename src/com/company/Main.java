package com.company;

import com.company.Animaux.Mammiferes.Mammiferes;
import com.company.Animaux.Poisson.Poisson;
import com.company.Animaux.Volant.Insectes.Insectes;
import com.company.Animaux.Volant.Volatiles;
import com.company.Courses.Comestibles.Frais.Frais;
import com.company.Courses.Comestibles.Frais.FruitsEtLegumes.FruitsEtLegumes;
import com.company.Courses.Comestibles.Sec.Sec;
import com.company.Courses.NonComestible.NonComestible;
import com.company.Courses.NonComestible.ProduitToxique.ProduitToxique;
import com.company.Véhicules.Aquatiques.Aquatiques;
import com.company.Véhicules.Mécaniques.Terrestre.Terrestre;
import com.company.Véhicules.Mécaniques.Volants.Volant;

public class Main {

  public static void main(String[] args) {

    System.out.println("Les Véhicules --------------------------------------------");
    Aquatiques voilier = new Aquatiques("Voilier", "Lagoon", 570, 3);
    voilier.avance();

    Aquatiques caravelle = new Aquatiques("Caravelle", "Caravelle", 210, 3);
    caravelle.avance();

    Volant avion = new Volant("Avion", "Boeing", 250000, 87325, 22, 0);
    avion.avance();

    Volant hélicoptère = new Volant("Hélicoptère", "Bell", 1600, 2000, 6, 3);
    hélicoptère.avance();

    Terrestre voiture = new Terrestre("Voiture", "BMW", 1500, 400, 4);
    voiture.avance();

    Terrestre tank = new Terrestre("Tank", "Leopard", 35000, 1000, 32);
    tank.avance();

    System.out.println("Les Animaux -----------------------------------------------------------");

    Mammiferes chien = new Mammiferes("Chien");
    System.out.println(chien.avance());

    Mammiferes elephant = new Mammiferes("Eléphant");
    System.out.println(elephant.avance());

    Poisson poissonClown = new Poisson("Poisson Clown", 6);
    System.out.println(poissonClown.avance());

    Poisson requin = new Poisson("Requin", 8);
    System.out.println(requin.avance());

    Volatiles chauveSouris = new Volatiles("Chauves-souris", 2);
    System.out.println(chauveSouris.avance());

    Volatiles autruche = new Volatiles("Autruche", 2);
    System.out.println(autruche.avance());

    Insectes papillon = new Insectes("Papillon", 4, 2);
    System.out.println(papillon.avance());

    Insectes libellule = new Insectes("Libellule", 4, 2);
    System.out.println(libellule.avance());

    System.out.println("Les Courses ------------------------------------------------------------");

    Sec cereals = new Sec("Céréals", 2.80);
    System.out.println(cereals.acheter());

    Frais yaourt = new Frais("Yaourt", 1.80);
    System.out.println(yaourt.acheter() + yaourt.frigo());

    FruitsEtLegumes tomate = new FruitsEtLegumes("Tomate", 0.80);
    System.out.println(tomate.acheter() + tomate.frigo());

    NonComestible pq = new NonComestible("Papier Toilette", 1.50);
    System.out.println(pq.acheter());

    ProduitToxique javel = new ProduitToxique("Javel", 1.12);
    System.out.println(javel.acheter());
  }
}
