//Nikolay Merenko
//Period 6
// 11/4/2025 - 11/8/2025
// MyLinkedList Program

public class MyLinkedList
{
    private ListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean add(Object newItem) {
        ListNode newNode = new ListNode(newItem);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
        return true;
    }

    public boolean addFirst(Object newItem) {
        ListNode newNode = new ListNode(newItem);
        newNode.setNext(head);
        head = newNode;
        size++;
        return true;
    }

    public boolean addLast(Object newItem) {
        return add(newItem);
    }

    public Object get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }

        ListNode temp = head;
        int count = 0;
        while (count < i) {
            temp = temp.getNext();
            count++;
        }

        return temp.getValue();
    }

    public Object set(int i, Object newItem) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }

        ListNode temp = head;
        int count = 0;
        while (count < i) {
            temp = temp.getNext();
            count++;
        }

        Object oldValue = temp.getValue();
        temp.setValue(newItem);
        return oldValue;
    }

    public Object remove(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }

        Object removedValue;
        if (i == 0) {
            removedValue = head.getValue();
            head = head.getNext();
        } else {
            ListNode temp = head;
            int count = 0;
            while (count < i - 1) {
                temp = temp.getNext();
                count++;
            }
            removedValue = temp.getNext().getValue();
            temp.setNext(temp.getNext().getNext());
        }

        size--;
        return removedValue;
    }

    public Object removeFirst() {

    if (head == null) {
        return null; 
    }

    ListNode removedNode = head;
    head = head.getNext();
    removedNode.setNext(null);
    size--; 
    return removedNode.getValue();

    }

    public Object removeLast() {
        if (head == null) {
            return null; 
        }

        if (head.getNext() == null) {
            Object value = head.getValue();
            head = null; 
            size--; 
            return value;
        }

        ListNode current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }

        Object value = current.getNext().getValue();
        current.setNext(null); 
        size--; 
        return value;
    }

    public String toString() {
         if (head == null) {
            return "List is empty.";
        }

        StringBuilder result = new StringBuilder();
        ListNode temp = head;
        int index = 0;

        while (temp != null) {
            result.append(index).append(":").append(String.valueOf(temp.getValue()));
            if (temp.getNext() != null) {
                result.append(System.lineSeparator());
            }
            temp = temp.getNext();
            index++;
        }

        return result.toString();
    }
}   
