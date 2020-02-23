package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        String pw = encrypt(password);
        System.out.println(pw);
    }
    public static String encrypt(String password){
        char[] pwc = password.toCharArray();
        String ss = "";
        for(int i = 0;i<pwc.length;i++){
            if(pwc[i]>='0'&&pwc[i]<='9'){
                ss = ss + pwc[i];
            }else if(pwc[i]>='a'&&pwc[i]<='c'){
                ss = ss + '2';
            }else if(pwc[i]>='d'&&pwc[i]<='f'){
                ss = ss + '3';
            }else if(pwc[i]>='g'&&pwc[i]<='i'){
                ss = ss + '4';
            }else if(pwc[i]>='j'&&pwc[i]<='l'){
                ss = ss + '5';
            }else if(pwc[i]>='m'&&pwc[i]<='o'){
                ss = ss + '6';
            }else if(pwc[i]>='p'&&pwc[i]<='s'){
                ss = ss + '7';
            }else if(pwc[i]>='t'&&pwc[i]<='v'){
                ss = ss + '8';
            }else if(pwc[i]>='w'&&pwc[i]<='z'){
                ss = ss + '9';
            }else if(pwc[i]>='A'&&pwc[i]<='Y'){
                ss = ss +(char)(Integer.valueOf(pwc[i])+33);
            }else if(pwc[i] == 'Z'){
                ss = ss + 'a';
            }
        }

        return ss;
    }
}
