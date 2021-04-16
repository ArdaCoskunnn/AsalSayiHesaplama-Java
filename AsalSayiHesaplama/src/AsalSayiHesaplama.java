import java.util.Scanner;

public class AsalSayiHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		long  i = 2, girilensayi;
		boolean asalmi = true;
		
		System.out.print("Asal olup olmadigi bulunacak sayiyi giriniz ==>");
		girilensayi = input.nextInt();
		
		while(girilensayi < 2) {
			System.out.print("Lutfen gecerli bir sayi giriniz ==> ");
			girilensayi = input.nextInt();
		}
		
		while(girilensayi -1 != i) {
			
			if (girilensayi % i == 0) {
				asalmi = false;				
			}
			i++;
		}
		
		
		if (asalmi == true) {
			System.out.println(girilensayi + " bir asal sayidir.");
		}
		else if(asalmi == false) {
			System.out.println(girilensayi + " bir asal sayi degildir.");
		}
		input.close();
	}

}
