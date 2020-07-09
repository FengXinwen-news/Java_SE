/*
获取输入三个数字的最大值

*/
import java.util.Scanner;

class ScannerDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字:");
		int a = sc.nextInt();
		System.out.println("请输入第二个数字:");
		int b = sc.nextInt();
		System.out.println("请输入第三个数字:");
		int c = sc.nextInt();
		
		int temp = (a > b)? a:b;
		int x = (temp > c)? temp:c;
		System.out.println("这三个数字中最大数字为:"+x);
		
	}
}