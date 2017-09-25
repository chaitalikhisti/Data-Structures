package LinkedList;

import java.util.*;

public class b_reverseLinkedList
{
    static Node head;
    public Node getHead()
    {
        return head;
    }
    public void setHead(Node someHead)
    {
        this.head = someHead;
    }

    //create class node
    static class Node
    {
        private int data;
        private Node next;

        public int getData()
        {
            return data;
        }
        public void setData(int someData)
        {
            this.data = someData;
        }
        public Node getNext()
        {
            return next;
        }
        public void setNext(Node nextNode)
        {
            this.next = nextNode;
        }
        public Node(int someData)
        {
            super();
            this.data = someData;
        }
    }

    // print list
    public static void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            if (temp.getNext() == null)
            {
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
            else
            {
                System.out.print(temp.getData()+ " ");
                temp = temp.getNext();
            }
        }
    }

    //create linked list
    public static void createList(Scanner scan, int listSize)
    {
        if (listSize <= 1)
        {
            System.out.println("Size <= 1");
            return;
        }
        else {
            Node temp = null;
            int nodeName;
            for (int i = 1; i <= listSize; i++)
            {
                Node n = new Node(scan.nextInt());
                if (head == null)
                {
                    head = n;
                    temp = head;
                }
                else
                {
                    temp.setNext(n);
                    temp = n;
                }
            }
        }
    }

    //reverse linked list
    public static void reverseList()
    {
        Node previous = null;
        Node next = head;
        Node current = null;
        while (next != null)
        {
            current = next;
            next = next.getNext();
            current.setNext(previous);
            previous = current;
        }
        head = current;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LinkedList Size: ");
        int size  = sc.nextInt();
        b_reverseLinkedList rlist = new b_reverseLinkedList();
        System.out.println("Enter Nodes: ");
        // create list
        rlist.createList(sc, size);
        //print original list
        System.out.println("Linked List: ");
        rlist.printList();
        //reverse the list
        rlist.reverseList();
        //print reversed list
        System.out.println("Reversed Linked List: ");
        rlist.printList();
    }
}
