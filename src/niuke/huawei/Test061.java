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
            for(int i = 0;i<nn.length;i++){
                int x = Integer.parseInt(nn[i]);
                if(x == 1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}