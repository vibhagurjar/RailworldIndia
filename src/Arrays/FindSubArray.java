package Arrays;

public class FindSubArray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int count =0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");

                }
                System.out.println();
                count++;
            }
            System.out.println();
        }
        System.out.println("total number of subarrays is:"+count);
    }
}
