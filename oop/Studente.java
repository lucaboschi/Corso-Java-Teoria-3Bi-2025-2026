package oop;

public class Studente {
    // dichiarazione attributi (caratteristiche degli oggetti di tipo Studente)
    // descrivono lo stato interno di uno studente, ossia, come è fatto, da cosa è rappresentanto
    
    /*
    I modificatori di visibilità sono quattro:
    public: visibile ovunque all'interno del progetto
    default: visibile a livello di package
    protected: visibile in una classe e in quelle che da essa ereditano
    private: visibile solo all'interno della classe (in generale, solo all'interno del contenitore
    in cui è definita) 
    */

    public String nome;
    private String cognome;
    protected double mediaVoti;
    int annoNascita;

    // dichiarazione metodi (funzionalità di un generico Studente)
}
