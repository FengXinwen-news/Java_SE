/*
��ȡ�����������ֵ����ֵ

*/
import java.util.Scanner;

class ScannerDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		System.out.println("���������������:");
		int c = sc.nextInt();
		
		int temp = (a > b)? a:b;
		int x = (temp > c)? temp:c;
		System.out.println("�������������������Ϊ:"+x);
		
	}
}