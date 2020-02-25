package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test028 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(encrypt(s1));
            System.out.println(unencrypt(s2));
        }

    }
    public static String encrypt(String s){
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<c.length;i++){

            if(c[i]>='a'&&c[i]<'z'){
                sb.append((char)(c[i]-31));
            }else if(c[i]>='A'&&c[i]<'Z'){
                sb.append((char)(c[i]+33));
            }else if(c[i]>='0'&&c[i]<'9'){
                sb.append(c[i]-47);
            }else if(c[i] == 'z'){
                sb.append('A');
            }else if(c[i] == 'Z'){
                sb.append('a');
            }else if(c[i] == '9'){
                sb.append('0');
            }
        }
        String ss = sb.toString();
        return ss;
    }
    public static String unencrypt(String s){
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<c.length;i++){

            if(c[i]>'a'&& c[i]<='z'){
                sb.append((char)(c[i]-33));
            }else if(c[i]>'A'&&c[i]<='Z'){
                sb.append((char)(c[i]+31));
            }else if(c[i]>'0'&&c[i]<='9'){
                sb.append(c[i]-49);
            }else if(c[i] == 'a'){
                sb.append('Z');
            }else if(c[i] == 'A'){
                sb.append('z');
            }else if(c[i] == '0'){
                sb.append('9');
            }
        }
        String ss = sb.toString();
        return ss;
    }
}
