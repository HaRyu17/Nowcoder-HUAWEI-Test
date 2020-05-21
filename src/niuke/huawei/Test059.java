package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/29 - 16:54
 */
import java.util.Scanner;
public class Test059 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input = sc.nextInt();
            for(int x = 0;x<input;x++){
                int small = (int)(input-x)/2;
                int big = (int)(input+x)/2;
                int scount = 0;
                int bcount = 0;
                for(int i = 2;i<small;i++){
                    if(small%i == 0){
                        scount+=1;
                        break;
                    }
                }
                for(int i = 2;i<big;i++){
                    if(big%i == 0){
                        bcount+=1;
                        break;
                    }
                }
                int count = scount+bcount;

                if(count>0){
                    continue;
                }else if(count == 0){
                    System.out.println(small);
                    System.out.println(big);
                    break;
                }
            }

        }
        sc.close();
    }
}
