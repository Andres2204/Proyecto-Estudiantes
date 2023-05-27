public class Cola {
    private Pila punta;

    public Cola() {
        punta = new Pila("Nombre de materia");
        punta.apilar(2);
        punta.apilar(2);
    }

    public void add_materia(String materia) {
        if( isEmpty() ) {
            punta = new Pila();
        } else {
            Pila p = punta;
            while(p.getNextPila() != null) {
                p = p.getNextPila();
            }
            p.setNextPila(new Pila());
        }
    }    

    public Pila desencolar() {
        Pila p = punta;
        punta = punta.getNextPila();
        p.setNextPila(null);
        return p;
    }

    public void encolar(float r) {
        Pila n = new Pila();
        Pila p = punta;
        while(p.getNextPila() != null) {
            p = p.getNextPila();
        }
        p.setNextPila(n);
    }

    public boolean isEmpty() {
        return punta == null;
    }

    public int size() {
        int c = 0;
        Pila p = punta;
        while(p != null) {
            p = p.getNextPila();
            c++;
        }
        return c;
    }



    // getter and setters

    public Pila[] getPilasNotas() {
        Pila p = punta;
        Pila pilas[] = new Pila[size()];
        int i = 0;
        while (p != null) {
            pilas[i] = p;
            i++;
            p = p.getNextPila();
        }

        return pilas;
    }

    public Pila getPunta() {
        return punta;
    }
    public void setPunta(Pila punta) {
        this.punta = punta;
    }
}
