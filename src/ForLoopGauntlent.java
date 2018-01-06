
public class ForLoopGauntlent {

	public static void main(String[] args) {
		/*
		 * #1 for(int i = 0; i < 101; i++) { System.out.println(i); } #2 for (int i =
		 * 100; i > 0; i--) { System.out.println(i); } #3 for (int i = 2; i < 101; i++)
		 * { if(i%2==0) { System.out.println(i); }
		 * 
		 * } #4 for (int i = 1; i < 100; i++) { if(i%2==1) { System.out.println(i); } }
		 * #5 for (int i = 0; i < 501; i++) { if(i%2==0) { System.out.println(i +
		 * " is even"); } else{ System.out.println(i + " is odd"); } } #6 for (int i =
		 * 1; i < 778; i++) { if(i%7==0) { System.out.println(i); }
		 * 
		 * } #7 for (int i = 1; i < 14; i++) { System.out.println("in " +(i + 2004) +
		 * " I was " + i + " years old" ); }
		 * 
		 * for (int i = 0; i < 100; i++) { for (int j = 0; j < 3; j++) {
		 * System.out.println(i + " " +j); }
		 * 
		 * 
		 * }
		 * 
		 * for (int i = 0; i < 3; i++) {
		 * 
		 * for (int j = 1; j < 4; j++) { System.out.print(j + (i*3)); if(j==3) {
		 * System.out.print("\n"); } }
		 * 
		 * }
		 * 
		 * for (int i = 0; i < 10; i++) {
		 * 
		 * for (int j = 1; j < 11; j++) { System.out.print(j + (i * 10)); if (j == 10) {
		 * System.out.print("\n"); } }
		 * 
		 * }
		 * 
		 * String hi = "*"; String we = ""; for (int i = 0; i < 6; i++) { if (i == 0) {
		 * we = we + hi; } else { we = we + " " + hi; } System.out.println(we); }
		 */
		for (int i = 0; i <= 100; i++) {
			System.out.println(100 - i);
		}
	}

}
