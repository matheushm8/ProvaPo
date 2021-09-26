
package br.com.unipar.entities.flavor;

import br.com.unipar.controller.Order;

public class ChocolatecomLeite implements Order{
    
    private double VALUE = 2.50;

        @Override
    public double calculate() {
    return  VALUE;
    }
}
