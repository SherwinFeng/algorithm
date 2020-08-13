package main;
import struct.TreeNode;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package main
 * @Description: 先序遍历 递归
 * @date Date : 2020年08月12日 10:49
 */

public class P222_完全二叉树结点数量 {

    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
