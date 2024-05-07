public class stringQue{
    public static void main(String[] args) {
        String s = "                             ge es fo r gee ks    ";

        String ss = s.trim();
        String ans[] = s.split(" ");

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
         


//        String ans = ss.toString();
//        System.out.println(ans);
    }
}
