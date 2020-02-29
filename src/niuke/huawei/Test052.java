package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/29 - 16:50
 */
/*
                            1
                         1  1  1
                      1  2  1  2  1
                   1  1  2  1  2  1  1
                1  2  2  2  1   2  2  2  1
             1  1  1  2
          1  2  1  2
       1  1  2  1
    1  2  2  2
 1  1  1  2
 */
import java.util.Scanner;
public class Test052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num<2){
                System.out.println(-1);
            }else if(num%2 ==1){
                System.out.println(2);
            }else if(num%4 == 0){
                System.out.println(3);
            }else{
                System.out.println(4);
            }
        }
        sc.close();
    }
}
