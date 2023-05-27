public class Cola {
    private Pila punta;

    public Cola() {
        punta = null;
    }

    public void add_materia(String materia) {
        encolar(new Pila(materia));
    }

    public void update_materia() {

    }

    public Pila search_materia(String name) {
        Pila p = punta;
        while(p!=null) {
            if(p.getName() == name) {
                break;
            }

            p = p.getNextPila();
        }
        return p;
    }

    public Pila desencolar() {
        Pila p = punta;
        punta = punta.getNextPila();
        p.setNextPila(null);
        return p;
    }

    public void encolar(Pila n) {
        if ( isEmpty() ){
            punta = n;
            return;
        }

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
