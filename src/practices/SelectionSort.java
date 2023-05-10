package practices;

import java.util.Random;

public class SelectionSort {
	 
    static int[] sort(int[] arr) 
    {
    	int N = arr.length;
        int i, j, pos, temp;

        for (i = 0; i < N-1; i++)
        {
            pos = i;

            for (j = i+1; j < N; j++)
            {

                if (arr[j] < arr[pos])
                {
                    pos = j;
                }

            }
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos]= temp;            

        }  
        return arr;

    }

    static void printSequence(int[] sorted_sequence) 

    {
        for (int i = 0; i < sorted_sequence.length; i++) {
            System.out.print(sorted_sequence[i] + " ");
        }
    }

    public static void main(String args[]) 

    {

        System.out.println("Sorting of randomly generated numbers using SELECTION SORT");
        Random random = new Random(); //for using random number sequence
        
        int N = 20;
        int[] sequence = new int[N];


        for (int i = 0; i < N; i++){
            sequence[i] = Math.abs(random.nextInt(1000));

        }

        System.out.println("\nOriginal Sequence: ");
        printSequence(sequence);
        
        System.out.println("\n\n");

        System.out.println("\nSorted Sequence: ");
        printSequence(sort(sequence));
    }

}