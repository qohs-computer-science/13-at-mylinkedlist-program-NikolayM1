public class MyLLTester.java
{
  public static void main(String [] args){
  MyLinkedList list = new MyLinkedList();

  System.out.println("Initial isEmpty(): " + list.isEmpty());
  System.out.println("Initial size(): " + list.size());
  System.out.println();

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

  
  } // end main
  
} // end class
