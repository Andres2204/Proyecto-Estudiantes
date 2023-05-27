public class StudentList {
    private StudentNode start = null;

    public outputNode[] showStudents() { // returns a string with the list
        StudentNode p = start;

        outputNode[] vec = new outputNode[this.size()];
        int i = 0;
        Float a[];

        while (p != null) {
            for(int j = 0; j<p.getMaterias().getPilasNotas().length; j++) {
                a = p.getMaterias().getPilasNotas()[j].mostrar();
                vec[i] = new outputNode(p.getNombre()+p.getApellido(),p.getCarrera(),p.getCedula(), a, p.getMaterias().getPilasNotas()[j].getName());
            }
            i++;
            p = p.getNextStudent();
        }
        
        return vec;
    }

    public void add_student() {
        if( isEmpty() ) {
            start = new StudentNode("pepito", "alcachofa", "boxeador", "12345678");
        } else {
            StudentNode p = start;
            while(p.getNextStudent() != null) {
                p = p.getNextStudent();
            }
            p.setNextStudent(new StudentNode("pepito", "alcachofa", "boxeador", "12345678"));
        }
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
