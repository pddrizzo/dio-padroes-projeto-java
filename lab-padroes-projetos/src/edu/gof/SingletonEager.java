package edu.gof;

/*
 * Singleton Apressado
 * 
 * @autor pddrizzo
 */
public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getIntancia() {
        return instancia;
    }

}
