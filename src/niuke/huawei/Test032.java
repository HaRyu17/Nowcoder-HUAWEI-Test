package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test032 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String IP = sc.nextLine();
            String enIP = sc.nextLine();
            long num = code(IP);
            String unIP = unentrypt(enIP);
            System.out.println(num);
            System.out.println(unIP);
        }
    }
    public static long code(String s){
        String[] ss = s.split("\\.");
        String[] str = new String[4];
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<ss.length;i++){
            str[i] = Long.toBinaryString(Integer.parseInt(ss[i]));
            while(str[i].length()<8){
                str[i] = "0"+str[i];
            }

        }
        for(int i = 0;i<str.length;i++){
            sb.append(str[i]);
        }
        long num = Long.parseLong(sb.toString(),2);
        return num;
    }
    public static String unentrypt(String n){
        Long ln = Long.parseLong(n);
        StringBuffer sb = new StringBuffer();
        sb.append(Long.toBinaryString(ln));
        String sbs = sb.toString();
        while(sbs.length()<32){
            sbs = "0"+sbs;
        }
        int a = Integer.parseUnsignedInt(sbs.substring(0,8),2);
        int b = Integer.parseUnsignedInt(sbs.substring(8,16),2);
        int c = Integer.parseUnsignedInt(sbs.substring(16,24),2);
        int d = Integer.parseUnsignedInt(sbs.substring(24),2);
        String s = a+"."+b+"."+c+"."+d;
        return s;
    }
}
