package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;

public class Registry {
    
    public static ArrayList<Integer> registrados = new ArrayList<Integer>();
    
    public RegisterResult registerVoter(Person p) {

        // TODO Validate person and return real result.
        
        if(p.getAge() < 18 && p.getAge() > 0){
            return RegisterResult.UNDERAGE;
        } else if(p.getAge() < 0 && p.getAge() > 150){
            return RegisterResult.INVALID_AGE;
        } else if(p.isAlive() == false){
            return RegisterResult.DEAD;
        }else if((p.getAge() >= 18) && (p.getId() > 0) && (p.isAlive() == true) && (registrados.contains(p.getId())==false)){
            registrados.add(p.getId());
            return RegisterResult.VALID;
        }
        return RegisterResult.DUPLICATED;
    }
}