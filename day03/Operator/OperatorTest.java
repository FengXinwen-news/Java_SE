/*
	�����⣺
	���Լ�ʵ�������������Ľ���

*/

class OperatorTest{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		System.out.println("a:"+a+"b:"+b);
		
		//����1��ʹ�õ���������
		int c = a;
		a = b;
		b = c;
		System.out.println("a:"+a+"b:"+b);
		System.out.println("==================");
		
		
		//����2����λ���ʵ��
		//���:a,b,a
		//�ұ�:a^b
		a = 10;
		b = 20;
		a = a ^ b; //
		b = a ^ b;//b = a^b^b=a
		a = a ^ b;//a=a^b^a=b
		System.out.println("a:"+a+"b:"+b);
		
		
		a=10;
		b=20;
		//����3��������ӵ�����
		a = a + b;//a=30
		b = a - b;//b=10
		a = a - b;//a=20
		System.out.println("a:"+a+"b:"+b);
		
		
		a=10;
		b=20;
		
		//����4��һ�仰�㶨
		b = (a+b) - (a=b);//b=30-20=10;a=20
		System.out.println("a:"+a+"b:"+b);
	}
}