import java.util.Scanner;

public class ScannerTutorial {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("lütefen mesaj giriniz:");
    String mesaj=input.nextLine();
    System.out.println("mesajýnýz:"+mesaj);
    ScannerTutorial scannerTutorial=new ScannerTutorial();
   scannerTutorial.ikiSayiTopla();
    		
}
       public void ikiSayiTopla() {
    	   Scanner input=new Scanner(System.in);
    	   System.out.println("lütfen ilk sayýyý griniz:");
    	   int sayi1=input.nextInt();
    	   System.out.println("lütfen ikinci sayýyý griniz:");
    	   int sayi2=input.nextInt();
    	   System.out.println("Toplam:"+(sayi1+sayi2));
       }
}
