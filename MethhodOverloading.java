public class MethhodOverloading {
    public static void main(String[] args) {
        System.out.println("HARIOM");
        calculator ca = new calculator();
        System.out.println(ca.sum(1,2));
        System.out.println(ca.sum((float)1.4,(float)2.9));
        System.out.println(ca.sum(1,2,5));
    }
}
// compile time polymorphism

class calculator {
    int sum(int a , int b) {
        return a+b;
    }

    float sum(float a ,float b) {
        return a+b;
    }

    int sum(int a , int b , int c) {
        return a+b+c;
    }
}