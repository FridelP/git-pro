public class Main {
    public static void main(String[] args) {

        count("május");
        cheer("C++");
        greet("Greetings");

    }

    public static void count(String count) {
        System.out.println(count);
    }

    public static void greet(String name) {
        System.out.println("Greetings for the" + name);
    }

    public static void cheer(String cheer) {

        System.out.println("Cheer for: "+cheer);

    }
}