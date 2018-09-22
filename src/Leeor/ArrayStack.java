package Leeor;

public class ArrayStack
{
    //top is "pointing" at the next available location
    private int top = 0;
    private Employee[] employees = new Employee[3];


    //push a new employee
    public void push(Employee newEmployee){

        //resize the array if it was full.
        //when resize it's O(n); otherwise it's all O(1)
        if (top == employees.length){
            Employee[] newEmployees = new Employee[employees.length * 2];
            System.arraycopy(employees,0,newEmployees,0,employees.length);
            employees = newEmployees;
        }

        //insert the employee at the top position
        employees[top] = newEmployee;
        //incrementing top to be at the new employee
        top++;
    }

    //remove last added employee
    public Employee pop(){
        if (isEmpty())
            return null;

        Employee toPop = employees[top - 1];
        employees[top - 1] = null;
        top--;

        return toPop;
    }

    //look who is at the top
    public Employee peek(){
        return employees[top - 1];
    }

    //checks if the stack is empty
    public boolean isEmpty(){
        return top == 0;
    }

    //checks the size of the array (to know if it was increased correctly)
    public int size(){
        return employees.length;
    }


    public void toPrint(){
        System.out.println("top of the stack: ");
        for (int i = top - 1; i >= 0; i--){
            System.out.println(employees[i]);
        }
        System.out.println("end of the stack");
    }

 }


