import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,2};
        TreeMap <Integer, Integer> map=new TreeMap<>();
        for (int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        List<Integer> l=new ArrayList<>();
        Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer,Integer> entry = itr.next();
            for(Integer i=0;i< entry.getKey() ;i++){
                l.add(entry.getValue());
            }

        }

        System.out.println(l);

    }
}
