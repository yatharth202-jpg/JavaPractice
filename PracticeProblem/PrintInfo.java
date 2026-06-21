package PracticeProblem;

class Student {
    String name;
    int age;

    public void  PI() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student (String name , int age) {
        this.name = name;
        this.age = age;
    }
}

 public class PrintInfo {
    public static void main(String[] args) {
        Student s1 = new Student("Yatharth", 19);
        Student s2 = new Student("Prakhar",20);

        s1.PI();
        s2.PI();
    }
    
}
