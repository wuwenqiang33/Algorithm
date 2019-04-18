package com.sort.selection;

/**
 * 选择排序
 * @author william_wu
 *
 */
public class SelectionSort {
	
	
	/**
	 * 原始版
	 * @param arr
	 * @return
	 */
	public static int[] sortArray(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]<=arr[j]){
					
				}else{
					int temp ;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		
		return arr;
		
	}
	/**
	 * 优化版
	 * @param arr
	 * @return
	 */
	public static int[] sortArray2(int[] arr){
		for(int i=0;i<arr.length;i++){

			int k=i;
			
			for(int j=i+1;j<arr.length;j++){

				if(arr[j]<arr[k]){
					k = j;// 记录最小值的位置
				}
			}
			//在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
			if(k!=i){
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
// william_wu33 修改
		return arr;

	}
	public static void main(String[] args) {
		int[] arr = sortArray2(new int[]{3,21,1});
		for (int i : arr) {
			
			System.out.println(i);
		}
	}

}
