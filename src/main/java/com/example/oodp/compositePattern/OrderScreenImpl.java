package com.example.oodp.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class OrderScreenImpl implements OrderScreen {

  private final List<OrderScreen> orderScreenElements = new ArrayList<>();

  @Override
  public void printOrderAndStatus() {
    for (OrderScreen orderScreen : orderScreenElements) {
      orderScreen.printOrderAndStatus();
    }
  }

  public void addOrderToScreen(OrderScreen orderScreen) {
    orderScreenElements.add(orderScreen);
  }

  public void removeOrderFromScreen(OrderScreen orderScreen) {
    orderScreenElements.remove(orderScreen);
  }
}
