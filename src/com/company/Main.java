package com.company;

import com.company.Animaux.Carnivore.Carnivore;
import com.company.Animaux.Herbivore.Herbivore;
import com.company.Animaux.Omnivore.Omnivore;
import com.company.Courses.Comestibles.Frais.Frais;
import com.company.Courses.Comestibles.Frais.FruitsEtLegumes.FruitsEtLegumes;
import com.company.Courses.Comestibles.Sec.Sec;
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

    Carnivore leopard = new Carnivore("Léopard");
    leopard.avance();
    leopard.mange();

    Carnivore lion = new Carnivore("Lion");
    lion.avance();
    lion.mange();

    Carnivore hyene = new Carnivore("Hyène");
    hyene.avance();
    hyene.mange();

    Herbivore chevre = new Herbivore("Chèvre");
    chevre.avance();
    chevre.mange();

    Herbivore mouton = new Herbivore("Mouton");
    mouton.avance();
    mouton.mange();

    Herbivore vache = new Herbivore("Vache");
    vache.avance();
    vache.mange();

    Omnivore singe = new Omnivore("Singe");
    singe.avance();
    singe.mange();

    Omnivore porc = new Omnivore("Porc");
    porc.avance();
    porc.mange();

    Omnivore humain = new Omnivore("Humain");
    humain.avance();
    humain.mange();

    System.out.println("Les Courses ------------------------------------------------------------");

    Sec cereals = new Sec("céréals", 2.80);
    System.out.println(cereals.acheter());

    Frais yaourt = new Frais("yaourt", 1.80);
    System.out.println(yaourt.acheter() + yaourt.frigo());

    FruitsEtLegumes tomate = new FruitsEtLegumes("tomate", 0.80);
    System.out.println(tomate.acheter() + tomate.frigo());

    
  }
}
