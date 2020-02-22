package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/22 - 11:00
 */
import java.util.*;
public class Test017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String input = sc.nextLine();
            String[] is = input.split(";");
            int x = 0;
            int y = 0;
            for(int i = 0; i<is.length; i++){
                try{
                    if(is[i].charAt(0) == 'A' && is[i].substring(1).matches("[0-9]+")){
                        x -= Integer.parseInt(is[i].substring(1));
                    }
                    if(is[i].charAt(0) == 'S' && is[i].substring(1).matches("[0-9]+")){
                        y -= Integer.parseInt(is[i].substring(1));
                    }
                    if(is[i].charAt(0) == 'W' && is[i].substring(1).matches("[0-9]+")){
                        y += Integer.parseInt(is[i].substring(1));
                    }
                    if(is[i].charAt(0) == 'D' && is[i].substring(1).matches("[0-9]+")){
                        x += Integer.parseInt(is[i].substring(1));
                    }
                }catch(Exception e){
                    continue;
                }

            }
            System.out.println(x+","+y);
        }

    }
}
