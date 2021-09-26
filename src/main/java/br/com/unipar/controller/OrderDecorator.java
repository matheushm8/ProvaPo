
package br.com.unipar.controller;

public class OrderDecorator implements Order {

    private Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public double calculate() {
        return order.calculate();
    }
}
