package Strings;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class b_stringReverse
{
    static String arrayRevert(String[] stringArray)
    {
        String revertedString = "";
        for (int i = stringArray.length - 1; i >= 0; i--)
        {
            revertedString += stringArray[i] + " ";
        }
        return revertedString;
    }

    static String linkedListRevert(String[] stringArray)
    {
        String revertedString = "";
        LinkedList<String> stringList = new LinkedList<>();
        for (int i = 0; i < stringArray.length; i++)
        {
            stringList.add(stringArray[i]);
        }
        Iterator<String> stringListIterator = stringList.descendingIterator();
        while (stringListIterator.hasNext())
        {
            revertedString += stringListIterator.next() + " ";
        }
        return revertedString;
    }

    static String stackRevert(String[] stringArray)
    {
        String revertedString = "";
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < stringArray.length; i++)
        {
            stringStack.push(stringArray[i]);
        }
        while (stringStack.size() != 0)
        {
            revertedString += stringStack.pop() + " ";
        }
        return revertedString;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String givenString = sc.nextLine();
        System.out.println("String is: " +givenString);
        String[] parts = givenString.split(" ");
        /***
         *  METHOD 1: ARRAY IMPLEMENTATION
        ***/
        System.out.println("String Reverted using Array Implementation");
        System.out.println(arrayRevert(parts));

        /***
         *  METHOD 2: LINKED LIST IMPLEMENTATION
        ***/
        System.out.println("String Reverted using Linked List Implementation");
        System.out.println(linkedListRevert(parts));
        /***
         *  METHOD 3: STACK IMPLEMENTATION
        ***/
        System.out.println("String Reverted using Stack Implementation");
        System.out.println(stackRevert(parts));

    }
}
