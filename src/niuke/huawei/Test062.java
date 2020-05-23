package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/5/21 - 23:37
 */
import java.util.Scanner;
public class Test062 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String DNA = sc.nextLine();
            int n = sc.nextInt();
            int max = 0;
            int j = 0;
            for(int i = 0;i<DNA.length()-n;i++){
                String sub = DNA.substring(i,i+n);
                int count = 0;
                for(char CG: sub.toCharArray()){
                    if(CG=='C'||CG=='G'){
                        count++;
                    }
                }
                if(count>max){
                    max = count;
                    j = i;
                }
            }
            System.out.println(DNA.substring(j,j+n));
        }
    }
}
