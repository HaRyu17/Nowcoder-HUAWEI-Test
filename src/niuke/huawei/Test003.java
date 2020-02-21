package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/21 - 21:37
 */
import java.util.*;
public class Test003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int count = sc.nextInt();
            TreeSet<Integer> arr = new TreeSet<Integer>();
            for(int i=0;i<count;i++){
                arr.add(sc.nextInt());
            }


            for(Integer i:arr){
                System.out.println(i);
            }
        }
    }

}
