
/**
 * @author david
 * @date 2018��1��7��  
 * @time ����1:50:17
 */
/*
 * ����ʵ�ֹ鲢�㷨
 */
public class MergeSortByIteration {
	
	public static void main(String[] args){
		int[] arr={6,5,3,1,8,7,2,4};
		merge_sort_by_iteration(arr);
		for(int i:arr){
			System.out.print(i+" ");
		}
	}

	/**
	 * @param arr
	 */
	private static void merge_sort_by_iteration(int[] arr) {
		int len=arr.length;
		//���ںϲ�����ʱ����
		int[] result=new int[len];
		int block,start;
		
		//�����ϲ�����С���2����ע�����һ��block����len
		for(block=1;block<=len;block*=2){
			//����������ֳɺܶ���飬ÿ�κϲ�����2����
			for(start=0;start<len;start+=2*block){
				int low=start;
				int mid=(start+block)<len?(start+block):len;
				int high=(start+2*block)<len?(start+2*block):len;
				//2�������ʵ�±꼰�����±�
				int start1=low,end1=mid;
				int start2=mid,end2=high;
				//��ʼ��2��block���й鲢����
				while(start1<end1&&start2<end2){
					result[low++]=arr[start1]<arr[start2]?arr[start1++]:arr[start2++];
				}
				while(start1<end1){ result[low++]=arr[start1++]; }
				while(start2<end2){ result[low++]=arr[start2++]; }
				//ÿ�ι鲢��ѽ��result����arr�У�һ�߽����´ι鲢
				int[] temp=arr;
				arr=result;
				result=temp;
			}
			
		}
		
	}
}
