package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/26 - 15:42
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Test047 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int firstNode = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(firstNode);
            for(int i=1;i<num;i++){
                int node1 = sc.nextInt();
                int node2 = sc.nextInt();
                int index = arr.indexOf(node2);
                arr.add(index+1,node1);
            }
            Object nodeDel = sc.nextInt();
            arr.remove(nodeDel);
            for(int j=0;j<arr.size()-1;j++){
                System.out.print(arr.get(j)+" ");
            }
            System.out.println(arr.get(arr.size()-1)+ " ");
        }
        sc.close();
    }
}
