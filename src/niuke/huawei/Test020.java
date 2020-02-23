package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.next();
            if(inputLength(input)&&abcABC(input)&&rep(input)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
    public static boolean inputLength(String input){
        if(input.length()>8){
            return true;
        }else{
            return false;
        }

    }
    public static boolean abcABC(String input){
        char[] asd = input.toCharArray();
        int num = 0;
        int aaa = 0;
        int AAA = 0;
        int $$$ = 0;
        int all = 0;
        for (int i = 0;i<asd.length;i++){
            if(asd[i]>='a'&&asd[i]<='z'){
                aaa = 1;
            }else if(asd[i]>='A'&&asd[i]<='Z'){
                AAA = 1;
            }else if(asd[i]>='0'&&asd[i]<='9'){
                num = 1;
            }else{
                $$$ = 1;
            }
        }
        all = num+aaa+AAA+$$$;
        return all > 2 ? true : false;
    }
    public static boolean rep(String input){
        for(int i = 0;i<input.length()-2;i++){
            String st = input.substring(i,i+3);
            if(input.substring(i+3).contains(st)){
                return false;
            }
        }
        return true;
    }
}
