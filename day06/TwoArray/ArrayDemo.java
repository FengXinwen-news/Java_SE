/*
二维数组遍历
*/

class ArrayDemo{
	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5},{7}};
		for(int x =0;x<arr.length;x++){
			for(int y =0;y<arr[x].length;y++){
				System.out.print(arr[x][y]+",");
			}
			System.out.println();
		}
		
	}
}