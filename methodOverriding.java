public class methodOverriding {
    public static void main(String[] args) {
        System.out.println("HARIOM");
        dear d = new dear();
        d.eat();
    }
}
class animal {
    void eat() {
        System.out.println("Eat Anything");
    }
}

class dear extends animal {
    void eat() {
        System.out.println("Eat only grass"); 
    }
}