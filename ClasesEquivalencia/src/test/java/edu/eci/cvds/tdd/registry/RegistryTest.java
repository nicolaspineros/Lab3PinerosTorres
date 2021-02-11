package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.registry.*;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Cristhian", 3579, 21, Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validarMayoriaDeEdad(){
        Person person1 = new Person("Nicolas", 9876, 15, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void validarEdad(){
        Person person2 = new Person("David", 4321, -40, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void validarExistencia(){
        Person person3 = new Person("Sofia", 2468, 20, Gender.FEMALE, false);
        RegisterResult result = registry.registerVoter(person3);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validarDuplicado(){
        Person person4 = new Person("Nicolas", 1234, 40, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person4);
        Person duplicado = new Person("Nicolas", 1234, 40, Gender.MALE, true);
        RegisterResult nuevo = registry.registerVoter(duplicado);
        Assert.assertEquals(RegisterResult.DUPLICATED, nuevo);
    }

    // TODO Complete with more test cases
}