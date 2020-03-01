package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/29 - 16:54
 */
import java.util.Arrays;
import java.util.Scanner;
public class Test057 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int arrSize = sc.nextInt();
            int num = sc.nextInt();
            int[] arr = new int[arrSize];
            for(int i = 0;i<arrSize;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int j =0;j<num;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
