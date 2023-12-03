//package com.learning.ds;
//
//import java.util.*;
//
//public class BinaryTree {
//    public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//     }
//}
//
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root,res);
//        return res;
//    }
//    private void helper(TreeNode node, List<Integer> res){
//        if(node == null ){
//            return;
//        }
//        helper(node.left, res);
//        res.add(node.val);
//        helper(node.right,res);
//    }
//
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> rs = new ArrayList<>();
//        Stack<TreeNode> st = new Stack<>();
//        if(root == null ){
//            return Collections.emptyList();
//        }
//        st.push(root);
//        while (!st.isEmpty()){
//            TreeNode current = st.pop();
//            rs.add(current.val);
//            if(current.right!=null) st.push(current.right);
//            if(current.left!=null)  st.push(current.left);
//        }
//        return rs;
//    }
//
//    public List<Integer> preorderTraversalRecursive(TreeNode root) {
//        List<Integer> rs = new ArrayList<>();
//        if(root == null ){
//            return Collections.emptyList();
//        }
//        rs.add(root.val);
//        preorderTraversalRecursive(root.left);
//        preorderTraversalRecursive(root.right);
//
//        return rs;
//    }
//
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p == null && q == null){
//            return true;
//        }
//        if(p.val != q.val || p==null || q==null){
//            return false;
//        }
//
//        return isSameTree(p.left , q.left) && isSameTree(p.right, q.right);
//    }
//
////    public int sumOfLeftLeaves(TreeNode root) {
////        if(root == null) return 0;
////        if(root.left == null && root.right == null) return 0;
////        Queue<TreeNode> q = new LinkedList<>();
////        List<Integer> values = new ArrayList<>();
////        int sum = 0;
////        q.add(root);
////        while (!q.isEmpty()){
////            TreeNode current = q.remove();
////            values.add(current.val);
////            if(current.left!=null)sum+=current.left.val;
////            if(root.left != null) q.add(root.left);
////            if(root.right != null) q.add(root.right);
////        }
////        return sum;
////    }
//        public int sumOfLeftLeaves(TreeNode root) {
//            if(root == null) return 0;
//            if(root.left == null && root.right == null) return 0;
//            int sum =0 ;
//            sumHelper(root, sum);
//            return sum;
//        }
//
//        private void sumHelper(TreeNode root, int sum) {
//            sum+=root.left.val;
//            sumHelper(root.left,sum);
//            sumHelper(root.right,sum);
//        }
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        int sum =0;
//       return hasPathHelper(root, targetSum, sum);
//    }
//
//    private boolean hasPathHelper(TreeNode root, int target, int sum) {
//        if(root == null ) return false;
//        if(root.left == null && root.right == null) {
//            sum += root.val;
//            if(target == sum){
//                return true;
//            }
//        }
//        return hasPathHelper(root.left, target, sum+=root.val) || hasPathHelper(root.right, target, sum+=root.val);
//    }
//
//    public int maxDepth(TreeNode root) {
//        int count =1;
//        return maxDepthHelper(root, count);
//    }
//
//    private int maxDepthHelper(TreeNode root, int count) {
//        if(root == null) return 0;
//        if(root.left == null && root.right == null) return count;
//        return Math.max(maxDepthHelper(root.left ,count+1), maxDepthHelper(root.right ,count+1)) ;
//    }
//
//
//        public TreeNode invertTree(TreeNode root) {
//            if(root == null) return  root;
//            TreeNode temp = root.right;
//            root.right = root.left;
//            root.left = temp;
//            return invertTree(root);
//        }
//
//    public int islandPerimeter(int[][] grid) {
//        if(grid == null) return 0;
//        int count =0;
//        for(int i = 0; i< grid.length; i++){
//            for (int j=0; j< grid[i].length; j++){
//                if(grid[i][j]==0) return 0;
//                else{
//                    if(grid[i][j+1] == 0) count++;
//                    if(grid[i][j-1] == 0) count++;
//                    if(grid[i-1][j] == 0) count++;
//                    if(grid[i+1][j] == 0) count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    public boolean findTarget(TreeNode root, int k) {
//        if(root == null ) return  false;
//        if(root.left == null && root.right == null && root.val == k) return true;
//        List<Integer>lst = new ArrayList<>();
//        HashSet<Integer> hs = new HashSet<>();
//        values(root,lst);
//        int temp =0;
//        for(int i = 0; i<lst.size()-1; i++){
//            temp = k-lst.get(i);
//            if(hs.contains(temp)){
//                return true;
//            }
//            hs.add(lst.get(i));
//        }
//        return false;
//
//    }
////    public void values(TreeNode root, List<Integer> lst){
////        if(root == null) return;
////        lst.add(root.val);
////        if(root.right!=null)values(root.right,lst);
////        if(root.left!=null)values(root.left,lst);
////    }
////
////    public List<Double> averageOfLevels(TreeNode root) {
////        if(root == null) return Collections.emptyList();
////        List<Double> average = new ArrayList<>();
////        if(root.left!=null) averageOfLevels(root.left);
////        if(root.right!=null) averageOfLevels(root.right);
////        return average;
////    }
//
//    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        if(root1 == null && root2 == null) return null;
//        TreeNode root3 = new TreeNode(0);
//        return mergeTreesHelper(root1,root2, root3);
//    }
//
//    private TreeNode mergeTreesHelper(TreeNode root1, TreeNode root2, TreeNode root3) {
//        root3 = new TreeNode(0);
//        root3.val=root1.val+root2.val;
//        mergeTreesHelper(root1.left, root2.left,root3.left);
//        mergeTreesHelper(root1.right, root2.right,root3.right);
//        return root3;
//    }
//
//
//}
