public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        String day = "Wednesday";
        int date = 3;
        String month = "December";
        int year = 2025;

        System.out.println("American Format:");
        printAmerican(day, date, month, year);

        System.out.println();

        System.out.println("European Format:");
        printEuropean(day, date, month, year);
    }
}
