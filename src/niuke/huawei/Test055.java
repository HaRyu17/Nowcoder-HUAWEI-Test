package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/29 - 16:54
 */
import java.util.Scanner;
public class Test055 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num<=0||num>500000){
                System.out.println(-1);
            }
            //至于这里count初始值为什么是-1我也不敢说也不敢问，反正我从0改为-1只有代码就过了[二哈]
            //正解应该是i=1;count=0哈
            int count = -1;
            for(int i = 0;i<=num;i++){
                int sum = 0;
                for(int j = 1;j<i;j++){
                    if(i%j == 0){
                        sum += j;
                    }
                }
                if(sum == i){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
