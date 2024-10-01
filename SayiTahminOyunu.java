import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        // Rastgele bir sayı oluşturmak için Random sınıfını kullan
        Random random = new Random();
        int tutulanSayi = random.nextInt(100) + 1; // 1 ile 100 arasında rastgele sayı
        int tahminSayisi = 0;  // Kullanıcının kaç tahmin yaptığını tutan değişken
        int tahmin = 0;  // Kullanıcının tahminini tutacak değişken
        
        // Kullanıcıdan tahmin almak için Scanner sınıfını kullan
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1 ile 100 arasında bir sayı tuttum. Bu sayıyı tahmin edebilir misin?");
        
        // Doğru sayı tahmin edilene kadar döngü devam edecek
        while (tahmin != tutulanSayi) {
            System.out.print("Tahminini yaz: ");
            tahmin = scanner.nextInt();
            tahminSayisi++;
            
            // Tahmin kontrolü
            if (tahmin < tutulanSayi) {
                System.out.println("Daha büyük bir sayı dene.");
            } 
            else if (tahmin > tutulanSayi) {
                System.out.println("Daha küçük bir sayı dene.");
            } 
            else {
                System.out.println("Tebrikler! Sayıyı doğru tahmin ettin.");
                System.out.println("Toplam " + tahminSayisi + " denemede sayıyı buldun.");
            }
        }
        
        scanner.close();
    }
}
