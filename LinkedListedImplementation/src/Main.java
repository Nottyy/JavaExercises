public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(new Node("gg"));
        list.addItem(new Node("aa"));
        list.addItem(new Node("bb"));
        list.addItem(new Node("ff"));
        list.addItem(new Node("tt"));
        list.addItem(new Node("zz"));
        list.addItem(new Node("cc"));
        list.addItem(new Node("cc"));
        list.traverse();

        System.out.println("Removing tt");
        list.removeItem(new Node("tt"));
        list.traverse();

        System.out.println("Removing aa");
        list.removeItem(new Node("aa"));
        list.traverse();

        System.out.println("Removing rr");
        list.removeItem(new Node("rr"));
        list.traverse();
    }
}