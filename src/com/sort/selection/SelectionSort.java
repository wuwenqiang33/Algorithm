package com.sort.selection;

/**
 * ѡ������
 * @author william_wu
 *
 */
public class SelectionSort {
	
	
	/**
	 * ԭʼ��
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
	 * �Ż���
	 * @param arr
	 * @return
	 */
	public static int[] sortArray2(int[] arr){
		for(int i=0;i<arr.length;i++){

			int k=i;
			
			for(int j=i+1;j<arr.length;j++){

				if(arr[j]<arr[k]){
					k = j;// ��¼��Сֵ��λ��
				}
			}
			//���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
			if(k!=i){
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
// william_wu33 �޸�
		return arr;

	}
	public static void main(String[] args) {
		int[] arr = sortArray2(new int[]{3,21,1});
		for (int i : arr) {
			
			System.out.println(i);
		}
	}

}
