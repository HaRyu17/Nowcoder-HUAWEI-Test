package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/29 - 16:54
 */
import java.util.Scanner;
public class Test054 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num>30000){
                continue;
            }
            int count = 0;
            for(int i = 1;i<=num;i++){
                if(i%7 == 0){
                    count++;
                }else if(i%10 == 7){
                    count++;
                    //反过来先求余再除有一个试例无法通过多1.
                }else if((i/10)%10 == 7){
                    count++;
                }else if((i/100)%10 == 7){
                    count++;
                }else if((i/1000)%10 == 7){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
