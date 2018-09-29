public class QuickSort implements SortingAlgorithm{
	public void sort(int[]a){
		quickSort(0,a.length-1,a);
	}
	public void quickSort(int low,int high,int[]a){
		if(low<high){
			int i=low;
			int k=high;
			int piv=low;
			while(i<=k){
				while(i<=high&&a[i]<=a[piv]){
					i++;
				}
				while(k>=i&&a[k]>=a[piv]){
					k--;
				}
				if(i<=k){
					swap(i++,k--,a);
				}
			}
			swap(k,piv,a);
			if(low<k){
				quickSort(low,k-1,a);
			}
			if(k<high){
				quickSort(k+1,high,a);
			}
		}
	}
	public void swap(int i, int k,int[]a){
		int tep=a[i];
		a[i]=a[k];
		a[k]=tep;
	}
}