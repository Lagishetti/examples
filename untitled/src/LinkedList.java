public class LinkedList<T> {
    Node head=null;
    public boolean insertion(T data){
        if(this.head==null){
            this.head=new Node<T>(data);
            return true;
        }
        else{
            Node temp=this.head;
            while(temp.nextNode!=null){
                temp=temp.nextNode;
            }
            temp.nextNode=new Node<T>(data);
            return true;
        }

    }
    public void printList(){
        System.out.println(this.head.data);
        Node temp=this.head;
        while(temp.nextNode!=null){
            temp=temp.nextNode;
            System.out.println(temp.data);
        }
    }



}
