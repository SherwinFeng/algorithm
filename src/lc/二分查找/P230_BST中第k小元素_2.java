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
 * @date Date : 2020年08月12日 11:17
 */

public class P230_BST中第k小元素_2 {

    int curK;
    int ret;

    public int kthSmallest(TreeNode root, int k) {
        curK = k;
        helper(root);
        return ret;
    }

    void helper(TreeNode root){
        if(curK == 0 || root == null) return;
        helper(root.left);
        curK--;
        if (curK == 0){
            ret = root.val;
        }
        helper(root.right);
    }
}
