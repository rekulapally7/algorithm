package com.amazon.coding;

import com.binarytree.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalOrder
{
    public List<List<Integer>> verticalOrder(Node root) {

        Map<Integer,List<Integer>> integerListMap=new HashMap<>();
        integerListMap= getColumnOrder(root,integerListMap,0);
        int totalsize= integerListMap.keySet().size();
        List<List<Integer>> columnsData=new ArrayList<>();
        for (int i=totalsize*-1;i<totalsize;i++)
        {
            if(null!=integerListMap.get(i))
            columnsData.add(integerListMap.get(i));
        }
        return columnsData;
    }


    Map<Integer,List<Integer>> getColumnOrder(Node root,Map<Integer,List<Integer>>  integerIntegerMap,int column)
    {
        if(root==null)
            return integerIntegerMap;
        List<Integer> integerList=integerIntegerMap.getOrDefault(column,new ArrayList<Integer>());
        integerList.add(root.getVal());
        integerIntegerMap.put(column,integerList);
        getColumnOrder(root.left,integerIntegerMap,column-1);
        getColumnOrder(root.right,integerIntegerMap,column+1);
        return integerIntegerMap;
    }

}
