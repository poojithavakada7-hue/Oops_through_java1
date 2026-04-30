class Student {
    int id;
    String name;

    Student() {
        id = 0;
        name = "Default";
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Poojitha");

        s1.display();
        s2.display();
    }
}