
/**
 * @author david
 * @date 2018年1月5日  
 * @time 下午10:16:19
 */
public class ShellSort {	
	public static void ShellSort(int[] arr){
		int gap=1,i,j,len=arr.length;
		int temp;//插入排序交换值的暂存
		//确定初始步长
		while(gap<len/3){
			gap=gap*3+1;
		}
		for(;gap>0;gap/=3){//循环遍历步长，最后必为1
			for(i=gap;i<len;i++){//每一列一次向前做插入排序
				temp=arr[i];
				//每一列中在a[i]上面且比a[i]大的元素依次向下移动
				for(j=i-gap;j>=0&&arr[j]>temp;j-=gap){
					arr[j+gap]=arr[j];
				}
				//a[i]填补空白，完成一列中的依次插入排序
				arr[j+gap]=temp;
			}			
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] number={13,14,94,33,82,25,59,94,65,23,45,27,73,25,39,10};
		ShellSort(number);
		for(int i=0;i<number.length;i++){
			System.out.print(number[i]+" ");	
		}		
	}
}
