public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Vibha");
         String s1= "Vibha";
         String s2 = "Gurjar";

//         append method is used to append the string into another string
        System.out.println(sb.append(s2));

//        insert method is used to insert a string into a specific index
        System.out.println(sb.insert(2,s2));

//        replace method is used to replace a given string from begIndex to endIndex
        System.out.println(sb.replace(1,3,"Java"));

//        delete method is used to delete string from begIndex to endIndex
        System.out.println(sb.delete(1,3));

//        reverse method is used to reverse the string
        System.out.println(sb.reverse());

//        capacity method is used for returning the capacity of the string
        System.out.println(sb.capacity());

    }
}
