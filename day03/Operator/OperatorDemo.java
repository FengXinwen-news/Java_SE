/*

	面试题：
	short s=1;s=s+1;
	
	short s=1;s+=1;
	哪个有问题
	
	第二个没有问题：
		扩展的赋值运算符其实隐含了一个强制类型转换
		s+=1
		不是等价于s=s+1
		而是等价于s=(s的数据类型)(s+1)
*/


class OperatorDemo{
	public static void main(String[] args){
		short s=1;
		s+=1;
		System.out.println(s);
	}
}