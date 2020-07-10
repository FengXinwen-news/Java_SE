/*
求解水仙花树
153=1*1*1+5*5*5+3*3*3

如何获取一个数据的个位，十位，百位，千位...:
gewei = x % 10
shiwei = x/10%10
baiwei = x/10/10%10
qianwei = x/10/10/10%10

*/

class ShuiXianHua{
	public static void main(String[] args){
		
		for(int x=100;x<1000;x++){
			int gewei=x%10;
			int shiwei=x/10%10;
			int baiwei=x/10/10%10;
			if(gewei*gewei*gewei+shiwei*shiwei*shiwei+baiwei*baiwei*baiwei==x){
				System.out.println(x);
			}
		}
	}
}