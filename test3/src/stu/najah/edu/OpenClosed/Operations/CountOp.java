package stu.najah.edu.OpenClosed.Operations;

import java.util.ArrayList;

public class CountOp  implements GeneralOp{
    @Override
    public int operation(ArrayList<Integer>  n) {
     return n.size();
    }
}
