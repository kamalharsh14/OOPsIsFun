
// This is a Class
public class Constructor{

    public static void main(String[] args) {
        
        //Creating 'Student' class object 'p1'
        Student p1 = new Student();

        //Creating 'Person' class object 'p12'
        Student p2 = new Student();
    }
}

// This is another Class
class Student{

    //Creating constructor
    public Student(){
        name = "";
        age = 0;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    String name;
    int age;


}
