package program;

public class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("Eating..");
    }
    public static void main(String[] args){
        People person1 = new People("John", 20);
        System.out.println(person1.name);
    }
}
//class Student extends People{
//    double average;
//
//    public Student(String name, int age){
//        super(name, age);
//
//    }
//}
