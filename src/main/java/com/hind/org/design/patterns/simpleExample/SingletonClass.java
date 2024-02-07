package com.hind.org.design.patterns.simpleExample;

public class SingletonClass {

    // variable statique privée pour stocker l'unique instance
    private static SingletonClass instance;

    // Constructeur privé pour empêcher l'instanciation directe
    private SingletonClass() {
        System.out.println("Singleton instance created !");
        // Des initialisations peuvent être ajoutées ici.
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            // Creation of instance only if does not exist
            instance = new SingletonClass();
        }
        return instance;
    }

    public void performTask() {
        System.out.println("task performed !");
    }

}
