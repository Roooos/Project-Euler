
public class Problem003 {
	public static void main(String[] args) {
		double num = 600851475143.0;
		for(int i = 2; i <= num; i++) {
			while(num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
		System.out.println(num);
	}
}
