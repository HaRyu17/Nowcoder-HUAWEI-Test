package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/22 - 11:00
 */
import java.util.*;
public class Test014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> setst = new ArrayList<String>();
        while(sc.hasNext()){
            setst.add(sc.next());
        }
        Collections.sort(setst);
        for(String srt:setst){
            System.out.println(srt);
        }
    }
}
