package com.java.algothrim.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BasicCalculatorII {
    enum Operation {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
    }
    Map map =
            Map.of('+', Operation.ADDITION, '-', Operation.SUBTRACTION, '*',
                    Operation.MULTIPLICATION,
                    '/', Operation.DIVISION);

    public int calculate(String s) {
        s = s.replaceAll("\\s+","");

        List<Object> list = new ArrayList<>();

        while(s.length() != 0){
            int operatorIndex = findFirstOperator(s);
            if(operatorIndex == -1){
                break;
            }
            Integer number = Integer.valueOf(s.substring(0,operatorIndex));
            list.add(number);
            list.add(map.get(s.charAt(operatorIndex)));
            s = s.substring(operatorIndex + 1);

        }

        int number = Integer.valueOf(s);
        list.add(number);

        Stack<Integer> stack = new Stack<>();
        Integer currentNumber = 0;
        Operation currentOperation = Operation.ADDITION ;
        for (Object o: list) {
            if(o instanceof Integer){
                currentNumber = (Integer)o;
            }
            if(o instanceof Operation){
                if( currentOperation == Operation.ADDITION){
                    stack.push(currentNumber);
                }else if( currentOperation == Operation.SUBTRACTION){
                    stack.push(-currentNumber);
                }else if( currentOperation == Operation.DIVISION){
                    stack.push(stack.pop() / currentNumber);
                }else if( currentOperation == Operation.MULTIPLICATION){
                    stack.push(stack.pop() * currentNumber);
                }
                currentOperation = (Operation) o;
                currentNumber = 0;
            }
        }

        if( currentOperation == Operation.ADDITION){
            stack.push(currentNumber);
        }else if( currentOperation == Operation.SUBTRACTION){
            stack.push(-currentNumber);
        }else if( currentOperation == Operation.DIVISION){
            stack.push(stack.pop() / currentNumber);
        }else if( currentOperation == Operation.MULTIPLICATION){
            stack.push(stack.pop() * currentNumber);
        }

        int result = 0;

        for (Integer i : stack) {
            result +=i;
        }

        return result;
    }

    private int findFirstOperator (String s){
        for(int i = 0; i < s.length(); i ++){
            if(map.keySet().contains(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}


