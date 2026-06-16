class MyLinkedList {
    Node head;
    int size;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        Node tmp = head;
        for (int i = 0; i < index; i++) tmp = tmp.next;

        return tmp.data;
    }

    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        size++;
    }

    public void addAtTail(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
        } else {
            Node tmp = head;
            while (tmp.next != null) tmp = tmp.next;
            tmp.next = n;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node n = new Node(val);
        Node tmp = head;
        for (int i = 0; i < index - 1; i++) tmp = tmp.next;
        n.next = tmp.next;
        tmp.next = n;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }

        Node tmp = head;
        for (int i = 0; i < index - 1; i++) tmp = tmp.next;

        tmp.next = tmp.next.next;
    }
}
