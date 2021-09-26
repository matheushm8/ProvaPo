
package br.com.unipar.entities;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

public class TamanhoGrande extends OrderDecorator{
    
    private double PERCENTAGE = 1.35;
    
        public TamanhoGrande(Order order) {
        super(order);
    }

    @Override
         public double calculate() {
         return super.calculate() * PERCENTAGE;  }
}
