
/**
 * @author david
 * @date 2018��1��5��  
 * @time ����10:16:19
 */
public class ShellSort {	
	public static void ShellSort(int[] arr){
		int gap=1,i,j,len=arr.length;
		int temp;//�������򽻻�ֵ���ݴ�
		//ȷ����ʼ����
		while(gap<len/3){
			gap=gap*3+1;
		}
		for(;gap>0;gap/=3){//ѭ����������������Ϊ1
			for(i=gap;i<len;i++){//ÿһ��һ����ǰ����������
				temp=arr[i];
				//ÿһ������a[i]�����ұ�a[i]���Ԫ�����������ƶ�
				for(j=i-gap;j>=0&&arr[j]>temp;j-=gap){
					arr[j+gap]=arr[j];
				}
				//a[i]��հף����һ���е����β�������
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
