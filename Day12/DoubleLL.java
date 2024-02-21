package Day12;

public class DoubleLL {
    public class DLinkedList {
        public static class Node {
             // Data stored in the node
            public int data;
            // Reference to the next node in the list (forward direction)
            public Node next;     
             // Reference to the previous node in the list (backward direction)
            public Node back;    
    
            // Constructor for a Node with both data, a reference to the next node, and a reference to the previous node
            public Node(int data1, Node next1, Node back1) {
                data = data1;
                next = next1;
                back = back1;
            }
    
            // Constructor for a Node with data, and no references to the next and previous nodes (end of the list)
            public Node(int data1) {
                data = data1;
                next = null;
                back = null;
            }
        }
        private static Node convertArr2DLL(int[] arr) {
             // Create the head node with the first element of the array
            Node head = new Node(arr[0]); 
             // Initialize 'prev' to the head node
            Node prev = head;
    
            for (int i = 1; i < arr.length; i++) {
                // Create a new node with data from the array and set its 'back' pointer to the previous node
                Node temp = new Node(arr[i], null, prev);
                // Update the 'next' pointer of the previous node to point to the new node
                prev.next = temp; 
                // Move 'prev' to the newly created node for the next iteration
                prev = temp; 
            }
             // Return the head of the doubly linked list
            return head;
        }
        
    
        private static void print(Node head) {
            while (head != null) {
                // Print the data in the current node
                System.out.print(head.data + " "); 
                // Move to the next node
                head = head.next; // Move to the next node
            }
            System.out.println();
        }
        
        private static Node insertBeforeHead(Node head, int val){
            // Create new node with data as val
            Node newHead = new Node(val, head, null);
            // Set old head's back pointer to the new Head
            head.back = newHead;
            // Return the new head
            return newHead;
        }
        
        private static Node insertBeforeTail(Node head, int val){
        // Edge case, if dll has only one elements
        if(head.next==null){
            // If only one element
            return insertBeforeHead(head, val);
        }
        
        // Create pointer tail to traverse to the end of list
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        // Keep track of node before tail using prev
        Node prev = tail.back;
        
        // Create new node with value val
        Node newNode = new Node(val, tail, prev);
        
        // Join the new node into the doubly linked list
        prev.next = newNode;
        tail.back = newNode;
        
        // Return the updated linked list
        return head;
        }
        
        // Function to insert before the Kth node 
        private static Node insertBeforeKthElement(Node head, int k, int val){
        
        if(k==1){
            // K = 1 means node has to be insert before the head
            return insertBeforeHead(head, val);
        }
        
        // temp will keep track of the node
        Node temp = head;
        
        // count so that the Kth element can be reached
        int count = 0;
        while(temp!=null){
            count ++;
            // On reaching the Kth position, break out of the loop
            if(count == k) break;
            // keep moving temp forward till count != K
            temp = temp.next;
        }
        // track the node before the Kth node
        Node prev = temp.back;
        
        // create new node with data as val
        Node newNode = new Node(val, temp, prev);
        
        //join the new node in between prev and temp
        prev.next = newNode;
        temp.back = newNode;
        
        // Set newNode's pointers to prev and temp
        newNode.next = temp;
        newNode.back = prev;
        
        // Return the head of the updated doubly linked list
        return head;
    }
        
    
    
    
        public static void main(String[] args) {
            int[] arr = {12, 5, 6, 8, 4};
            // Convert the array to a doubly linked list
            Node head = convertArr2DLL(arr); 
            // Print the doubly linked list
            print(head); 
            
            System.out.println("Doubly Linked List After Inserting val on the kth position: ");
            
            head = insertBeforeKthElement(head, 2, 10);
            print(head);
        }
    }
}
