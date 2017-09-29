package Stacks;

import java.util.LinkedList;
import java.util.Stack;

public class a_basicImplementation
{
    /**
     * Time complexities for operations on Stacks:
     * Push Operation = O(1)
     * Pop Operation = O(1)
     * Search Operation = O(n)     *
     */
    int size;
    int[] stackArray;
    int top;

    //stack constructor
    public a_basicImplementation(int someSize)
    {
        size = someSize;
        stackArray = new int[someSize];
        top = -1;
    }

    //stack push method
    public void push(int intToBePushed)
    {
        stackArray[++top] = intToBePushed;
    }

    //stack pop method
    public int pop()
    {
        int popInt  = stackArray[top--];
        return popInt;
    }

    //stack peek method
    public int peek()
    {
        int peekInt  = stackArray[top];
        return peekInt;
    }

    //stack isEmpty method
    public boolean isEmpty()
    {
        if (top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //stack isFull method
    public boolean isFull()
    {
        if (top == (size - 1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        int size = array.length;
        /***
         *  METHOD 1: STACK IMPLEMENTATION
         ***/
        System.out.println("Stack basic implementation");
        a_basicImplementation basicStack = new a_basicImplementation(size);
        //pushing elements in stack
        for (int i = 0; i < size; i++)
        {
            basicStack.push(array[i]);
        }
        //printing (/popping) elements from stack
        while (!basicStack.isEmpty())
        {
            System.out.print(basicStack.pop());
        }
        System.out.println();
        /***
         *  METHOD 2: LINKED LIST AS A STACK
         ***/
        System.out.println("LinkedList as a Stack");
        LinkedList<Integer> listAsStack = new LinkedList<>();
        //pushing elements in stack
        for (int i = 0; i < size; i++)
        {
            listAsStack.push(array[i]);
        }
        //printing (/popping) elements from stack
        while (!listAsStack.isEmpty())
        {
            System.out.print(listAsStack.pop());
        }
        System.out.println();

        /***
         *  METHOD 2: IN-BUILT STACK
         ***/
        System.out.println("Stack in-built Data Structure");
        Stack inBuiltStack = new Stack();
        //pushing elements in stack
        for (int i = 0; i < size; i++)
        {
            inBuiltStack.push(array[i]);
        }
        //printing (/popping) elements from stack
        while (!inBuiltStack.isEmpty())
        {
            System.out.print(inBuiltStack.pop());
        }
    }
}
