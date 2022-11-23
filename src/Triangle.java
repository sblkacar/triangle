import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int line1;
        int line2;
        int line3;
        int area;
        int circumference;

        Scanner input=new Scanner(System.in);
        System.out.println("Birinci kenar uzunluğunu giriniz");
        line1=input.nextInt();
        System.out.println("İkinci Kenar Uzunluğunu giriniz");
        line2=input.nextInt();
        System.out.println("Üçüncü Kenar Uzunluğunu giriniz:");
        line3=input.nextInt();
        circumference=(line1+line2+line3)/2;
        area=(circumference*(circumference-line1)*(circumference-line2)*(circumference-line3));
        System.out.println("Üçgenin Alanı: "+ Math.sqrt(area));  // Math.sqrt(); karekök almak için kullanılan fonksiyon


    }
}
