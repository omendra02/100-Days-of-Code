package Day10;

public class LLBasic {
     
        public static Node constructLL(int[] arr) {
            if (arr == null || arr.length == 0) {
                return null;
            }
    
            Node head = new Node(arr[0]);
            Node mover = head;
            for (int i = 1; i < arr.length; i++) {
                Node temp = new Node(arr[i]);
                mover.next = temp;
                mover = temp;
            }
    
            return head;
        }
    
        public static void printLinkedList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(); // Add newline after printing the linked list
        }

        static Node deleteK(Node head, int k) {
            // Check if the list is empty
            if (head == null)
                return head;
    
            // If k is 1, delete the first node
            if (k == 1) {
                Node temp = head;
                head = head.next;
                temp = null;
                return head;
            }
    
            // Traverse the list to find the k-th node
            Node temp = head;
            Node prev = null;
            int cnt = 0;
    
            while (temp != null) {
                cnt++;
                // If the k-th node is found
                if (cnt == k) {
                    // Adjust the pointers to skip the k-th node
                    prev.next = prev.next.next;
                    // Delete the k-th node
                    temp = null;
                    break;
                }
                // Move to the next node
                prev = temp;
                temp = temp.next;
            }
    
            return head;
        }


        static Node deleteval(Node head, int val) {
            // Check if the list is empty
            if (head == null)
                return head;
         // Traverse the list to find the k-th val node
         Node temp = head;
         Node prev = null;
    
 
         while (temp != null) {
             
             // If the k-th node is found
             if (head.data == val) {
                 // Adjust the pointers to skip the k-th node
                 prev.next = prev.next.next;
                 // Delete the k-th node
                 temp = null;
                 break;
             }
             // Move to the next node
             prev = temp;
             temp = temp.next;
         }
 
         return head;
     }
     
    }


