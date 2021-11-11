public class Problem010 {
	public static void main(String[] args) {
		long sum = 0;
		int c = 0;
		for(int i = 2; i <= 20; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					c++;
				}
			}
			if(c == 0) {
				sum = sum + i;
			}
			c = 0;
		}
		System.out.println(sum);
	}
}