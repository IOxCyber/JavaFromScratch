class LinkedListEx{
    Node head; //head of List
    static class Node{ //Just like defining the Node class as  we do in structure.
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    //Now Insert The New Node
    public LinkedListEx insert(LinkedListEx list,int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) { //If Node is Em[ty
            list.head = new_node; //Make the New Node as Head
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
        }
        return null;
    }

    //Method to Print Linked list
    public static void printList(LinkedListEx list){
        Node currNode = list.head;
        System.out.println("LinedList: ");
        //Traversing
        while(currNode!= null){
            System.out.println(currNode.data+" ");
            currNode = currNode.next;
        }
    }


    public static void main(String[] args) {
        LinkedListEx list = new LinkedListEx();
        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        printList(list);
    }
}