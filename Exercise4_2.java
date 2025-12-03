public class Exercise4_2 {

    public static void main(String[] args) {              // 1
        zippo("rattle", 13);                              // 2
    }

    public static void zippo(String quince, int flag) {   // 3
        if (flag < 0) {                                   // 4
            System.out.println(quince + " zoop");         // 5
        } else {                                          // 6
            System.out.println("zippo");                  // 7
            baffle(quince);                               // 8
            System.out.println("flag = " + flag);         // 9
        }
    }

    public static void baffle(String blimp) {             // 10
        System.out.println(blimp + " zoop");              // 11
    }
}
