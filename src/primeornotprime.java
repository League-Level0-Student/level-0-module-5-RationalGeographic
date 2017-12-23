import javax.swing.JOptionPane;

public class primeornotprime {
	public static void main(String[] args) {
		String we = JOptionPane.showInputDialog("enter a number to test for prime");
		int hj = Integer.parseInt(we);
		for (int i = 2; i < hj; i++) {
			if(hj % i == 0) {
				System.out.println(hj + " is not prime");
				System.exit(0);
			}
		}
			System.out.println(hj + " is prime");
			
		}
		
	}


