
package br.com.unipar.entities.additional;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

public class Biscoito extends OrderDecorator{
    
    private double VALUE = 0.90;

    public Biscoito(Order Order) {
    super(Order);
    }

            @Override
    public double calculate() {
    return super.calculate() + VALUE;
    }
}
