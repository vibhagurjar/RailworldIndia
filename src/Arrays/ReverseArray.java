package Arrays;

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
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        RevArray(arr,0,4);
    }
}
