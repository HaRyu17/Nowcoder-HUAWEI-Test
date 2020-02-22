package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/22 - 11:00
 */
import java.util.Scanner;
public class Test013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = reverse(input);
        System.out.println(output);
    }
    public static String reverse(String input){
        String[] st = input.split(" ");
        String output = st[st.length-1];
        for(int i = st.length-2;i>=0; i--){

            output= output+" "+st[i];

        }
        return output;
    }
}
