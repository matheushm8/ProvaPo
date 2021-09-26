
package br.com.unipar.entities.additional;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

public class CanelaPó extends OrderDecorator{
    
    private double VALUE = 0.75;

    public CanelaPó(Order Order) {
    super(Order);
    }

        @Override
    public double calculate() {
    return super.calculate() + VALUE;
    }
}
