//package OOPS;

public class practice1 {
    public static void main(String[] args) {
        System.out.println("HARIOM");

        BankAccount bk = new BankAccount();
        bk.username="Chaman";
        System.out.println(bk.username);
        // bk.password="poly";

        bk.setpassword("poly");

        System.out.println(bk.getPassword());
    }
}


class BankAccount {
    public String username;
    private String password;

    public void setpassword (String pass) {
        password = pass;
    }

    public String getPassword() {
        return password;
    }
}