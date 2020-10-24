package niuke.huawei;

import java.util.Scanner;

/**
 * @author HaRyu17
 * @date 2020/10/24 - 22:46
 */
import java.util.Scanner;
public class Test069 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int[][] A = new int[x][y];
            int[][] B = new int[y][z];
            int[][] C = new int[x][z];
            for (int i = 0; i < x; i++){
                for(int j = 0; j < y; j++){
                    A[i][j] = sc.nextInt();
                }
            }
            for (int j = 0; j < y; j++){
                for(int k = 0; k < z; k++){
                    B[j][k] = sc.nextInt();
                }
            }
            for (int i = 0; i < x; i++){
                for(int k = 0; k < z; k++){
                    int sum = 0;
                    for(int j = 0; j < y; j++){
                        sum += A[i][j]*B[j][k];
                    }
                    C[i][k] = sum;
                    System.out.print(C[i][k] + " ");
                }
                System.out.println( );
            }

        }
        sc.close();
    }
} {
}
