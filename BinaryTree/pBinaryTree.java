public class pBinaryTree {
    Node root;
    public static void main(String[] args) {
        pBinaryTree pBT = createBinaryTree();
        System.out.println("In Order:");
        pBT.inOrder(pBT.getRoot());
        System.out.println("Post Order:");
        pBT.postOrder(pBT.getRoot());
        System.out.println("Pre Order:");
        pBT.preOrder(pBT.getRoot());
    }
    public void addNode(int value) {
        root=addNodeRecursive(this.getRoot(),value);
        
    }
    private Node addNodeRecursive(Node current,int value) {
        if (current==null) {
            return new Node(value);
        }
        if(value<current.value) {
            current.left = addNodeRecursive(current.left,value);
        } else if(value>current.value) {
            current.right = addNodeRecursive(current.right,value);
        } else {
            return current;
        }
        return current;
    }
    public void inOrder(Node root) {
        if (root==null) {
            return;
        }
        inOrder(root.left);
        System.out.println(" "+root.value);
        inOrder(root.right);
    }
    public void postOrder(Node root) {
        if (root==null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(" "+root.value);
        
    }
    public void preOrder(Node root) {
        if (root==null) {
            return;
        }
        System.out.println(" "+root.value);
        preOrder(root.left);
        preOrder(root.right);
        
        
    }

    public static pBinaryTree createBinaryTree() {
        pBinaryTree bt = new pBinaryTree();

        bt.addNode(4);
        bt.addNode(5);
        bt.addNode(8);
        bt.addNode(9);
        bt.addNode(2);
        bt.addNode(1);
        bt.addNode(10);
        bt.addNode(3);
        bt.addNode(6);
        bt.addNode(7);

        return bt;
    }
    public Node getRoot() {
        return root;
    }
    public void setRoot(Node root) {
        this.root=root;
    }
    
}
