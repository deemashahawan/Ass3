package stu.najah.edu.OpenClosed.Operations;

import java.util.ArrayList;

public class MaxOp implements GeneralOp{
    @Override
    public int operation(ArrayList<Integer> n) {
        int max = Integer.MIN_VALUE;
        for (Integer number : n) {
            if (max < number){
                max = number;
            }
        }
        return max;
    }
}
