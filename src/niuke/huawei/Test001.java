package niuke.huawei;

import java.util.Scanner;

/**
 * @author Horace
 * @date 2020/2/21 - 21:28
 */

public class Test001{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] arr = str.split("\\s+");
        char[] arrChar = arr[arr.length-1].toCharArray();
        int i = arrChar.length;
        System.out.println(i);

        }
    }

}
