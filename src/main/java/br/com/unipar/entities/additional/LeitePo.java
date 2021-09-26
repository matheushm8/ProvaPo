
package br.com.unipar.entities.additional;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

public class LeitePo extends OrderDecorator{
    
    private double VALUE = 1.40;

    public LeitePo(Order Order) {
        super(Order);
    }

            @Override
    public double calculate() {
    return super.calculate() + VALUE;
    }
}
