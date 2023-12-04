public class Main {
    public static void main(String[] args) {
        count("aprilis");
        cheer("Java");
        greet("Greetings","István");
    }

    public static void count(String count) {
        System.out.println(count);
    }

    public static void greet(String name,String lastName) {
        System.out.println(name+lastName);
    }

    public static void cheer(String cheer) {
        System.out.println(cheer);
    }
}