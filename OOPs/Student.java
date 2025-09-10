package OOPs;

public class Student extends Headmaster {
    
    int roll;
    String name;
    String subject;

    public void detailsStudent() {
        System.out.println("The roll of student is " + roll);
        System.out.println("The name of student is " + name);
        System.out.println("The subject of student is " + subject);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 101;
        s.name = "Rishav";
        s.subject = "Physics";
        s.detailsStudent();
    }
}
