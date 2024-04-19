package Arrays;

public class MaxSumOfSubarray {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum+=arr[k];

                }
                System.out.println("sum :"+sum);
                if(sum>max){
                    max=sum;
                }
            }

        }
        System.out.println("Max sum is : "+max);
    }
}
