public static int pow(int n, int m) {
		if(m == 0)
			return 1;
		int a = pow(n, m/2);
		if(m % 2 == 0)
			return a *  a;
			
		return n * a *  a;
	}