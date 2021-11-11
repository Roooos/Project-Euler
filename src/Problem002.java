
public class Problem002 {
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		int sum = 0;
		while(i <= 4000000) {
			if( i % 2 == 0) {
				sum = sum + i;
			}
			i = i + j;
			j = i - j;
			}
	System.out.print(sum);
	}
}
