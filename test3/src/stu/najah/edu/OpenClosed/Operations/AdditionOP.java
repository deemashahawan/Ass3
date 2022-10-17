package stu.najah.edu.OpenClosed.Operations;

import java.util.ArrayList;

public class AdditionOP implements GeneralOp{
    @Override
    public int operation(ArrayList<Integer> n) {
        int result = 0;
        for (Integer number : n) {
            result += number;
        }
        return result;
    }
}
