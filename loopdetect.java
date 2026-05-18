import java.util.*;
public class loopdetect{
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static boolean hasCycle(Node head){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size <= 0){
            System.out.println("0");
            return;
        }
        Node head = null, tail = null;
        for(int i=0; i< size; i++){
            Node newNode = new Node(sc.nextInt());
            if(head == null){
                head = tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }

        }
        int pos = sc.nextInt();
        if(pos > 0 && pos <=size){
            Node temp = head;
            for(int i=1; i<pos && temp != null; i++){
                temp = temp.next;
            }
            if(temp != null){
                tail.next = temp;
            }
        }
        System.out.println(hasCycle(head)?"true":"false");
        
    }
}