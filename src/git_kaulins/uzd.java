package git_kaulins;

import java.util.Random;
import java.util.Scanner;

public class uzd {

	public static void main(String[] args) {
		int sk, reizes;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		for (int i=1; i<reizes; i++) {
		sk = rand.nextInt(6)+1; // ieskseejaa pieskaita par +1
		System.out.println("Uzkrita skaitlis: " + sk);
		}
		
		scan.close();
	}

}
