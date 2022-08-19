import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("hava durumunu yazınız.");
        int sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinema");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik");
        }
        else if (sicaklik>25){
            System.out.println("Yüzme");
        }
        else
            System.out.println("Girdiğiniz sıcaklık değerine göre bir etkinlik bulunmamaktadır.");

    }
}