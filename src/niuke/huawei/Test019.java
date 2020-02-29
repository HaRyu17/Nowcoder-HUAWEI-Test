package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/22 - 11:00
 */
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
public class Test019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> fm = new LinkedHashMap<String,Integer>();

        while(sc.hasNext()){
            String folder = sc.next();
            int num = sc.nextInt();
            String[] sa = folder.split("\\\\");
            String fn = sa[sa.length-1];
            if(sa[sa.length-1].length()>16){
                fn = fn.substring(fn.length()-16);
            }
            String out = fn + " " + num;
            if(fm.get(out) == null){
                fm.put(out,1);
            }else if(fm.get(out) != null){
                int numout = fm.get(out)+1;
                fm.put(out,numout);
            }
        }
        int count = 0;
        for(String key:fm.keySet()){
            count++;
            if(count >(fm.keySet().size()-8)) {
                System.out.println(key + " " + fm.get(key));
            }
        }

    }

}
