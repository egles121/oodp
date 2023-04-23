package com.example.oodp.statePattern.states;

import com.example.oodp.statePattern.Order;
import com.example.oodp.statePattern.OrderState;

public class OrderedState implements OrderState {

  @Override
  public void printStatus(Order order) {
    System.out.println("Burger has been ordered...");
    order.setOrderState(new DoneState());
  }
}
