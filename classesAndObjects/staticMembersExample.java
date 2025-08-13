package classesAndObjects;

class Student {
    String name;
    int id;
    private static int count = 0;
    Student (String name){
        this.name = name;
        id = ++count;
    }
    void print(){
        System.out.println(id + ": " + name);
    }
    static int idCount(){
        return count;
    }
}

public class staticMembersExample {
    public static void main(String[] args) {
        Student p1 = new Student("Jaya");
        Student p2 = new Student("Sassy");
        p1.print();
        p2.print();
        System.out.println(Student.idCount());
    }
}
