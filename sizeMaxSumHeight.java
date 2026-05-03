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

    public static void main(String args[]) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        // preorder(root);
        System.out.println(size(root));
    }
}
