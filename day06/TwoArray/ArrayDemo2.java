/*
二维数组求和
*/

import java.util.Scanner;
class ArrayDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][3];
		for(int x =0;x<arr.length;x++){
			System.out.println("请输入第"+(x+1)+"个季度的收入:");
			for(int y =0;y<arr[x].length;y++){
				arr[x][y]=sc.nextInt();
			}
		}
		System.out.println("这是所有季度的收入");
		for(int x =0;x<arr.length;x++){
			for(int y =0;y<arr[x].length;y++){
				System.out.print(arr[x][y]+",");
			}
			System.out.println();
		}
		int[] sum=new int[4];
		for(int x =0;x<arr.length;x++){
			for(int y =0;y<arr[x].length;y++){
				sum[x] +=arr[x][y]; 
			}
		}
		int total=0;
		for(int x=0;x<sum.length;x++){
			System.out.println("这是第"+(x+1)+"个季度的收入");
			System.out.println(sum[x]);
			total +=sum[x];
		}

		System.out.println("这是一年的总收入");
		System.out.println(total);
		
		
		
	}
}