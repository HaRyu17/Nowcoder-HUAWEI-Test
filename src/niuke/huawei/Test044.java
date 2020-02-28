package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/26 - 15:42
 */
import java.util.Scanner;
import java.util.Arrays;
public class Test044 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            String[] str = new String[num];
            for(int i = 0;i<num;i++){
                str[i] = sc.next().toLowerCase();
            }
            for(int j=0;j<num;j++){
                int[] count = new int[26];

                for(int k=0;k<str[j].length();k++){
                    int ascii = str[j].charAt(k);
                    count[ascii-97]++;
                }
                int pld = 0;
                Arrays.sort(count);
                for(int l = 0;l<26;l++){
                    pld += count[l]*(l+1);
                }
                System.out.println(pld);
            }
        }
    }
}

