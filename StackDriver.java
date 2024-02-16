public class StackDriver {
    public static void main(String[] args) {
        Stack list=new Stack();

        System.out.println("//01");
        list.push(1);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.push(10);
        list.push(38);

        list.disply();


        list.push(58);
        list.push(43);

        list.pop();
        list.disply();

        list.push(100);
        list.push(378);
        list.pop();

        list.disply();


       

    }

}
