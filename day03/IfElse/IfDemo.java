/*
if-else�������
�ж������������������ż��

*/
import java.util.Scanner;
class IfDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����");
		int x = sc.nextInt();
		if(x%2==0){
			System.out.println("����ż��");
		}else {
			System.out.println("��������");
		}
	}
}