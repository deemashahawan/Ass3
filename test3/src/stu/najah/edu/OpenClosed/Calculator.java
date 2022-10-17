package stu.najah.edu.OpenClosed;

import stu.najah.edu.OpenClosed.Operations.*;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> numbers = null;

    public Calculator(){
        numbers = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(int number){
        numbers.add(number);
    }

    public void removeNumberAtIndex(int index){
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }

    public int getOperationResult(Operation operation){
        int res=0;
       switch (operation){
           case Count:
               CountOp c=new CountOp();
               res= c.operation(numbers);
               break;
           case Addition:
               AdditionOP a=new AdditionOP();
               res=a.operation(numbers);
               break;
           case Multiplication:
               MultiplicationOp m=new MultiplicationOp();
               res=m.operation(numbers);
               break;
           case Max:
               MaxOp M=new MaxOp();
               res=M.operation(numbers);
               break;
           case Min:
               MinOp n=new MinOp();
               res=n.operation(numbers);
               break;

       }
        return res;

    }
}
