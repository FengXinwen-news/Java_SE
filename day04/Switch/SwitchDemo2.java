/*
�����ַ����ж�

Switch��ʽ
String s = sc.nextLine();
*/
import java.util.Scanner;
class SwitchDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���:");
		String s = sc.nextLine();
		
		switch(s){
			case "hello":
				System.out.println("���������hello:");
				break;
			case "world":
				System.out.println("���������world:");
				break;
			case "Thanks":
				System.out.println("���������Thanks:");
				break;
			default:
				System.out.println("���������:");
				break;
		}
		
	}
}