package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/5/31 - 8:58
 */


import java.util.HashMap;
import java.util.Scanner;

public class Test065 {

    static HashMap<String, String> commands = new HashMap<String, String>();

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        commands.put("reset board", "board fault");
        commands.put("board add", "where to add");
        commands.put("board delet", "no board at all");
        commands.put("reboot backplane", "impossible");
        commands.put("backplane abort", "install first");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            if (!line.contains(" ")) {
                if ("reset".startsWith(line))
                    System.out.println("reset what");
            } else {
                execute(line);
            }
        }

    }

    private static void execute(String command) {
        String[] keyword = command.split(" ");
        HashMap<String, String> match = new HashMap<String, String>();
        for (String key : commands.keySet()) {
            if (key.startsWith(keyword[0]))
                match.put(key, commands.get(key));
        }

        if(match.size()==0)
        {
            System.out.println("unkown command");
            return;
        }

        String out = "unkown command";
        for (String key : match.keySet()) {
            if (key.split(" ")[1].startsWith(keyword[1])) {
                if (out.equals("unkown command"))
                    out = match.get(key);
                else {
                    System.out.println("unkown command");
                    return;
                }
            }
        }

        System.out.println(out);
    }

}
