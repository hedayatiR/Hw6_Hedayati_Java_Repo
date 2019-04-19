
public class MyLinkedList {
    private Node first;
    private Node last;
    private int size = 0;
    // ----------------------------------------------------------
    // Adds element to end of the linkedList
    public void add(Integer element) {
        Node newNode = new Node(element);
        if (size == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }
    // ----------------------------------------------------------
    // Adds element to index "index" of the linkedList
    // if index=0 then Adds to first of list
    public void add(int index, Integer element) {

        if (index < 0 || index >= size) {
            System.out.println("Error: index is out of bound!");
            return;
        }
        // Adds to end of list
        else if (index == (size - 1)) {
            add(element);
        }

        else {
            Node newNode = new Node(element);
            // adds to first of list
            if (index == 0) {
                newNode.next = first;
                first = newNode;
            }
            // adds in middle of list
            else {
                Node currentNode = first;
                // forward index-1 steps
                for (int i = 0; i < (index - 1); i++) {
                    currentNode = currentNode.next;
                }
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
            size++;
        }
    }
    // ----------------------------------------------------------
	    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error: index is out of bound!");
            return;
        }
        else if (index==0){
            first = first.next;
            size--;
        }

        else{
            Node currentNode = first;
            // forward index-1 steps
            for (int i = 0; i < (index - 1); i++) {
                currentNode = currentNode.next;
            }

            currentNode.next = currentNode.next.next;
            size--;
        }

    }
    // ----------------------------------------------------------
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (o.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
    }
    // ----------------------------------------------------------
    public boolean isEmpty() {
        return (size == 0);
    }
    // ----------------------------------------------------------
    public String toString(){ //write this instead of display
        String str="[";
        Node x = first;
        for (; x.next != null; x = x.next) {
            str += x.data.toString() + ", ";
        }
        str += x.data.toString() + "]";

        return str;
    }
}
