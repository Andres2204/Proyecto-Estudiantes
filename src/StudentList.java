public class StudentList {
    private StudentNode start = null;

    public outputNode[] showStudents() { // returns a string with the list
        StudentNode p = start;

        outputNode[] vec = new outputNode[this.size()];
        int i = 0;
        Float a[][] = new Float[4][4];
        String[] nombre_materias;
        while (p != null) {
            nombre_materias = new String[p.getMaterias().getPilasNotas().length];
            for(int j = 0; j<p.getMaterias().getPilasNotas().length; j++) { // iterar en todas la devuletas
                nombre_materias[j] = p.getMaterias().getPilasNotas()[j].getName();
                a[j] = p.getMaterias().getPilasNotas()[j].mostrar(); // a = las notas de la pila en posicion j
            }
            vec[i] = new outputNode(p.getNombre()+p.getApellido(),p.getCarrera(),p.getCedula(), a, nombre_materias ,p.getMaterias().getPilasNotas().length);
            i++;
            p = p.getNextStudent();
        }
        
        return vec;
    }

    public void add_student(String nombre, String apellido, String carrera, String cedula) {
        if( isEmpty() ) {
            start = new StudentNode(nombre, apellido, carrera, cedula);
        } else {
            StudentNode p = start;
            while(p.getNextStudent() != null) {
                p = p.getNextStudent();
            }
            p.setNextStudent(new StudentNode(nombre, apellido, carrera, cedula));
        }
    }


    public StudentNode search_student(String cc) {
        StudentNode p = start;
        while(p != null) {
            if (p.getCedula() == cc) {
                break;
            }
            p = p.getNextStudent();
        }
        return p;
    }

    

    // >--------------[ UTILITY ]--------------<

    public boolean isEmpty() { // return true if the list is empty
        return start == null ? true : false;
    }

    public int size() { //return the number of nodes of the list
        StudentNode p = start;
        int counter = 0;
        while (p != null) {
            p = p.getNextStudent();
            counter++;
        }
        return counter;
    }

}
