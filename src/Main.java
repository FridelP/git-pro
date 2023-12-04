public class Main {
    public static void main(String[] args) {
        count("aprilis");
        cheer("Java","assholes");
        greet("Greetings");
    }

    public static void count(String count) {
        System.out.println(count);
    }

    public static void greet(String name) {
        System.out.println(name);
    }

    public static void cheer(String cheer,String param) {
        System.out.println(cheer+param);
    }
}