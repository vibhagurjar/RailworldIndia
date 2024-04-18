package Arrays;

import java.util.Stack;

public class ReverseArray {
    //Reverse an array without using an extra space
    public static void RevArray(int arr[],int start,int end){

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        System.out.println("Array after reverse without using extra space.");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void RevArrayUsingStack(int arr[]){
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            s.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = s.pop();
        }

        System.out.println("Array after reverse using stack");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        System.out.println("Array before reverse.");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        RevArray(arr,0,4);
//        RevArrayUsingStack(arr);
    }
}
