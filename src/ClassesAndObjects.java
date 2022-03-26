
// This is a Class
public class ClassesAndObjects {

    public static void main(String[] args) {
        
        //Creating 'Person' class object 'p1'
        Person1 p1 = new Person1();
        p1.age = 22;
        p1.name = "Harsh";
        System.out.println("Name = "+p1.name);
        System.out.println("Age = "+p1.age);

        //Creating 'Person' class object 'p12'
        Person1 p2 = new Person1();
        p2.age = 22;
        p2.name = "Kamal";
        System.out.println("\nName = "+p2.name);
        System.out.println("Age = "+p2.age);
    }
}

// This is another Class
class Person1{

    String name;
    int age;


}
