/* Find the smallest node in the list and insert it before head. */

public void minBeforeHead(){
        if(head.next == null) {
            System.out.println("List contains one element");
            return;
        }
        Node minNode = head;
        Node current = minNode;
        while(current != null){
            if(current.data < minNode.data){
                minNode = current;
            }
            current = current.next;
        }

        minNode.prev.next = minNode.next;
        minNode.next.prev = minNode.prev;

        minNode.next = head;
        head.prev = minNode;
        minNode.prev = null;
        head = minNode;
    }
