
// Java
//Linked list - set of basic operations
// ----- MENU DRIVEN PROGRAM -------

import java.util.*;

class Node {
    int val;
    Node next;
    //constructor
    Node(int val) {
        this.val = val; 
    }
}
class LinkedList {
    Node head;
    int size;
    //yahan sara fns banayenge
    void addAtFront(int val) {
        if (head==null) {
            head = new Node(val);
            System.out.print(head.val+" ");
        } else {
            Node newnode = new Node(val);
            newnode.next = head;
            head = newnode;
        }
        size++;
    }
    void addAtEnd(int val) {
        if (head==null) {
            head = new Node(val);
            System.out.print(head.val+" ");
        } else {
            Node newnode = new Node(val);
            Node temp = head;
            while(temp.next!=null) { //last node reached
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = null;
        }
        size++;
    }
    void deleteAtFront() {
        if(head==null) {  //no element
            System.out.print("No element is present..no deletion possible");
        } else {
            head = head.next;
            size--;
        }
        
    }
    void deleteAtEnd() {
        if(head==null) {  //no element
            System.out.print("No element is present..no deletion possible");
        }
        else if (head.next==null) { //one element
            head = null;
        } else {
            Node temp = head;
            while(temp.next.next!=null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }
    void display() {
        Node temp = head;
        while(temp!=null) {
            
            System.out.print(temp.val +" -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    void searchByIndex(int idx) {
        Node temp = head;
        for(int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        System.out.print("Value at index " + idx + " is: " + temp.val);
    }
    void searchByValue(int val) {
        Node temp = head;
        while(temp!=null) {
            if(temp.val==val) {
                System.out.print("Element "+ temp.val + " is present in list...");
                return;
            }
            temp = temp.next;
        }
        System.out.print("Element not present in list...");
    }
    void insertAtIndex(int idx,int val) {
        if(idx==0) {
            addAtFront(val);
            return;
        }
        if(idx==size) {
            addAtEnd(val);
            return;
        }
        Node temp = head;
        for(int i = 0 ;i < idx - 1;i++) {
            temp = temp.next;
        }
        Node newnode = new Node(val);
        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }
    void deleteAtIndex(int idx) {
        if(idx==0) {
            deleteAtFront();
            return;
        }
        if(idx==size-1) {
            deleteAtEnd();
            return;
        }
        Node temp = head;
        for(int i = 0;i<idx-1;i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}

public class LinkedListOperations {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        //Fns call
        while (true) {
            System.out.print(" \n-- Choose  your operation -- \n");
            System.out.println(" 1. Add at front ");
            System.out.println(" 2. Add at End ");
            System.out.println(" 3. Delete at front ");
            System.out.println(" 4. Delete at End ");
            System.out.println(" 5. Display ");
            System.out.println(" 6. Search by index ");  //zero indexing se shuru hoga
            System.out.println(" 7. Search by value ");
            System.out.println(" 8. Insert at any index ");
            System.out.println(" 9. Delete at any index ");
            System.out.println(" 10. Exit");
            System.out.print(" Enter your choice: ");
            int ch = sc.nextInt();
            
            int val;
            int idx;

            switch(ch) {
                case 1:
                    System.out.print("Enter the value: ");
                    val = sc.nextInt();
                    list.addAtFront(val);
                    break;

                case 2:
                    System.out.println("Enter the value: ");
                    val = sc.nextInt();
                    list.addAtEnd(val);
                    break;

                case 3:
                    list.deleteAtFront();
                    break;

                case 4:
                    list.deleteAtEnd();
                    break;

                case 5:
                    list.display();
                    break;

                case 6:
                    System.out.print("Enter the index you want to search: ");

                    idx = sc.nextInt();
                    if (idx >= 0 && idx < list.size) {
                        list.searchByIndex(idx);
                    } else {
                        System.out.print("Index does not exist..");
                    }
                    break;

                case 7:
                    System.out.print("Enter the element you want to search: ");
                    val = sc.nextInt();
                    list.searchByValue(val);
                    break;

                case 8:
                    //firstly checking whether valid index is given or not
                    System.out.print("Enter the index where you want to insert: ");
                    idx = sc.nextInt();
                    if (idx >= 0 && idx <= list.size) {
                        System.out.print("Enter value: ");
                        val = sc.nextInt();
                        list.insertAtIndex(idx,val);
                    } else {
                        System.out.print("Index does not exist..");
                    }
                    break;

                case 9:
                    System.out.print("Enter the index where you want to delete: ");
                    idx = sc.nextInt();
                    if (idx >= 0 && idx < list.size) {
                        list.deleteAtIndex(idx);
                    } else {
                        System.out.print("Index does not exist..");
                    }
                    break;
                
                case 10:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.....");
                    break;
            
            }
        }
        
    }
}
