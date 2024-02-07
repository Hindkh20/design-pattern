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
            // Creation of instance (only if it does not exist)
            instance = new SingletonClass();
        }
        return instance;
    }

    // Dans la partie on essai de pour créer une nouvelle instance à chaque appel ce
    // qui va générer une erreur dans le test
    /*
     * public static SingletonClass getInstance() {
     * return new SingletonClass();
     * }
     */
    public void performTask() {
        System.out.println("task performed !");
    }

}
