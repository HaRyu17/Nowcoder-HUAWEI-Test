package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/21 - 21:45
 */
import java.util.Scanner;
public class Test010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int[] arr = new int[128];
        for(int i = 0;i<st.length();i++){
            arr[st.charAt(i)]=1;
        }
        int n = 0;
        for(int i = 0;i<128;i++){
            if(arr[i]==1){
                n++;
            }
        }
        System.out.println(n);
    }
}
