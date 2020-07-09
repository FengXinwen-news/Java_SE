/*
	面试题：
	请自己实现两整数变量的交换

*/

class OperatorTest{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		System.out.println("a:"+a+"b:"+b);
		
		//方法1：使用第三方变量
		int c = a;
		a = b;
		b = c;
		System.out.println("a:"+a+"b:"+b);
		System.out.println("==================");
		
		
		//方法2：用位异或实现
		//左边:a,b,a
		//右边:a^b
		a = 10;
		b = 20;
		a = a ^ b; //
		b = a ^ b;//b = a^b^b=a
		a = a ^ b;//a=a^b^a=b
		System.out.println("a:"+a+"b:"+b);
		
		
		a=10;
		b=20;
		//方法3：变量相加的做法
		a = a + b;//a=30
		b = a - b;//b=10
		a = a - b;//a=20
		System.out.println("a:"+a+"b:"+b);
		
		
		a=10;
		b=20;
		
		//方法4：一句话搞定
		b = (a+b) - (a=b);//b=30-20=10;a=20
		System.out.println("a:"+a+"b:"+b);
	}
}