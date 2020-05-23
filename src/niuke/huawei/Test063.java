package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/5/23 - 16:41
 */
import java.util.Scanner;
public class Test063 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String order = sc.next();

            int dowm = 1;
            for(int i=0; i<order.length(); i++){

                if(order.charAt(i)=='U'){
                    dowm-=1;
                }
                if(order.charAt(i)=='D'){
                    dowm+=1;
                }
            }
            if(dowm>=4){
                System.out.print(dowm-3+" "  );
                System.out.print(dowm-2+" "  );
                System.out.print(dowm-1+" "  );
                System.out.println(dowm+" "  );
                System.out.println(dowm);
            }else if(dowm<-3){
                System.out.print(n+dowm+" "  );
                System.out.print(n+dowm+1+" "  );
                System.out.print(n+dowm+2+" "  );
                System.out.println(n+dowm+3+" "  );
                System.out.println(n+dowm);
            }else if(dowm >= 1){
                System.out.print(1+" " );
                System.out.print(2+" "  );
                System.out.print(3+" "  );
                System.out.println(4+" "  );
                System.out.println(dowm);
            }else{
                System.out.print(n-3+" "  );
                System.out.print(n-2+" "  );
                System.out.print(n-1+" "  );
                System.out.println(n+" "  );
                System.out.println(n+dowm);
            }
        }
    }
}
