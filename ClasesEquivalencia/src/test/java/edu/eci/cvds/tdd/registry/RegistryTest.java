package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.registry.*;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validarMayoriaDeEdad(){
        Person person = new Person("Nicolas", 1234, 15, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void validarEdad(){
        Person person = new Person("Nicolas", 1234, -40, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void validarExistencia(){
        Person person = new Person("Nicolas", 1234, 40, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validarDuplicado(){
        Person person = new Person("Nicolas", 1234, 40, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Person duplicado = new Person("Nicolas", 1234, 40, Gender.MALE, true);
        RegisterResult nuevo = registry.registerVoter(duplicado);
        Assert.assertEquals(RegisterResult.DUPLICATED, nuevo);
    }

    // TODO Complete with more test cases
}