public class Cola {
    private Pila punta;

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

    // getter and setters
    public Pila getPunta() {
        return punta;
    }
    public void setPunta(Pila punta) {
        this.punta = punta;
    }
}
