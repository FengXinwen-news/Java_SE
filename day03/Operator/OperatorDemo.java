/*

	�����⣺
	short s=1;s=s+1;
	
	short s=1;s+=1;
	�ĸ�������
	
	�ڶ���û�����⣺
		��չ�ĸ�ֵ�������ʵ������һ��ǿ������ת��
		s+=1
		���ǵȼ���s=s+1
		���ǵȼ���s=(s����������)(s+1)
*/


class OperatorDemo{
	public static void main(String[] args){
		short s=1;
		s+=1;
		System.out.println(s);
	}
}