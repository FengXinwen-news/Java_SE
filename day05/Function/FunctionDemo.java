/*


*/
import java.util.Scanner;
class FunctionDemo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字:");
		int a = sc.nextInt();
		System.out.println("请输入数字:");
		int b = sc.nextInt();
		
		int result = Max(a,b);
		System.out.println(result);
	}
	
	public static int Max(int a,int b){
		return a > b? a:b;
	}
}