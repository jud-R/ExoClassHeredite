package com.company.Courses.Comestibles.Frais.FruitsEtLegumes;

import com.company.Courses.Comestibles.Frais.Frais;

public class FruitsEtLegumes extends Frais {

  public FruitsEtLegumes(String nom, double prix) {
    super(nom, prix);
  }

  public String acheter() {
    return super.acheter();
  }

  public String frigo() {
    return super.frigo() + "Et il pousse.";
  }

}
