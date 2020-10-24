package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/5/31 - 10:04
 */
//矩阵题
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
public class Test068 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int all = sc.nextInt();
            int order = sc.nextInt();
            ArrayList<Integer> list = new ArrayList();
            LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
            for(int i =0;i<all;i++){
                String name = sc.next();
                int score = sc.nextInt();
                list.add(score);
                map.put(name+" "+score,score);
            }
            Collections.sort(list);
            if(order == 0){
                Collections.reverse(list);
            }
            int m = -1;
            for(int i:list){
                if(m==i){
                    continue;
                }
                for(String key:map.keySet()){
                    if(map.get(key).equals(i)){
                        System.out.println(key);
                    }
                }
                m=i;
            }
        }
    }
}
