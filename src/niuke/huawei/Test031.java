package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test031{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int un = unentrypt(s);
            System.out.println(un);
        }
    }
    public static int unentrypt(String s){

        char[] sbc = s.toCharArray();

        int maxlen = 0;
        for(int i = 1;i<sbc.length-1;i++){
            int j;
            for(j=1;j+i<sbc.length&&j<=i;j++){
                if(sbc[i-j]!=sbc[i+j]){
                    break;
                }
            }
            maxlen = Math.max(maxlen,j*2-1);
            if(sbc[i]==sbc[i+1]){
                for(j=1;j+i+1<sbc.length&&j<=i;j++){
                    if(sbc[i-j]!=sbc[i+1+j]){
                        break;
                    }
                }
                maxlen = Math.max(maxlen,j*2);
            }
        }
        return maxlen;
    }
}
