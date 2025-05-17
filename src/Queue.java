public class Queue extends linkedList {
    Node rare;

    // Functions ---------------------------

    // ENQUEUE *************
    public void enqueue(Node newNode) {
        // if is empty
        if(isEmpty()) {
            head = rare = newNode;
            return;
        }

        rare.next = newNode;
        newNode.prev = rare;
        rare = newNode;
    }

    // DEQUEUE *************
    public void dequeue() {
        // if is empty
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }


        // if it's last node
        if(head == rare) {
            head = rare = null;
            return;
        }

        head = head.next;
        head.prev = null;

    }

}
