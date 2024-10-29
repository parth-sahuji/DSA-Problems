public class abstraction {
    public static void main(String[] args) {
        System.out.println("HARIOM");
        horse h = new horse();
        h.eat();
        h.walk();
        System.out.println(h.colour);
        h.changecolour();
        System.out.println(h.colour);

        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println(c.colour);
        c.changecolour();
        System.out.println(c.colour);
    }  
}


abstract class animal {

    String colour; 
    animal() {
        colour = "blue";
    }
    void eat() {
        System.out.println("Animal Eats");
    }
    
    abstract void walk();
}

class horse extends animal {
    void changecolour() {
        colour = "Brown";
    }
    void walk() {
        System.out.println("Horse is walking on 4 legs");
    }    
}

class chicken extends animal {
    void walk() {
        System.out.println("chicken is walking on 2 legs");
    }
    void changecolour() {
        colour = "Yellow";
    }
}