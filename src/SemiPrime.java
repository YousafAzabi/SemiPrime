import java.util.Scanner;

public class SemiPrime {
	public static boolean check(int number) {
		int loop = number / 2;

		if ((number != 2) && (number % 2) == 0 && isPrime(loop)) {
			return true;
		}
		for (int i = 3; i <= loop; i+=2) {
			if (isPrime(i) && (number % i) == 0 && isPrime(number/i)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isPrime(int n) {
		int loop = n / 2;
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= loop; i+=2) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    SemiPrime semiPrime = new SemiPrime();

    System.out.println("This program checks if a number is Semi-Prime.\n  Enter 0 to EXIT");
    System.out.print("Enter a number: ");
    int num = in.nextInt();

    while (num != 0) {
      if (semiPrime.check(num)) {
        System.out.println("  " + num + "  Semi-Prime number.");
      } else {
        System.out.println("  " + num + "  NOT Semi-Prime number.");
      }
			System.out.print("Enter a number: ");
			num = in.nextInt();
    }
  }
}
