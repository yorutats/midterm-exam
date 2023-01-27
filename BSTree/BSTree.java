    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
    */

    //Week11
    //完成刪除功能

    package BSTree;

    /**
     *
     * @author s2000
     */
    class TreeNode {    // 樹節點類別
        int data;        // 節點資料
        TreeNode left;   // 參考左子樹
        TreeNode right;  // 參考右子樹
        // 建構子
        public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
        }
    }
    public class BSTree {      // 二元搜尋樹類別
        public TreeNode head;   // 參考樹的根節點
        // 建立空的二元搜尋樹
        public BSTree() { head = null; }
    
        // 方法: 檢查二元搜尋樹是否是空的
        boolean isBSTreeEmpty() {
        if ( head == null ) return true;
        else                return false;
        }
        // 方法: 在二元搜尋樹插入節點
        public void insertBSTreeNode(int data) {
        if ( head == null ) {  // 建立根節點
            head = new TreeNode(data);
            return;
        }
        // 建立二元搜尋樹
        TreeNode current = head;
        while (true) {
            if ( data < current.data ) {  // 在左子樹
                if ( current.left == null ) {
                    current.left = new TreeNode(data);
                    return;
                }
                else  current = current.left;
            }
            else {  // 在右子樹
                if ( current.right == null ) {
                    current.right = new TreeNode(data);
                    return;
                }
                else  current = current.right;
            }
        }
        }
        // 方法: 顯示二元搜尋樹的節點資料
        public void printBSTree() {
        inOrder(this.head);
        System.out.println();
        }
        // 方法: 前序走訪的遞迴方法
        public void preOrder(TreeNode node) {
        if ( node != null ) { 
            // 顯示節點資料
            System.out.print("["+node.data+"]"); 
            preOrder(node.left);  // 走訪左子樹         
            preOrder(node.right); // 走訪右子樹
        }
        }
        
        // 方法: 中序走訪的遞迴方法
        public void inOrder(TreeNode node) {
        if ( node != null ) {  
            inOrder(node.left);  // 走訪左子樹
            // 顯示節點資料
            System.out.print("["+node.data+"]");
            inOrder(node.right); // 走訪右子樹
        }
        }
        // 方法: 後序走訪的遞迴方法
        public void postOrder(TreeNode node) {
        if ( node != null ) {  
            postOrder(node.left);  // 走訪左子樹
            postOrder(node.right); // 走訪右子樹
            // 顯示節點資料
            System.out.print("["+node.data+"]");
        }
        }
        public TreeNode deleteBSTreeNode(TreeNode root, int data) {
            if (root == null) return root;
            if (data < root.data) root.left = deleteBSTreeNode(root.left, data);
            else if (data > root.data) root.right = deleteBSTreeNode(root.right, data);
            else {
                if (root.left == null) return root.right;
                else if (root.right == null) return root.left;
                root.data = minValue(root.right);
                root.right = deleteBSTreeNode(root.right, root.data);
            }
            return root;
        }
    
        public int minValue(TreeNode root) {
            int minv = root.data;
            while (root.left != null) {
                minv = root.left.data;
                root = root.left;
            }
            return minv;
        }

        public void deleteBSTreeNode(int data) {
            this.head = deleteBSTreeNode(this.head, data);
        }
    
        public static void main(String args[]){
            int i;         
            int[] array = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
            
            BSTree obj = new BSTree();
        
    
            System.out.print("Original Array:");
            // 使用迴圈以插入方式建立樹狀結構
            for ( i = 0; i < array.length; i++ ) {
                System.out.print("["+array[i]+"]");
                obj.insertBSTreeNode(array[i]);
            }
            System.out.println();
    
            System.out.print("InOrder:");
            obj.inOrder(obj.head);
            System.out.println();
    
            System.out.print("PreOrder:");
            obj.preOrder(obj.head);
            System.out.println();
    
            System.out.print("PostOrder:");
            obj.postOrder(obj.head);
            System.out.println();
        }

        
    }