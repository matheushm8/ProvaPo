
package br.com.unipar.entities.flavor;

import br.com.unipar.controller.Order;

public class Café implements Order {

    private double VALUE = 1.50;


        @Override
    public double calculate() {
    return VALUE;
    }

}
