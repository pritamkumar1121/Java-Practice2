import java.util.LinkedList;

public class CheckLinkedList {
 public static void main(String[] args) {

    
    LinkedList<String> linkedlist = new LinkedList<String>();
 
   
    linkedlist.add("AA");
    linkedlist.add("BB");
    linkedlist.add("CC");
    linkedlist.add("DD");
    linkedlist.add("EE");

    
    if (linkedlist.contains("CC")) {
       System.out.println("Element CC is present in List");
    } else {
       System.out.println("List doesn't have element CC");
     }
    
 
    if (linkedlist.contains("FF")) {
       System.out.println("Element FF is present in List");
    } else {
        System.out.println("List doesn't have element FF");
      }
 }
}