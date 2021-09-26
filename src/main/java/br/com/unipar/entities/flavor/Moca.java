package br.com.unipar.entities.flavor;

import br.com.unipar.controller.Order;

public class Moca implements Order{
    
    private double VALUE = 4.00;

        @Override
    public double calculate() {
    return VALUE;
    }
}
