package main;
import struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: TODO
 * @date Date : 2020年08月12日 11:12
 */

public class P230_BST中第k小元素_1 {

    List<Integer> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        return list.get(k - 1);
    }

    void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}
