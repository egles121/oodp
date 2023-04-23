package com.example.oodp.decoratorPattern;

import com.example.oodp.factoryPattern.Burger;

public class FriesDecorator implements BurgerDecorator {

  private final Burger burger;

  public FriesDecorator(Burger burger) {
    this.burger = burger;
  }

  @Override
  public String getDescription() {
    return burger.getDescription() + ", with a side of fries";
  }

  @Override
  public double getCost() {
    return burger.getCost() + 1.99;
  }
}
