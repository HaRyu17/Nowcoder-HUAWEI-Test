package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test034 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();

            int start = 1;
            int j = 2;
            for(int i = 0;i<num;i++){
                start +=i;
                System.out.print(start);
                int re = j+start;
                for(int loop = j;loop<=num;loop++){
                    System.out.print(" ");
                    System.out.print(re);
                    re +=loop+1;
                }
                j++;
                System.out.println("");
            }
        }
    }

}
