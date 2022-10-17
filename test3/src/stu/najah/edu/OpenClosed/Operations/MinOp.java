package stu.najah.edu.OpenClosed.Operations;

import java.util.ArrayList;

public class MinOp implements GeneralOp{
    @Override
    public int operation(ArrayList<Integer> n) {
        int min = Integer.MAX_VALUE;
        for (Integer number : n) {
            if (min > number){
                min = number;
            }
        }
        return min;
    }
}
