 package Day10;

public class InsertionList{


public static Node insertHead(Node head, int val) {
    Node temp = new Node(val, head);
    return temp;
}

public static Node insertTail(Node head, int val) {
    if (head == null)
        return new Node(val);

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }

    Node newNode = new Node(val);
    temp.next = newNode;

    return head;
}

public static Node insertAtK(Node head, int val, int k) {
    // If the linked list is empty and k is 1, insert the new node as the head
    if (head == null) {
        if (k == 1)
            return new Node(val);
        else
            return head;
    }

    // If k is 1, insert the new node at the beginning of the linked list
    if (k == 1)
        return new Node(val, head);

    int cnt = 0;
    Node temp = head;

    // Traverse the linked list to find the node at position k-1
    while (temp != null) {
        cnt++;
        if (cnt == k - 1) {
            // Insert the new node after the node at position k-1
            Node newNode = new Node(val, temp.next);
            temp.next = newNode;
            break;
        }
        temp = temp.next;
    }

    return head;
}

public static Node insertAtKval(Node head, int el, int val) {
    if (head == null) {
        return null;
    }

    // Insert at the beginning if the value matches the head's data
    if (head.data == val) {
        return new Node(el, head);
    }

    Node temp = head;
    while (temp.next != null) {
        // Insert at the current position if the next node has the desired value
        if (temp.next.data == val) {
            Node newNode = new Node(el, temp.next);
            temp.next = newNode;
            break;
        }
        temp = temp.next;
    }
    return head;
}



}