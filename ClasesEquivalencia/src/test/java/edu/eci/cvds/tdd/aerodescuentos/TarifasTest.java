
package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.*;

public class TarifasTest {
    private CalculadorDescuentos calculador = new CalculadorDescuentos();
    
    @Test
    public void validarTarifa(){
        double result = calculador.calculoTarifa(-500, 25, 15);      
        Assert.assertEquals(-500, (int)result);
    }
    
    @Test
    public void validarDias(){
        double result1 = calculador.calculoTarifa(1000, -50000, 21);
        Assert.assertEquals((int)result1, 50000);
        
    }
    
    @Test
    public void validarEdad(){
        double result2 = calculador.calculoTarifa(2000, 30, -20);
        Assert.assertEquals((int)result2,2000);
    }
}
