public class Stack {
    private Node top;

    public Stack() {
        this.top =null;
    }

    public void push(int data){
        Node newNode=new Node(data);
        if(top==null){
            top=newNode;
        }else{
            newNode.setNext(top);
            top=newNode;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack is Empty");
        }else {
            Node temp=top.getNext();
            top.setNext(null);
            top=temp;

        }

    }
    public void disply(){
        Node temp=this.top;
        while(temp!=null){
            System.out.print(temp.getData()+",");
            temp=temp.getNext();
        }
        System.out.println();
    }
    public void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }else{
            System.out.println(this.top.getData());
        }
    }
}
