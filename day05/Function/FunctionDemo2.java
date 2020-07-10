/*
判断三个数哪个最大
*/
import java.util.Scanner;
class FunctionDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字1:");
		int a = sc.nextInt();
		System.out.println("请输入数字2:");
		int b = sc.nextInt();
		System.out.println("请输入数字3:");
		int c = sc.nextInt();
		
		int result = Max(a,b,c);
		System.out.println("三者数据最大的是:"+result);
		
	}
	
	public static int Max(int a,int b,int c){
		return (a>b)? ((a>c)? a:c) : ((b>c)? b:c);
	}
}