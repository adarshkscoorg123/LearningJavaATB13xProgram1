package ex_37_Java_CollectionsFramework_List;

import java.util.Stack;

public class Lab_279_Stack {

    public static void main(String[] args) {

        // Stack is LIFO-i.e Last In First Out
        Stack s1 = new Stack();
        s1.add("Python");
        s1.add(2);
        s1.add("C#");
        s1.add(3);
        s1.add("C");
        s1.add(4);
        s1.add(5);
        s1.add("Java");
        System.out.println(s1);
        System.out.println(s1.peek()); // Gives who is at the top
        System.out.println(s1.pop()); // Removes the top most element
        System.out.println(s1);

        // Create Integer type stack

        Stack<Integer> intStack = new Stack<Integer>();
        intStack.add(1);
        intStack.add(2);
        intStack.add(3);
        intStack.add(4);
        //intStack.add(true); not possible
        //intStack.add("String"); not possible
        System.out.println(intStack);
        System.out.println(intStack.peek());
        System.out.println(intStack.pop());
        System.out.println(intStack);

        Stack<String> stringStack = new Stack<String>();
        stringStack.push("Adarsh");
        stringStack.push("Kushalnagar");
        stringStack.push("Suresh");
        //stringStack.push(true); not possible
        System.out.println(stringStack);
        System.out.println(stringStack.peek());
    }
}
