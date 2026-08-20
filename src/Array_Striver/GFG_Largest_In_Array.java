package Array_Striver;

import java.util.Scanner;

public class GFG_Largest_In_Array {
    public static int largest(int[] arr){
        int largest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = largest(arr);

        System.out.println("Largest Element = "+ ans);

    }
}

/*
This is the better solution of the largest number in array
Time Complexity = O(n)
Space Complexity = O(1)
*/
