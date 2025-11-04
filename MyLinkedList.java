//Nikolay Merenko
//Period 6
// 11/4/2025 - 11/8/2025
// MyLinkedList Program

public class MyLinkedList
{
    private static class ListNode {
        Object value;
        ListNode next;
        ListNode(Object val) {
            value = val;
            next = null;
    }

    private ListNode head;
    private int size;

    private MyLinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public boolean add(Object obj) {
        ListNode newNode = new ListNode(obj); 
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        return true;
    }   
}
