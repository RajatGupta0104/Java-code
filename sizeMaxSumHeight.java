public class sizeMaxSumHeight {
    static int size = 0;
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static int size(Node root) {
        if(root == null) return 0;
        return size(root.left) + size(root.right) + 1;
        
    }

    public static int sum(Node root) {
        if(root == null) return 0;
        return sum(root.left) + sum(root.right) + root.val;
        
    }

    public static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b,c));
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(50);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        // preorder(root);
        // System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
    }
}
