

public class App {
    public static void main(String[] args) throws Exception {
        StudentList estudiantes = new StudentList();
        estudiantes.add_student();
        estudiantes.add_student();
        estudiantes.add_student();
        outputNode[] est = estudiantes.showStudents();

        String notas;
        for(int i = 0; i < est.length; i++) {
            
            notas = "\n" + est[i].getfullMateria()[0]+ "\n\tpromedio" + est[i].getfullMateria()[1];
            for (int j = 2; j < 5 ; j++) {
                notas += "\n\t\tNota" + (j-2) +" : "+ est[i].getfullMateria()[j];
            }


            System.out.println(String.format("""
                nombre: %s
                cedula: %s
                carrera: %s
                Notas: %s
                ------------------- \n
            """,
                    est[i].getNombre_completo(),
                    est[i].getCedula(),
                    est[i].getCurso(),
                    notas
                    ));
        }
    }
}
