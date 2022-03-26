public class Abstraction {
    public static void main(String[] args) {
        BMW m3 = new BMW("M3", 25000000);
        Audi r8 = new Audi("R8", 50000000);

        m3.start();
        r8.start();
    }
}

class BMW extends car{

    BMW(String name, int price) {
        super(name, price);
    }

    // @Override
    // void start() {
    //     System.out.println("BMW is starting.");
    // }
}

class Audi extends car{

    Audi(String name, int price) {
        super(name, price);
    }

    // @Override
    // void start() {
    //     System.out.println("Audi is starting.");
    // }

}

abstract class car{

    String name;
    int price;

    car(String name, int price){
        this.name = name;
        this.price = price;
    }

    void start(){
        System.out.println(name+" is starting.");
    }

}
