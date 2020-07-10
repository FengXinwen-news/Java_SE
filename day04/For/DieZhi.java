/*
一张0.01米的纸，可一直折叠，折叠达到多少次，可以达到珠穆朗玛峰8848米的高度
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
		
		System.out.println("一共叠:"+count+"次，可以达到珠穆朗玛峰8848米的高度");
	}
}