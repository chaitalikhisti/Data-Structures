package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class a_LinkedList
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

    //create list
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

    // print list
    public static void printList()
    {
        System.out.print("Linked List: ");
        Node temp = head;
        while (temp != null)
        {
            if (temp.getNext() == null)
            {
                System.out.print(temp.getData());
                temp = temp.getNext();
            }
            else
            {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LinkedList Size: ");
        int size  = sc.nextInt();
        System.out.println("LinkedList using Method");
        a_LinkedList list = new a_LinkedList();
        System.out.println("Enter Nodes: ");
        /*
            Method 1 : create Linked List from scratch
        */
        // create list
        list.createList(sc, size);
        // print list
        list.printList();
        /*
            Method 2 : create Linked List using Collections
        */
        System.out.println("LinkedList using Collections");
        List<Integer> list1 = new LinkedList<>();
        System.out.println("Enter Nodes: ");
        for (int i = 1; i <= size; i++)
        {
            list1.add(sc.nextInt());
        }
        System.out.println("Linked List: " +list1);
    }
}
