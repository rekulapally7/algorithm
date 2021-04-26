package com.amazon.coding;

import com.binarytree.Node;

import java.util.*;
import java.util.stream.Collectors;

public class TreeLevelOrder
{
    Map<Integer, List<Integer>> levelMap = new TreeMap<>();

    public void levelOrder(Node root, int level)
    {
        if (root == null)
            return;

        List<Integer> nodesList = levelMap.getOrDefault(level, new ArrayList<>());
        nodesList.add(root.val);
        levelMap.put(level,nodesList);
        levelOrder(root.left, level + 1);
        levelOrder(root.right, level + 1);
        levelMap.values().stream().collect(Collectors.toList());
    }

    Map<Integer, List<Integer>> bfs(Node root)
    {
        if (root == null)
            return null;
        levelOrder(root, 1);
        return levelMap;
    }


}
