package KegiatanBelajar_5;
import java.util.Scanner;


public class JumlahDigit {

	public static void main(String[] args) {
		System.out.print("Program Mendeteksi Jumlah Angka");
		System.out.print("\n-----------------------------");
		int Jumlah = 0; 
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("\n Masukan Angka :");
		
		int Angka = myObj.nextInt();
		
		while (Angka !=0 ) {
			Angka /= 10;
			++Jumlah;
		}
		
		System.out.println ("Jumlah Digit Angka adalah :" + Jumlah);
	}
}
