
package br.com.unipar.entities.additional;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

public class RaspasLimao extends OrderDecorator{
    
    private double VALUE = 0.50;

    public RaspasLimao(Order Order) {
    super(Order);
    }

         @Override
    public double calculate() {
    return super.calculate() + VALUE;
    }
}
