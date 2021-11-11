public class Problem006 {
	public static void main(String[] args) {
		int num = 100;
		long sumOfSquares = 0;
		long sum = 0;
		for(int i = 1; i <= num; i++) {
			sumOfSquares = sumOfSquares + i*i; 
			sum = sum + i;
		}
		System.out.println((sum*sum) - sumOfSquares);
	}
}
