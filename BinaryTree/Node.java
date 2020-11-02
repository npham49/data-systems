public class Node {
    public int value;
    public Node left;
    public Node right;
    public Node(int value) {
        this.setValue(value);
        this.setRight(null);
        this.setLeft(null);
    }
    public int getValue(Node node) {
        return node.value;
    }
    public void setValue(int value) {
        this.value=value;
    }
    public Node getRight() {
        return right;
    }
    public Node getLeft() {
        return left;
    }
    public void setRight(Node right) {
        this.right=right;
    }
    public void setLeft(Node left) {
        this.left=left;
    }
}