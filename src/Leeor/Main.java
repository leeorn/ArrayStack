package Leeor;

/**
 * Creating a stack. Stack is LIFO, ideally we use linked list, but but we
 * can use any data type.
 * Here I used array, and have push, pop and peek methods.
 */

public class Main {

    public static void main(String[] args) {

        Employee noy = new Employee("Noy", "Neh", 1);
        Employee le = new Employee("Le", "Neh", 2);
        Employee chase = new Employee("Chase", "Rich", 3);
        Employee rick = new Employee("Rick", "Nick", 5);

        ArrayStack arrayStack = new ArrayStack();

        arrayStack.push(noy);
        arrayStack.push(le);
        arrayStack.push(chase);
        arrayStack.push(rick);

        System.out.println(arrayStack.pop());

        arrayStack.pop();
        System.out.println(arrayStack.peek());
        arrayStack.toPrint();
        System.out.println(arrayStack.size());


    }
}
