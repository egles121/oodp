package com.example.oodp.factoryPattern.model;

import com.example.oodp.factoryPattern.Burger;

public class Cheeseburger implements Burger {

  @Override
  public String getDescription() {
    return "Cheeseburger";
  }

  @Override
  public double getCost() {
    return 6.99;
  }
}
