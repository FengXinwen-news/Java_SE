/*
if-else条件语句
判断输入的数是奇数还是偶数

*/
import java.util.Scanner;
class IfDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int x = sc.nextInt();
		if(x%2==0){
			System.out.println("这是偶数");
		}else {
			System.out.println("这是奇数");
		}
	}
}