package src.com.datastructures;
public class SinglyLinkedList<T> {
    
    Node<T> head;
    public SinglyLinkedList() {
        this.head = null;
    }

    public void printList() {
        Node<T> curNode = this.head;
        while (curNode != null) {
            System.out.println(curNode);
            curNode = curNode.next;
        }
    }

    public void appendItem(T data) {
        Node<T> newNode = new Node<T>(data);
        if (this.head == null) {
            newNode = this.head;
        }
        else {
            while (newNode != null) {
                newNode = newNode.next;
            }
        newNode.next = null;
        }
    }

    public void prependItem(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAfterNode(Node<T> previousNode, T data) {
        if (previousNode != null) {
            Node<T> newNode = new Node<T>(data);
            newNode.next = previousNode.next;
            previousNode.next = newNode;
        }
    }

    public void deleteNode(T key) {
        Node<T> curNode = this.head;
        Node<T> prevNode = null;
        if ((this.head != null) && (this.head.data == key)) {
            this.head.next = curNode.next;
            curNode = null;
            return;
        }
        if (key != this.head) {
            while (curNode.data != key) {
                prevNode = curNode;
                curNode = curNode.next;
            }
            if (key == null) {
                return;
            }
            else {
                prevNode.next = curNode.next;
                curNode = null;
            }
        }
    }
}

