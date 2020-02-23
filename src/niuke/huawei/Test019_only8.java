package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/22 - 11:00
 */
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
public class Test019_only8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MaxSizeHashMap<String,Integer> fm = new MaxSizeHashMap<>(8);

        while(sc.hasNext()){
            String folder = sc.next();
            int num = sc.nextInt();
            String[] sa = folder.split("\\\\");
            StringBuffer fn = new StringBuffer();
            if(sa[sa.length-1].length()>16){
                fn.append(sa[sa.length-1].substring(sa.length-16));
            }else{
                fn.append(sa[sa.length-1]);
            }
            String out = fn.toString() + " " + num;
            if(fm.get(out) == null){
                fm.put(out,1);
            }else if(fm.get(out) != null){
                int numout = fm.get(out)+1;
                fm.remove(out);
                fm.put(out,numout);
            }
            System.out.println(fm);
        }
    }

}

class MaxSizeHashMap<K, V> extends LinkedHashMap<K, V> {
    private final int maxSize;

    public MaxSizeHashMap(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }
}

