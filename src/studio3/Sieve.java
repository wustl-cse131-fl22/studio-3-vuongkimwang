package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		boolean[] numBoo = new boolean[n - 1];
		
		
		// Set everything to true
		for(int r = 0; r < numBoo.length; r++) {
			numBoo[r] = true;
		}
		
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(numBoo[i]) {
				for(int j = i^2; j < n; j += i) {
					numBoo[j] = false;
				}
			}
		}
		
		for(int i = 0; i < numBoo.length; i++) {
			if(numBoo[i]) {
				System.out.println(i);
			}
		}
	}
}
