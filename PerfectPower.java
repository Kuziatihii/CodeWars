public class PerfectPower {
	public static int[] isPerfectPower(int n) {
		int up = (int)Math.sqrt(n);
		int sqr = n;
		int k = 0;
		for(int m = 2; m <= up; m++) {
			while(sqr % m == 0 && sqr > 1) {
				sqr /= m;
				k++;
			}
			if(sqr == 1) {return new int[] {m, k};}
			sqr = n;
			k = 0;
		}
		return null;
	}
}