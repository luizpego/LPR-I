public class Node{
    private  int item;
    private Node next;

    public void setItem(int item) {
        this.item = item;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }
}