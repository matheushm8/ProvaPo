
package br.com.unipar.entities.flavor;

import br.com.unipar.controller.Order;

public class EspressoPanna implements Order{
    
    private double VALUE = 4.50;

    @Override
    public double calculate() {
        return VALUE;
    }
}
