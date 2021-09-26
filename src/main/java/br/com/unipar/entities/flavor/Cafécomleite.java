
package br.com.unipar.entities.flavor;

import br.com.unipar.controller.Order;

public class Cafécomleite implements Order{
    
    private double VALUE = 1.75;

        @Override
    public double calculate() {
    return VALUE;
    }
}
