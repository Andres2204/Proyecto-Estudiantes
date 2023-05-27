

public class App {
    public static void main(String[] args) throws Exception {
        StudentList estudiantes = new StudentList();
        // Estudiante
        estudiantes.add_student("juan", "perez", "sistemas", "123");
        estudiantes.search_student("123").add_materia("math");
        estudiantes.search_student("123").update_grade(1, 2,  "math");
        estudiantes.search_student("123").update_grade(2, 5,  "math");
        estudiantes.search_student("123").update_grade(3, 3,  "math");
        estudiantes.search_student("123").update_grade(4, Float.parseFloat("3.3"),  "math");

        estudiantes.search_student("123").add_materia("algoritmos");
        estudiantes.search_student("123").update_grade(2, 2,  "algoritmos");
        estudiantes.search_student("123").update_grade(4, Float.parseFloat("3.3"),  "algoritmos");

        estudiantes.add_student("juan", "perez", "sistemas", "1234");
        estudiantes.search_student("1234").add_materia("math");
        estudiantes.search_student("1234").update_grade(4, Float.parseFloat("3.3"),  "math");


        outputNode[] est = estudiantes.showStudents();

        String notas;
        for(int i = 0; i < est.length; i++) {
            

            notas = "";
            for (int j = 0; j < est[i].getfullMateria().length ; j++) {
                notas += "\n\t" + est[i].getfullMateria()[j][0]+ ": \n\t\tpromedio: " + est[i].getfullMateria()[j][1];

                for (int k = 2; k < est[i].getfullMateria()[j].length; k++) {
                    notas += "\n\t\tNota " + (k-1) +" : "+ est[i].getfullMateria()[j][k];
                }
            }


            System.out.println(String.format("""
                nombre: %s
                cedula: %s
                carrera: %s
                Notas: %s
                [---------------------------]
            """,
                    est[i].getNombre_completo(),
                    est[i].getCedula(),
                    est[i].getCurso(),
                    notas
                    ));
        }
    }
}
