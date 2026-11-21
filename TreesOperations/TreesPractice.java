// Practising trees and its various operations
import java.util.*;
class Node {
    int val;   //root
    Node left;
    Node right;
    //constructor
    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
// for levelorderLinewise printing
class Pair {
    Node node;
    int level;
    //constructor
    Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}

public class TreesPractice {
    public static void main(String[] args) {
        //        4
        //      /   \
        //     6     7
        //    / \   / \
        //   8   9 10  11
        //  / \
        // 12 13
        Node a = new Node(4); // a->root
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);
        Node g = new Node(11);
        Node h = new Node(12);
        Node i = new Node(13);
        // connecting the nodes
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        d.left = h; d.right = i;
        //traversals
        // preorder - root , left ,right   (DFS)
        // postorder - left ,right, root     (DFS)
        // inorder - left ,root , right   (DFS)
        // levelorder - level by level from left to right  (BFS) by queue

        System.out.print("Preorder: "); preOrder(a); System.out.println();

        System.out.print("postOrder: "); postOrder(a);  System.out.println();

        System.out.print("inOrder: "); inOrder(a);  System.out.println();

        System.out.print("revPreOrder: "); revPreOrder(a);  System.out.println();

        System.out.print("revPostOrder: "); revPostOrder(a); System.out.println();

        System.out.print("revInOrder: "); revInOrder(a); System.out.println();

        System.out.print("levelOrder: "); levelOrder(a); System.out.println();  //bfs - queue

        System.out.print("Reverse levelOrder: "); RevlevelOrder(a); System.out.println();   //stack + queue

        System.out.println("levelOrderLineWise: "); levelOrderLineWise(a); System.out.println();

        System.out.print("Kth level elements: ");
        KthLevel(a,0,2);
        System.out.println();

        System.out.println(searchNode(a,10)); //Node with value 10

        int ans = size(a);
        System.out.print("Size: " + ans); System.out.println();
        
        int sum = sumOfValues(a);
        System.out.print("Total Sum: " + sum); System.out.println();
        
        int prod = prodOfValues(a);
        System.out.print("Total Product: " + prod); System.out.println();

        int max = maxVal(a);
        System.out.print("Max val: " + max); System.out.println();

        int min = minVal(a);
        System.out.print("Min val: " + min); System.out.println();
        
        int level = levels(a);
        System.out.print("Total levels: " + level);
        System.out.println();

        int height = level - 1;
        System.out.print("Height: " + height);
        System.out.println();

        //height = level - 1
        //edges = (nodes - 1) or (size - 1)

        int edges = ans - 1;  //here ans contains size
        System.out.print("No. of edges: " + edges);
        System.out.println();
    }

        //Fns made
        //------------------------------------------
        public static void preOrder(Node root) {
            if(root==null) return;
            //recursion
            System.out.print(root.val +" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void postOrder(Node root) {
            if(root==null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val +" ");
        }
        public static void inOrder(Node root) {
            if(root==null) return;
            inOrder(root.left);
            System.out.print(root.val +" ");
            inOrder(root.right);
        }
        public static void revPreOrder(Node root) {
            if(root==null) return;
            System.out.print(root.val +" ");
            revPreOrder(root.right);
            revPreOrder(root.left);
        }
        public static void revPostOrder(Node root) {
            if(root==null) return;
            revPostOrder(root.right);
            revPostOrder(root.left);
            System.out.print(root.val +" ");
        }
        public static void revInOrder(Node root) {
            if(root==null) return;
            revInOrder(root.right);
            System.out.print(root.val +" ");
            revInOrder(root.left);
        } 
        public static void levelOrder(Node root) {
               if(root == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(q.size()>0) {
                Node front = q.remove();
                System.out.print(front.val +" ");
                if(front.left!=null ) q.add(front.left);
                if(front.right!=null ) q.add(front.right);
            }
            System.out.println();
        }
        public static void RevlevelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            Stack<Node> s = new Stack<>();
            if (root==null) return;
            q.add(root);
            while(q.size()>0) {
                Node front = q.remove();
                s.add(front);
                if(front.left!=null ) q.add(front.left);
                if(front.right!=null ) q.add(front.right);
            }
            while(!s.isEmpty()) {
                System.out.print(s.pop().val +" ");
            }
        }

        public static void levelOrderLineWise(Node root) {
            Queue<Pair> q = new LinkedList<>();
            int currLevel = 0;
            q.add(new Pair(root,0));
            while(q.size()>0) {
                Pair front = q.remove();
                if(front.level != currLevel) {
                    currLevel++;
                    System.out.println();
                }
                System.out.print(front.node.val +" ");
                if(front.node.left!=null ) q.add(new Pair(front.node.left,front.level+1));
                if(front.node.right!=null ) q.add(new Pair(front.node.right,front.level+1));
            }
            System.out.println();
        }
        
        public static int size(Node root) {
            // size - number of nodes present
            // recursion
            if(root==null) return 0;  //base case
            return 1 + size(root.left) + size(root.right);
        }
        public static int sumOfValues(Node root) {
            // recursion
            if(root==null) return 0;  //base case
            return root.val + sumOfValues(root.left) + sumOfValues(root.right);
        }
        public static int prodOfValues(Node root) {
            // recursion
            if(root==null) return 1;  //base case
            return root.val * prodOfValues(root.left) * prodOfValues(root.right);
        }
        public static int maxVal(Node root) {
            //recursion ka magic chalega
            if(root==null) return Integer.MIN_VALUE;
            return Math.max(root.val,Math.max(maxVal(root.left),maxVal(root.right)));
        }
        public static int minVal(Node root) {
            //recursion ka magic chalega
            if(root==null) return Integer.MAX_VALUE;
            return Math.min(root.val,Math.min(minVal(root.left),minVal(root.right)));
        }
        public static int levels(Node root) {
            //recursion ka magic
            if(root==null) return 0;
            return 1 + Math.max(levels(root.left),levels(root.right));
        }
        public static boolean searchNode(Node root,int n) { 
            if (root==null) return false;
            if (root.val == n) return true;
            return (searchNode(root.left,n) || searchNode(root.right,n));
        }
        public static void KthLevel(Node root,int currLevel,int k) {
            if(root==null) return ;
            if(currLevel == k) {
                System.out.print(root.val +" ");
                return;
            }
            KthLevel(root.left,currLevel + 1,k);
            KthLevel(root.right,currLevel + 1,k);
        }
}


