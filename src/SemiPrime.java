public class SemiPrime {

	public static boolean check(int number) {
		boolean isSemiprime = false;
		int loop = number / 2;

		if (number != 2) {
			if (number % 2 == 0 && isPrime(loop)) {
				isSemiprime = true;
			} else {
				for (int i = 3; i <= loop; i+=2) {
					if (isPrime(i) && (number % i) != 0 && isPrime(number/i)) {
						isSemiprime = true;
						break;
					}
				}
			}
		}

		return isSemiprime;
	}

	private static boolean isPrime(int n) {
		int loop = n / 2;
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= loop; i+=2) {
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}
