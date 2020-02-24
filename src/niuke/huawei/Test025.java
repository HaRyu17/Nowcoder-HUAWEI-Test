package niuke.huawei;

/**
 * @author Horace
 * @date 2020/2/23 - 21:37
 */
import java.util.Scanner;
public class Test025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String st = sc.nextLine();
            char[] stc = st.toCharArray();
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i<26;i++){
                char c = (char)(i+'A');
                for(int j=0;j<stc.length;j++){
                    if(stc[j] == c||stc[j] == (char)(c+32)){
                        sb.append(stc[j]);
                    }
                }
            }
            for(int k = 0;k<stc.length;k++){
                if(!(stc[k]>='a'&&stc[k]<='z'||stc[k]>='A'&&stc[k]<='Z')){
                    sb.insert(k,stc[k]);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
