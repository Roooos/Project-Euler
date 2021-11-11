public class Problem007 {
	public static void main(String[] args) {
		long sum = 0;
		int c = 0;
		int c2 = 0;
		for(int i = 2; i <= 110000; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					c++;
				}
			}
			if(c == 0) {
				c2++;
				if(c2 == 10001) {
					System.out.println(i);
				}
			}
			c = 0;
		}
	}
}