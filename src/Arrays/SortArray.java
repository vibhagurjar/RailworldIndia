package Arrays;

public class SortArray {
    public static void main(String[] args) {

        int arr[] = {3, 2, 5, 7, 4, 67, 34, 22, 4, 5, 89, 90};

        System.out.println("Array before sorting : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Array after sorting : ");

            for (int l = 0; l < arr.length; l++) {
                System.out.print(arr[l] + " ");
            }
    }
}
