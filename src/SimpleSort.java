
/**
 * @author david
 * @date 2018年1月5日  
 * @time 下午9:56:07
 */
public class SimpleSort {
	public static void SimpleSort(int[] arr){
		int length=arr.length;
		int temp;
		for(int i=0;i<length-1;i++){
			int min=i;
			//寻找最小的数
			for(int j=i+1;j<length;j++){
				if(arr[j]<arr[min]){ min=j; }
			}
			if(min!=i){
				temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}				
		}		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] number={3,1,2,8,4,5,24,12};
		SimpleSort(number);
		for(int i=0;i<number.length;i++){
			System.out.print(number[i]+" ");
		}

	}

}
