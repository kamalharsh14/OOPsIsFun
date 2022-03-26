public class Encapsulation {
    public static void main(String[] args) {
        
        // accessing Person class functions from different file just because it is defined public
        Person p1 = new Person();
        p1.name = "Harsh";
        p1.age = 22;

        p1.eat();
        p1.walk();

        // accessing Human class
        Human h1 = new Human("male", "Harsh", 196);
        h1.height();
        h1.gender();
        


    }
}

class Human{

    String gender;
    String name;
    int height;

    Human(String gender, String name, int height){
        this.gender = gender;
        this.name = name;
        this.height = height;
    }

    void gender(){
        System.out.println(name+" is "+gender);
    }

    void height(){
        System.out.println(name+" is "+height+" cm tall");
    }
}
