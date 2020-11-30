package com.company.Courses.Comestibles;

import com.company.Courses.Courses;

public abstract class Comestible extends Courses {

  public Comestible(String nom, double prix) {
    super(nom, prix);
  }

  protected String acheter() {
    return super.acheter() + "Il peut être mangé. ";
  }

}
