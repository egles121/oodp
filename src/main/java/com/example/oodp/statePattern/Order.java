package com.example.oodp.statePattern;

import com.example.oodp.compositePattern.OrderScreen;
import com.example.oodp.decoratorPattern.BurgerDecorator;
import com.example.oodp.factoryPattern.Burger;
import com.example.oodp.statePattern.states.FriesState;
import com.example.oodp.statePattern.states.OrderedState;
import com.example.oodp.templatePattern.BurgerMaker;
import java.util.Objects;
import lombok.Setter;

@Setter
public class Order implements OrderScreen {

  private static int nextOrderNumber = 1;
  private int orderNumber;
  private OrderState orderState;

  private final BurgerMaker burgerMaker;

  private BurgerDecorator burgerDecorator;

  public Order(BurgerMaker burgerMaker) {
    this.burgerMaker = burgerMaker;
    this.orderState = new OrderedState();
    orderNumber = nextOrderNumber;
    nextOrderNumber++;
  }

  public void setOrderState(OrderState orderState) {
    this.orderState = orderState;
  }

  public void setBurgerDecorator(BurgerDecorator burgerDecorator) {
    this.burgerDecorator = burgerDecorator;
  }

  public void makeOrder() {
    setOrderState(new OrderedState());
    orderState.printStatus(this);
    Burger burger = burgerMaker.makeBurger();
    orderState.printStatus(this);
    if (Objects.isNull(burgerDecorator)) {
      System.out.println("Total cost: " + burger.getCost());
      System.out.println("Pick up your: " + burger.getDescription());
      return;
    }
    setOrderState(new FriesState());
    orderState.printStatus(this);
    System.out.println("Total cost: " + burgerDecorator.getCost());
    System.out.println("Pick up your: " + burgerDecorator.getDescription());
  }

  @Override
  public void printOrderAndStatus() {
    System.out.println("**********************");
    System.out.println("*   Order number: " + orderNumber + "  *");
  }
}
