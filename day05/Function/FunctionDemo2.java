/*
�ж��������ĸ����
*/
import java.util.Scanner;
class FunctionDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������1:");
		int a = sc.nextInt();
		System.out.println("����������2:");
		int b = sc.nextInt();
		System.out.println("����������3:");
		int c = sc.nextInt();
		
		int result = Max(a,b,c);
		System.out.println("��������������:"+result);
		
	}
	
	public static int Max(int a,int b,int c){
		return (a>b)? ((a>c)? a:c) : ((b>c)? b:c);
	}
}