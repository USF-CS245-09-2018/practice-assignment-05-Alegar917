public class MergeSort implements SortingAlgorithm{
	
	public void sort(int[]a){
		mergeSort(a,0,a.length-1);
}
	public void mergeSort(int [] a,int left,int right){
		if(left>=right){
			return;
		}
		int mid=(left+right)/2;
		mergeSort(a,left,mid);
		mergeSort(a,mid+1,right);
		merge(a,left,mid,right);
	}
	public void merge(int []a,int left,int mid,int right){
		int[] temp = new int[a.length];
		for (int i = left; i <=right; i++) {
			temp[i]=a[i];
		}
		int insertindex = left;
   		int lowindex = left;
 		int highindex = mid+1;
 		while (insertindex <= right) {
  		if (lowindex > mid){
    		temp[insertindex++] = a[highindex++];
    	}
 		else if (highindex > right){ 
 			temp[insertindex++] = a[lowindex++];
		}
  		else if (a[lowindex]< a[highindex]){
        temp[insertindex++] = a[lowindex++];
    	}
    else{
         temp[insertindex++] = a[highindex++];
  		}
  	}
    for (insertindex = left; insertindex <= right; insertindex++){
         a[insertindex] = temp[insertindex];
     }

	}
}