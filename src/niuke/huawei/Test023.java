package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test023 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
            if(input.length()>20){
                continue;
            }
            char[] ca = input.toCharArray();
            int[] num = new int[26];
            int min = Integer.MAX_VALUE;
            for(int i = 0;i<ca.length;i++){
                num[ca[i]-'a']++;
            }
            for(int i = 0;i<num.length;i++){
                if(num[i]!=0&&min>num[i]){
                    min = num[i];
                }
            }
            for(int i = 0;i<ca.length;i++){
                if(num[ca[i]-'a']!=min){
                    System.out.print(ca[i]);
                }
            }
            System.out.println();

        }
    }
}
