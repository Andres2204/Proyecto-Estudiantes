public class StudentList {
    private StudentNode start = null;

    

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

    public String showList() { // returns a string with the list
        return "";
    }
}
