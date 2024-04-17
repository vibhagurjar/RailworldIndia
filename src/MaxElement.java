package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int arr[] = {2,5,7,3,4};  // static array
        int max=arr[0]; //storing 1st element of array

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
            }
        System.out.println("Maximum element of an array is : "+max);  // output: 7
        }
    }

