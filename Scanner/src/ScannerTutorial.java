import java.util.Scanner;

public class ScannerTutorial {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("l�tefen mesaj giriniz:");
    String mesaj=input.nextLine();
    System.out.println("mesaj�n�z:"+mesaj);
    ScannerTutorial scannerTutorial=new ScannerTutorial();
   scannerTutorial.ikiSayiTopla();
    		
}
       public void ikiSayiTopla() {
    	   Scanner input=new Scanner(System.in);
    	   System.out.println("l�tfen ilk say�y� griniz:");
    	   int sayi1=input.nextInt();
    	   System.out.println("l�tfen ikinci say�y� griniz:");
    	   int sayi2=input.nextInt();
    	   System.out.println("Toplam:"+(sayi1+sayi2));
       }
}
