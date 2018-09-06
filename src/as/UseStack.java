package as;

import javax.swing.*;
import java.util.List;
import java.util.Stack;


public class UseStack {

    public static void main(String[] args) {
        Stack<String> stack= new Stack();
        stack.push(" ny");
        stack.push("fl");
        stack.push("ca");
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }


}
