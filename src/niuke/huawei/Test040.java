package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/26 - 15:42
 */
import java.util.*;

public class Test040 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] m = new int[n];
            int[] x = new int[n];
            for(int i = 0;i<n;i++){
                m[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                x[i] = sc.nextInt();
            }

            Set<Integer> all = new HashSet<Integer>();
            for(int i = 0;i<=x[0];i++){
                all.add(i*m[0]);
            }

            for(int i = 1;i<n;i++){
                List<Integer> list = new ArrayList<Integer>(all);
                for(int j = 1;j<=x[i];j++){
                    for(int k = 0;k<list.size();k++){
                        all.add(list.get(k)+j*m[i]);
                    }
                }
            }
            int num = all.size();
            System.out.println(num);
        }
    }
}
