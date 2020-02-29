package niuke.huawei;

/**
 * @author HaRyu17
 * @date 2020/2/29 - 16:50
 */
import java.util.Scanner;
class ListNode{
    int val;
    ListNode next;
    ListNode(int value){
        this.val = value;
    }
}
public class Test050 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            ListNode phead = new ListNode(sc.nextInt());
            ListNode temp = phead;
            for(int i=0;i<num-1;i++){
                temp.next = new ListNode(sc.nextInt());
                temp = temp.next;
            }
            int k = sc.nextInt();
            if(k==0||k>num){
                System.out.println(0);
                continue;
            }
            FindKthToTail(phead,k);
        }
    }
    public static void FindKthToTail(ListNode phead,int k){
        ListNode otherHead = phead;
        for(int i=0;i<k;i++){
            otherHead = otherHead.next;
        }
        while(otherHead.next!=null){
            otherHead = otherHead.next;
            phead = phead.next;
        }
        System.out.println(phead.next.val);

    }
}
