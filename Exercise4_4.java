public class Exercise4_4 {

    public static int getNumber() {
        return 10;   // değer döndüren metot
    }

    public static void show() {
        System.out.println("boo!");  // void metot
    }

    public static void main(String[] args) {

        // 1. Değer döndüren metodu çağırıp sonucu kullanmazsak?
        getNumber(); // Derleme hatası yok, sadece sonuç kullanılmaz.

        // 2. Void metodu bir ifadenin içinde kullanırsak?
        // Aşağıdaki satır derleme hatası verir çünkü void değer üretmez.
        // System.out.println(show() + 7);
    }
}
