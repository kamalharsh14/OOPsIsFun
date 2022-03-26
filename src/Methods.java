
// This is a Class
public class Methods {

    public static void main(String[] args) {
        
        //Creating 'Person' class object 'p1' & 'p2'
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Harsh";
        p2.name = "Kamal";
        p1.age = 22;
        p1.age = 19;

        p1.walk();
        p2.eat();
    }
}

// This is another Class
class Person{

    String name;
    int age;

    public void eat(){
        System.out.println(name+" is eating.");
    }

    public void walk(){
        System.out.println(name+" is walking.");
    }
}
