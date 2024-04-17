package Arrays;

import java.awt.image.ComponentSampleModel;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
         int n = sc.nextInt();
         int arr[] = new int[n];
        System.out.println("Enter values to the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = n*(n+1)/2;
        int sum1 = 0;


        for(int i=0;i<n-1;i++){
            sum1+=arr[i];
        }
        System.out.println("Answer is : "+(sum-sum1));
    }
}
