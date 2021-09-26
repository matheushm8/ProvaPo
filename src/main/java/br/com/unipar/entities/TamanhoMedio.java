/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities;

import br.com.unipar.controller.Order;
import br.com.unipar.controller.OrderDecorator;

public class TamanhoMedio extends OrderDecorator {
    
    private double PERCENTAGE = 1.2;
    
    public TamanhoMedio(Order order) {
    super(order);
    }

        @Override
    public double calculate() {
        return super.calculate() * PERCENTAGE; 
    }
    
    }
