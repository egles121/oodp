package com.example.oodp.templatePattern;

import com.example.oodp.compositePattern.OrderScreen;
import com.example.oodp.factoryPattern.Burger;
import com.example.oodp.factoryPattern.BurgerFactory;
import com.example.oodp.factoryPattern.model.CheeseburgerFactory;

public class CheeseburgerMaker extends BurgerMaker implements OrderScreen {

  @Override
  public BurgerFactory createBurger() {
    return new CheeseburgerFactory();
  }

  @Override
  public void cookIngredients(Burger burger) {
    System.out.println("Cooking ingredients for " + burger.getDescription());
  }

  @Override
  public void assembleBurger(Burger burger) {
    System.out.println("Assembling " + burger.getDescription());
  }

  @Override
  public void packageBurger(Burger burger) {
    System.out.println("Packing " + burger.getDescription());
  }

  @Override
  public void printOrderAndStatus() {
    System.out.println("*   Cheeseburger     *");
    System.out.println("**********************");
  }
}
