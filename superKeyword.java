//package OOPS;

public class superKeyword {
    public static void main(String[] args) {
        System.out.println("HARIOM");
        horse h = new horse();
        System.out.println(h.color);
    }
}
class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor is Called ");
    }
}

class horse extends Animal {
    horse() {
        super.color="Blue";
        System.out.println("HORSE constructor is called");
    }
}