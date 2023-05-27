import java.util.Arrays;

public class Pila {
    private String name;
    private GradeNode Punta;
    private int limite, tope;
    private Pila NextPila;

    // Metodos Principales
    public Float[] mostrar() {
        // Se usa un array de objetos Float para usar null como diferenciador entre 0 y 0 real
        Float[] a = new Float[limite];
        Arrays.fill(a, null);

        Pila pilaAux = new Pila();
        float aux = 0;
        while (!pilaVacia()){
            pilaAux.apilar(this.desapilar());
        }
        pilaAux.invertir();
        int i = 0;
        while(!pilaAux.pilaVacia()) {
            aux = pilaAux.desapilar();
            this.apilar(aux);
            a[i] = aux;
            i++;
        }
        return a; 
    }

    public void vaciar() {
        while(!pilaVacia()) {
            desapilar();
        }
    }

    public void apilar(float d) {
        
    }

    public float desapilar() {
        return 0;
    }

    public void invertir () {
        Pila aux1 = new Pila();
        Pila aux2 = new Pila();

        while(!pilaVacia()) {
            aux1.apilar(this.desapilar());
        }
        while(!aux1.pilaVacia()) {
            aux2.apilar(aux1.desapilar());
        }

        while(!aux2.pilaVacia()) {
            this.apilar(aux2.desapilar());
        }
    }

    public void pasar(Pila P){
        while(!P.pilaLlena()) {
            this.apilar(P.desapilar());
        }

    }

    // Utilidad
    public boolean pilaLlena() {
        return tope == limite-1 ? true : false;
    }
    public boolean pilaVacia() {
        return tope == -1 ? true : false;
    }

    // Constructor
    public Pila () {   
        Punta = null;
        limite = 4;
        tope = -1;
        NextPila = null;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Pila getNextPila() {
        return NextPila;
    }
    public void setNextPila(Pila nextPila) {
        NextPila = nextPila;
    }
    public GradeNode getPunta() {
        return Punta;
    }
    public void setPunta(GradeNode punta) {
        Punta = punta;
    }
    public int getLimite() {
        return limite;
    }
    public int getTope() {
        return tope;
    }
    public void setTope(int tope) {
        this.tope = tope;
    }    
}
