import java.util.*;

public class CoursePlan {
    public void addCourse(String course) {
        // TODO
    }

    public void addRequisite(String course1, String course2) {
        // TODO
    }

    public ArrayList<String> find() {
        // TODO
    }

    public static void main(String[] args) {
        CoursePlan c = new CoursePlan();
        c.addCourse("Ohpe");
        c.addCourse("Ohja");
        c.addCourse("Tira");
        c.addCourse("Jym");
        c.addRequisite("Ohpe","Ohja");
        c.addRequisite("Ohja","Tira");
        c.addRequisite("Jym","Tira");
        System.out.println(c.find()); // [Ohpe,Jym,Ohja,Tira]
        c.addRequisite("Tira","Tira");
        System.out.println(c.find()); // null
    }
}
