/*
输入字符串判断

Switch格式
String s = sc.nextLine();
*/
import java.util.Scanner;
class SwitchDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串:");
		String s = sc.nextLine();
		
		switch(s){
			case "hello":
				System.out.println("你输入的是hello:");
				break;
			case "world":
				System.out.println("你输入的是world:");
				break;
			case "Thanks":
				System.out.println("你输入的是Thanks:");
				break;
			default:
				System.out.println("你输入错误:");
				break;
		}
		
	}
}