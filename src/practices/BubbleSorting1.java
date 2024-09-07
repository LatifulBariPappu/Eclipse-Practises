package practices;

import java.util.Scanner;

public class BubbleSorting1 {
	
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
	public static void main(String[] args) {
		int[] array= {45,4,5,1,8,69,84};
		new BubbleSorting1().bubble(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
