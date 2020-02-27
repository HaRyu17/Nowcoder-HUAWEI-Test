package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/26 - 15:42
 */
import java.util.Scanner;
public class Test042 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m<2||m>10||n<2||n>10){
                continue;
            }
            int[][] maze = new int[m][n];
            for(int i = 0;i<m; i++){
                for(int j = 0;j<n; j++){
                    maze[i][j] = sc.nextInt();
                }
            }

            int k = 0;
            int l = 0;
            while(k<m){
                while(l<n){
                    if(maze[k][l] == 0){
                        System.out.println("("+k+","+l+")");
                        l++;
                    }else{
                        l--;
                        k++;
                    }
                }

                k++;
                if(l == maze[0].length){
                    l--;
                }
            }
        }
    }
}
