package git_kaulins;

import java.util.Random;

public class uzd {

	public static void main(String[] args) {
		int sk;
		Random rand = new Random();
		sk = rand.nextInt(6)+1; // ieskseejaa pieskaita par +1
		System.out.println("Uzkrita skaitlis: " + sk);

	}

}
