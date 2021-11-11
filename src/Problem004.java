
public class Problem004 {
	public static void main(String[] args) {
		int num = 999;
		int i = 0;
		int j = 0;
		int prod = 0;
		int len;
		for(i = 0; i < num; i++) {
			for(j = 0; j <= i; j++) {
				prod = (num - i)*(num - j);
				//System.out.println(prod);
				String prodAsString = String.valueOf(prod);
				len = prodAsString.length();
				//System.out.println(len);
				if(len >= 3) {
					if(prodAsString.charAt(0) == prodAsString.charAt(len -1)){
						if(prodAsString.charAt(1) == prodAsString.charAt(len -2)) {
							if(prodAsString.charAt(2) == prodAsString.charAt(len -3)) {
								System.out.println(prod);
							}
						}
					}
				}
			}
		}
	}
}
