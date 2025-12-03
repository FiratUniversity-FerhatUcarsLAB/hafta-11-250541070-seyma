public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        ping(bob * 2);
    }

    public static void ping(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        zoop("Hello", 5);
        zoop("World", 10);
    }
}
