/*
·½·¨ÖØÔØ
*/

class FunctionDemo3{
	public static void main(String[] args){
		byte a=1;
		byte b=2;
		int c=3;
		int d=4;
		long e = 1111111;
		long f = 2222222;
		System.out.println(compare(a,b));
		System.out.println(compare(c,d));
		System.out.println(compare(e,f));
	}
	
	public static boolean compare(byte a,byte b){
		return a==b;
	}
	
	public static boolean compare(short a,short b){
		return a==b;
	}
	
	public static boolean compare(int a,int b){
		return a==b;
	}
	
	public static boolean compare(long a,long b){
		return a==b;
	}
}