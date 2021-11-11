
public class Problem009 {
	public static void main(String[] args) {
		long c;
		for(int a = 1; a <= 1000; a++) {
			for(int b = 1; b <= 1000; b++) {
				if(a < b) {
					c = a*a + b*b;
					if(c % Math.sqrt(c) == 0 && (a + b + Math.sqrt(c)) == 1000) {
						System.out.println(a);
						System.out.println(b);
						System.out.println(Math.sqrt(c));
					}
				}
			}
		}
	}
}