public class Inheritance {
    public static void main(String[] args) {
        Developer d1 = new Developer("Harsh", 22);
        d1.walk();
        d1.age();
        d1.eat();
    }
}

class Developer extends Employee{

    Developer(String name, int age) {
        super(name, age);
    }
}

class Employee{

    String name;
    int age;

    Employee(){
        name = "";
        age = 0;
    }

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    void eat(){
        System.out.println(name+" is eating.");
    }

    void age(){
        System.out.println(name+" is "+age+" years old.");
    }

    void walk(){
        System.out.println(name+" is walking.");
    }
}
