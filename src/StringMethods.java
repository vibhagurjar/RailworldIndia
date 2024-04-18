public class StringMethods {
    public static void main(String[] args) {
        String s = "Vibha Gurjar";
        //charAt() method in used to fetch a character from a specific index of the string

        //length() method is used for return the length of the string

        //use of length method
        int n = s.length();
        System.out.println("Length of string (Vibha Gurjar) is: "+n);

        //substring(int beg.) it returns substring begining from the given index
        String sub = s.substring(3);
        System.out.println("substring begininig from index 3 : "+sub);

        //substring(int beg,int end) it gives substring begining from given index and end to endIndex
        String subS = s.substring(3,8);
        System.out.println("Substring from given begining to end index: "+subS);

        String ans = s.concat("@RailWorld");
        System.out.println("Conacte methods: "+ans);

        String a1 = s.replace('a','s');
        System.out.println("Replace mathod: "+a1);

    //lowercase and uppercase methods are used to change our string into uppercase and lowercase
    // toUpperCase() & toLowerCase()
        String[] parts = s.split("i");

      for(String ss:parts){
          System.out.print(" "+ss);
      }
    }
}
