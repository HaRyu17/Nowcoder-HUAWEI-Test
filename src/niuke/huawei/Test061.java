package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/5/21 - 23:37
 */
import java.util.Scanner;

public class Test061 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            String n = Integer.toBinaryString(num);
            String[] nn = n.split("");
            int count=0;
            int i = 0;
            while (i<nn.length) {
                int x = Integer.parseInt(nn[i]);
                if(x == 1){
                    count++;
                }
                i++;
            }
            System.out.println(count);
        }
    }
}