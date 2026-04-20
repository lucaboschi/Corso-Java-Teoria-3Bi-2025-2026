package biblioteca;

public class CollezioneLibri {
    private Libro[] collezione;
    private int count;

    public CollezioneLibri(int dimensione)
    {
        collezione = new Libro[dimensione];     // COMPOSIZIONE
        count = 0;
    }

    
    public CollezioneLibri()
    {
        this(1000);
    }

    public CollezioneLibri(Libro[] collezione)
    {
        this.collezione = new Libro[collezione.length * 2];

        for (int i = 0; i < collezione.length; i++) {
            this.collezione[i] = collezione[i];
        }
    }


    public void add(Libro libro) throws Exception
    {
        /*collezione[count] = libro;
        count++;*/

        // se non un libro, non posso inserirlo
        if (libro == null) {
            throw new Exception("Il libro non può essere null");
        }

        // se la collezione è piena, non posso aggiungere il libro
        if (count == collezione.length) {
            throw new Exception("Collezione piena");
        }

        // se il libro esiste, non lo inserisco
        if (indexOf(libro)>=0) {
            throw new Exception("Il libro esiste già nella collezione");
        }

        collezione[count++] = libro;
    }


    public int indexOf(Libro libro)
    {
        if (libro == null) {
            return -1;
        }

        for (int i = 0; i < count; i++) {
            if (collezione[i].equals(libro)) {
                return i;
            }
        }

        return -1;
    }


    public boolean remove(Libro libro)
    {
        // se non ho un libro, non posso eliminarlo
        if (libro == null) {
            return false;
        }

        // cerco la posizione del libro da eliminare
        int indexLibro = indexOf(libro);

        // se il libro non esiste (cioè ha un indice negativo),
        // non posso eliminarlo: il metodo termina restituendo false
        if (indexLibro<0) {
            return false;
        }

        // se arrivo qui, il libro esiste e ha un dato indice
        // faccio lo shift a sinistra

        for (int i = indexLibro; i < count-1; i++) {
            collezione[i] = collezione[i+1];
        }

        // per evitare problemi di memory leak,
        // imposto a null il valore dell'ultima posizione della collezione
        // in cui stava l'elemento che ho spostato
        collezione[count-1] = null;

        // diminuisco il numero di elementi da considerare
        count--;
        
        return true;

    }

    public boolean removeNoOrder(Libro libro)
    {
        // se non ho un libro, non posso eliminarlo
        if (libro == null) {
            return false;
        }

        // cerco la posizione del libro da eliminare
        int indexLibro = indexOf(libro);

        // se il libro non esiste (cioè ha un indice negativo),
        // non posso eliminarlo: il metodo termina restituendo false
        if (indexLibro<0) {
            return false;
        }

        // se arrivo qui, il libro esiste e ha un dato indice

        // copio l'ultimo libro nella posizione del libro da eliminare 
        collezione[indexLibro] = collezione[count-1];
        
        // per evitare problemi di memory leak,
        // imposto a null il valore dell'ultima posizione della collezione
        // in cui stava l'elemento che ho spostato
        collezione[count-1] = null;

        // diminuisco il numero di elementi da considerare
        count--;
        
        return true;
    }


    public boolean contains(Libro libro){

    }

    public Libro getLibro(int index){

    }

    // restituisce il primo libro che incontra che ha il maggior numero di pagine
    public Libro libroPiuLungo(){

    }

    // restituisce i libri che hanno il maggior numero di pagine
    public Libro[] libriPiuLunghi(){
        
    }

    // unisce, senza duplicati, la collezione passata come parametro
    // alla collezione della classe
    public CollezioneLibri unione(CollezioneLibri altraCollezione){

    }

}
