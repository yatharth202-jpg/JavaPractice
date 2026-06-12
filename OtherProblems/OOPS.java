package JavaPractice.OtherProblems;

class Student {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String args[]) {
    Student s1 = new Student();
       s1.name = "John";
       s1.age = 20;
       s1.printinfo();

       Student s2 = new Student();
       s2.name= "Alice";
       s2.age = 22;
       s2.printinfo();
    }
}
