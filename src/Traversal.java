public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> rooot = new TreeNode<>(10, null, null);

    System.out.println(rooot.value);

    rooot.left = new TreeNode<>(9, null, null);
    rooot.right = new TreeNode<>(15, null, null);

    rooot.left.left = new TreeNode<>(5, null, null);
    rooot.left.right = new TreeNode<>(2, null, null);

    rooot.right.left = new TreeNode<>(-3, null, null);
    rooot.right.right = new TreeNode<>(5, null, null);

    rooot.right.right.right = new TreeNode<>(22, null, null);

    // preorder(rooot);
    postorder(rooot);
    
  }

  public static void postorder(TreeNode<?> node){
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.println(node.value);
  }

  public static void preorder(TreeNode<?> current1){

    if (current1 == null){
      return;
    }

    System.out.println(current1.value);

    if (current1.left != null){
      preorder(current1.left);
    }

    if (current1.right != null){
      preorder(current1.right);
    }

  }
}
