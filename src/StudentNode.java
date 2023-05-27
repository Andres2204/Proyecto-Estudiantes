public class StudentNode {
    private String nombre, apellido, carrera, cedula;
    private Cola materias;
    private StudentNode nextStudent;

    //Contructores
    public StudentNode(String nombre, String apellido, String carrera, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.cedula = cedula;
        this.nextStudent = null;
    }

    // Getters and Setters
    public StudentNode getNextStudent() {
        return nextStudent;
    }
    public void setNextStudent(StudentNode nextStudent) {
        this.nextStudent = nextStudent;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Cola getMaterias() {
        return materias;
    }
    public void setMaterias(Cola materias) {
        this.materias = materias;
    }


}