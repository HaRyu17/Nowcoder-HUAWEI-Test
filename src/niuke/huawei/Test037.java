package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int high = sc.nextInt();
            double fhigh = (double)high;
            double road = 0.0;
            road = (double)(fhigh+fhigh+fhigh*0.5+fhigh*0.25+fhigh*0.125);
            double tall = fhigh*0.0625*0.5;
            System.out.println(road);
            System.out.println(tall);
        }
    }
}
