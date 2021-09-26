
package br.com.unipar.runner;

import br.com.unipar.entities.flavor.*;
import br.com.unipar.controller.Order;
import br.com.unipar.entities.*;
import br.com.unipar.entities.additional.*;

public class Main {
    public static void main(String[] args) {
        
      
       Order teste =  new LeiteCondensado (new Biscoito(new TamanhoGrande(new Café ())));
        
        System.out.println("O valor do seu pedido é de:" + teste.calculate());
        
       Order teste2 =  new ChocolatePo (new GeloCreme(new TamanhoMedio(new Moca ())));
        
        System.out.println("O valor do seu pedido é de: " + teste2.calculate());
        
       Order teste3 =  new RaspasLimao (new CanelaPó(new TamanhoGrande(new EspressoPanna ())));
        
        System.out.println("O valor do seu pedido é de: " + teste3.calculate());
        
    }
}
