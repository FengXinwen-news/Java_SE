/*
һ��0.01�׵�ֽ����һֱ�۵����۵��ﵽ���ٴΣ����Դﵽ���������8848�׵ĸ߶�
*/

class DieZhi{
	public static void main(String[] args){
		int count=0;
		int start=1;
		int max=884800;
		while(start<max){
			count++;
			start *=2;
		}
		
		System.out.println("һ����:"+count+"�Σ����Դﵽ���������8848�׵ĸ߶�");
	}
}