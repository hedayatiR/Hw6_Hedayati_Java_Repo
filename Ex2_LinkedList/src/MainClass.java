public class MainClass {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        list.display();


        list.add(3,200);
        list.display();
        System.out.println(list.indexOf(2));
        list.remove(4);
        list.display();

        list.remove(4);
        list.display();
        list.remove(4);
        list.display();

        System.out.println(list.indexOf(14));

    }
}
