/*
	面试题：
	byte b1=3,b2=4,b;
	b=b1+b2;
	b=3+4
	哪句有问题

	byte b =130;是否有问题？若有，如何解决？
*/
class DataType{
	public static void main(String[] args){
		byte b1=3,b2=4,b;
		//b=b1+b2;      //有问题，byte+byte式转换为int类型，b是Byte
		b=3+4;			//没有问题，先把结果计算出来，看是否在byte的范围内，如果在就不报错
		}
}