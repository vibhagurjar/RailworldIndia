public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vibha");
        String s2 = "Gurjar";
        System.out.println(sb.append(s2));
        System.out.println(sb.insert(2,"Vibhaaa"));
//    There are some whoch works same as StringBuffers methods and these methods are-
//        replace(),reverse(),capacity(),ensureCapacity(),charAt(),substring(int beg, int end),substring(int beg)

    }
}
