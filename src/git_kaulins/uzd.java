package git_kaulins;

import java.util.Random;

public class uzd {
	static void mestKaulinu() {
		
		Random rand = new Random();
		int sk = rand.nextInt(6)+1; // ieskseejaa pieskaita par +1
		System.out.println("Uzkrita skaitlis: " + sk);

	}

	public static void main(String[] args) {
		mestKaulinu();
	}

}
