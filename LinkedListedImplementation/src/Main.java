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
    }
}