/*
	Swtich��ʽ
	ʵ���������֣������Ӧ������
*/

import java.util.Scanner;
class SwitchDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������Ӧ������(1-7):");
		int x = sc.nextInt();
		
		//��switch�ж����
		switch(x){
			case 1:
				System.out.println("����һ:");
				break;
			case 2:
				System.out.println("���ڶ�:");
				break;
			case 3:
				System.out.println("������:");
				break;
			case 4:
				System.out.println("������:");
				break;
			case 5:
				System.out.println("������:");
				break;	
			case 6:
				System.out.println("������:");
				break;
			case 7:
				System.out.println("������:");
				break;				
			default:
				System.out.println("������������:");
				break;
		}
	}
}