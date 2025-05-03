package Doctor;

public class Main {
    public static void main(String[] args) {
        Lor lor = new Lor();
        Xirurg xirurg = new Xirurg();
        lor.study();
        lor.davolash();
        xirurg.study();
        xirurg.operatsiya();
    }
}
