package LinkedList;

import java.util.Scanner;

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

    // print list
    public static void printList()
    {
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
                System.out.print(temp.getData()+ " -> ");
                temp = temp.getNext();
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter LinkedList Size: ");
        int size  = sc.nextInt();
        a_LinkedList list = new a_LinkedList();
        System.out.println("Enter Nodes: ");
        // create list
        if (size <= 1)
        {
            System.out.println("Size <= 1");
            return;
        }
        else {
            Node temp = null;
            int nodeName;
            for (int i = 1; i <= size; i++)
            {
                Node n = new Node(sc.nextInt());
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
        // print list
        list.printList();

    }
}
