/*
1.�������
*/

class ArrayTest{
	public static void main(String[] args){
		//��������
		//int[] arr = new int[4];
		int[] arr = {123,22,3333,444};
		
		//�������
		System.out.println("�������");
		Bianli(arr);
		System.out.println("==========");
		//Ѱ�����ֵ
		int max = getMax(arr);
		System.out.println("���ֵ:"+max);
		System.out.println("==========");
		//��������
		Inverse(arr);
		Bianli(arr);
		System.out.println("==========");
		reverse(arr);
		Bianli(arr);
		System.out.println("==========");
		//�ҹ̶�������
		int x = getIndex(arr,3333);
		System.out.println(x);
	}
	
	public static void Bianli(int[] arr){
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.println(arr[x]);
				break;
			}
			System.out.print(arr[x]+",");
		}
	}
	
	public static int getMax(int[] arr){
		int max=arr[0];
		for(int x=1;x<arr.length;x++){
			if(max<arr[x]){
				max=arr[x];
			}
		}
		return max;
	}
	
	public static void Inverse(int[] arr){
		for(int x=0;x<arr.length/2;x++){
			int temp=arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x]=temp;
		}
	}
	
	public static void reverse(int[] arr){
		for(int start=0,end=arr.length-1;start<=end;start++,end--){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
	
	public static int getIndex(int[] arr,int value){
		int index=-1;
		for(int x=0;x<arr.length;x++){
			if(arr[x]==value){
				index =x ;
				break;
			}
		}
		return index;
	}
}