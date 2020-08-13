package struct;

/**
 * @author : zhengqiufeng
 * @version V1.0
 * @Project: algorithm
 * @Package struct
 * @Description: TODO
 * @date Date : 2020年08月12日 10:47
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }
}
