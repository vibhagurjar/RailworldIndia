package Exceptions;

public class ArrayOutOfBoundException {
    public static void main(String[] args) {

       try{
           int arr[] = new int[4];
           arr[0] = 1;
           arr[1] = 2;
           arr[2] = 3;
           arr[3] = 4;
           arr[4] = 5;
           for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
           }
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("No Index Found.");
           e.printStackTrace();
           System.out.println(e);

       }



    }
}
