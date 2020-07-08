/*

	需求：我准备写一个java程序，把"HelloWorld"这句话输出在控制台
	
	分析：
		A：必须定义类
		B：程序独立，必须定义main方法
		C：使用输出语句
		
	实现：
		A:class定义类  class 类名
		
		B:main方法格式固定
			public static void main(String[] args){
				
			}
		C:输出语句格式固定
			System.out.println("输出的内容")
			
*/
//这是我的HelloWorld案例
class HelloWorld{
	public static void main(String[] args){
		System.out.println("HelloWorld");
	}
}