package practice;

public class InsertionSort {

	public static void main(String[] args) {
		int []x= { 39,34,54,4,2,6,10};
		int l=x.length;
		System.out.println("Before Insertion Sort : ");
		for(int k:x) {
			System.out.print(k+" ");
		}
		for(int i=1;i<l;i++)
		{
			int temp=x[i];
			int j=i-1;
			for(;j>-1 && x[j]>temp;j--)
			{
				x[j+1]=x[j];
			}
			x[j+1]=temp;
		}
		System.out.println();
		System.out.println("After Insertion Sort : ");
		for(int i:x)
		System.out.print(i+" ");
	}

}
