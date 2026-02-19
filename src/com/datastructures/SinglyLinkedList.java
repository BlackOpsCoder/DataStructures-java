package src.com.datastructures;
public class SinglyLinkedList<T extends Comparable<T>> {
    
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

    public void deleteNodeAtPos(int position) {
        if (this.head != null) {
            Node<T> curNode = this.head;
            Node<T> prevNode = null;
            if (position == 0) {
                curNode.next = this.head;
                curNode = null;
            }
            else {
                int count = 0;
                while ((count != position) || (curNode.next == null)) {
                    prevNode = curNode;
                    curNode = curNode.next;
                }
                if (curNode.next == null) {
                    return;
                }
                else {
                    prevNode.next = curNode.next;
                    curNode = null;
                }
            }
        }
    }

    public int lengthIterative() {
        int count = 0;
        Node<T> curNode = this.head;
        while (curNode != null) {
            count += 1;
            curNode = curNode.next;
        }
        return count;
    }

    public int lengthRecursive(Node<T> node) {
        if (node == null) {
            return 0;
        }
        else {
            return 1 + lengthRecursive(node.next);
        }
    }

    public void swapNode(T key1, T key2) {
        if (key1 == key2) {
            return;
        }
        Node<T> curNode1 = this.head;
        Node<T> prevNode1 = null;
        while ((curNode1 != null) || (curNode1.data == key1)) {
            prevNode1 = curNode1;
            curNode1 = curNode1.next;
        }
        Node<T> curNode2 = this.head;
        Node<T> prevNode2 = null;
        while ((curNode2 != null) || (curNode2.data == key2)) {
            prevNode2 = curNode2;
            curNode2 = curNode2.next;
        }
        if ((curNode1 == null) || (curNode2 == null)) {
            return;
        }
        prevNode1.next = curNode2;
        prevNode2.next = curNode1;
        curNode1.next = curNode2.next;
        curNode2.next = curNode1.next;
    }

    public void reverseIterative() {
        Node<T> prevNode = null;
        Node<T> curNode = this.head;
        while (curNode != null) {
            Node<T> nxt = curNode.next;
            prevNode = curNode.next;
            prevNode = curNode;
            curNode = nxt;
        }
        prevNode = this.head;
    }

    // TO DO: Implement reversing a linked list recursively

    public Node mergeSorted(SinglyLinkedList llist) {
        Node<T> a = this.head;
        Node<T> b = llist.head;
        Node<T> s = null;

        if (b == null) {
            return a;
        }
        else if (a == null) {
            return b;
        }
        
        if (a != null && b != null) {
            if (a.data.compareTo(b.data) < 0) {
                s = a;
                a = a.next;
            }
            else {
                s = b;
                b = b.next;
            }

        // while (a != null) {
        //     a = a.next;
        // }
        }

        
    }
}

