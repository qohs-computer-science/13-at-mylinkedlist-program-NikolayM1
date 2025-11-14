public class MyLLTester {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        System.out.println("Initial isEmpty(): " + list.isEmpty());
        System.out.println("Initial size(): " + list.size());
        printList(list, "After initial creation:");

        // 10  Objects
        list.add("Object1");
        list.addFirst("Object2");
        list.addLast("Object3");
        list.add("Object4");
        list.add("Object5");
        list.addFirst("Object6");
        list.addLast("Object7");
        list.add("Object8");
        list.add("Object9");
        list.addFirst("Object10");

        System.out.println();
        printList(list, "After adding 10 objects:");

        // Use set method
        Object old = list.set(2, "Object3Modified");
        System.out.println("\nCalled set(2, \"Object3Modified\") -> returned old value: " + old);
        printList(list, "After set:");

        // Use get method 
        Object val = list.get(0);
        System.out.println("\nCalled get(0) -> returned value: " + val);
        printList(list, "After get:");

        // Remove first
        Object removedFirst = list.removeFirst();
        System.out.println("\nCalled removeFirst() -> removed: " + removedFirst);
        printList(list, "After removeFirst:");

        // Remove last
        Object removedLast = list.removeLast();
        System.out.println("\nCalled removeLast() -> removed: " + removedLast);
        printList(list, "After removeLast:");

        // Remove at index
        int removeIndex = 4;
        Object removedAtIndex = list.remove(removeIndex);
        System.out.println("\nCalled remove(" + removeIndex + ") -> removed: " + removedAtIndex);
        printList(list, "After remove(index):");

        // Final state output
        System.out.println("\nFinal size(): " + list.size());
        System.out.println("Final isEmpty(): " + list.isEmpty());
        printList(list, "Final list state:");
    }

    // Prints contents using size() and get(i) so output doesn't depend on toString
    private static void printList(MyLinkedList list, String header) {
        if (header != null && !header.isEmpty()) {
            System.out.println(header);
        }
        int sz = list.size();
        System.out.print("List content (size=" + sz + "): ");
        if (sz == 0) {
            System.out.println("[empty]");
            return;
        }
        for (int i = 0; i < sz; i++) {
            System.out.print(list.get(i));
            if (i < sz - 1) System.out.print(" -> ");
        }
        System.out.println();
    }
}