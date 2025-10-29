
public class Queue {

    Node head, tail;
    //tail;

    public Queue() {
        head = tail = null;
    }

    void clear() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void addLast(Student info) {
        Node node = new Node(info);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
//            node.next = null; 
//      Khong can vi node.next luon chi vao null;
            tail = node;
        }
    }
    // addFirst
    void enqueue(Student x) {
        addLast(x);
    }

    // removeFirst
    Student dequeue() {
        if (isEmpty()) {
            return null;
        }

        Node x = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        x.next = null;
        return (x.info);
    }

    Student front() {
        if (isEmpty()) {
            return null;
        }
        return head.info;
    }
}
