public class linkedlist {

    node head;
    class node{
        String data;
        node next;

        node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // To add element - addFirst

    public void addFirst(String data){
        node newNode = new node(data);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head  = newNode;
    }

    // addLast

    public void addLast(String data) {
        node newNode = new node(data);

        if (head == null){
            head = newNode;
            return;
        }

        node currNode = head;
        while(currNode.next  != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //print
    public void printlist(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
     
        node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }

        System.out.print("null");
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("My");

        list.addLast("Avnee");

        list.printlist();
    }
       
}
