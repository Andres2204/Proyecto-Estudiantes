public class outputNode {
    private String nombre_completo, curso, cedula;  
    private String[] fullMateria = new String[6];


    public outputNode(String nombre_completo, String curso, String cedula, Float[] notas, String materia) {
        this.nombre_completo = nombre_completo;
        this.curso = curso;
        this.cedula = cedula;
        
        // promedio
        float contador=0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] != null) {
                contador += notas[i];
            }
        }

        this.fullMateria[0] = materia;
        this.fullMateria[1] = String.format("%f", contador/notas.length);
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] == null) {
                this.fullMateria[i+2] = "asd";
            } else {
                this.fullMateria[i+2] = notas[i].toString();
            }
        }

    }
    
    // getters and setters
    public String getNombre_completo() {
        return nombre_completo;
    }
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String[] getfullMateria() {
        return fullMateria;
    }
    public void setfullMateria(String[] fullMateria) {
        this.fullMateria = fullMateria;
    }





}
