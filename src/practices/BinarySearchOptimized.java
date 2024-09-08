package practices;


public class BinarySearchOptimized {
	
	void bubble(int[] arr) {
		int i,j,flag,temp;
		int n=arr.length;
		for(i=0;i<n-1;i++) {
			flag=0;
			for(j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		
	}
	
	 int binarySearch(int arr[], int l, int r, int x)
	    {
	        while (l <= r) {
	            int mid = (l + r) / 2;
	            if (arr[mid] == x) {
	                return mid;
	            } else if (arr[mid] > x) {
	                r = mid - 1;
	            } else {
	              l = mid + 1;
	            }  
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		int[] array= {45,4,5,1,8,69,84,55,100};
		int n=array.length;
		int searchData=100;
		new BinarySearchOptimized().bubble(array);
		int result=new BinarySearchOptimized().binarySearch(array,0,n-1,searchData);
		System.out.println("Sorted Array is : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		if(result==-1) {
			System.out.println("\n"+searchData+" not found in array");
		}else {
			System.out.println("\nsearch element "+searchData+" is avalable at index "+result);
		}
		
		
	}

}