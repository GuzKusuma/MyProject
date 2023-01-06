package KegiatanBelajar_5;
import java.util.Scanner;

public class TahunKabisat {
	
	public static void main(String[] args) {
		int Tahun; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Tahun :");
		Tahun = scan.nextInt();
			if (Tahun % 400 == 0 ) {
				System.out.print("\n-----------------\n");
				System.out.print(Tahun + "--Merupakan tahun kabisat!\n");
				
			}else if (Tahun % 100 == 0) {
				System.out.print("\n-----------------\n");
				System.out.print(Tahun + "--Bukanlah tahun kabisat!\n");
			}else if (Tahun % 4 == 0) {
				System.out.print("\n-----------------\n");
				System.out.print(Tahun + "--Merupakan tahun kabisat!\n");
			}else {
				System.out.print("\n-----------------\n");
				System.out.print(Tahun + "--Bukanlah tahun kabisat!\n");
				
			}
	}
}
