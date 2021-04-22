package com.java.algothrim.LinkList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/copy-list-with-random-pointer/
public class CopyListwithRandomPointer {
    public RandomNode copyRandomList(RandomNode head) {
        if(head == null){
            return null;
        }
        
        RandomNode copy;
        Map<RandomNode,RandomNode> map = new HashMap<>(); // key --> original , value --> copy
        copy = copy(head,map);

        RandomNode current = copy;

        while(current != null){
            if(current.random != null){
                current.random = map.get(current.random);
            }
            current = current.next;
        }
        return copy;
        
    }
    
    private RandomNode copy(RandomNode original, Map<RandomNode,RandomNode> map){
        if(original == null){
            return null ;
        }

        RandomNode copy = copySingleRandomNode(original);
        map.put(original,copy);
        copy.next = copy(original.next,map);
        return copy;
        
    }
    
    private RandomNode copySingleRandomNode(RandomNode orignial){
        RandomNode newRandomNode = new RandomNode(orignial.val);
        newRandomNode.random = orignial.random;
        return newRandomNode;
    }
}


