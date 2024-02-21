package Day13;



public class LinkedListNode {
    //Following is the class structure of the Node class:
   
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    

    public static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode t1 = head1;
        LinkedListNode t2 = head2;
        int carry = 0;
        LinkedListNode DummyNode = new LinkedListNode(-1);
        LinkedListNode curr = DummyNode;
        while(t1 != null || t2 != null){
            int sum = carry; 
            if(t1 != null) {
                sum += t1.data;
                t1 = t1.next;
            }
            if(t2 != null) {
                sum += t2.data;
                t2 = t2.next;
            }
            LinkedListNode newNode = new LinkedListNode(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;
        }
        if(carry != 0) {
            LinkedListNode new1 = new LinkedListNode(carry);
            curr.next = new1;
        }
        return DummyNode.next; 
    }
}
