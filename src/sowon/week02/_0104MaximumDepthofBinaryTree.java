package sowon.week02;

public class _0104MaximumDepthofBinaryTree {
  public int maxDepth(TreeNode root) {
    if(root == null ) return 0;

    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }
}
