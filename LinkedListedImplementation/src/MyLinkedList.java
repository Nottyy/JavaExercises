public class MyLinkedList implements Nodelist {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        if (this.root == null) {
            System.out.println("List is empty!");
        }

        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        ListItem currentItem = this.root;

        while (currentItem != null) {
            int result = newItem.compareTo(currentItem);

            if (result > 0) {
                // newItem is greater, move right if possible

                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                }
                else{
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (result == 0) {
                System.out.println("Item " + currentItem.value + " is already in the list.");
                return false;
            } else {
                // newItem is less, insert before

                if (currentItem.previous() != null){
                    newItem.setPrevious(currentItem.previous());
                    currentItem.previous().setNext(newItem);
                }
                else if (currentItem.compareTo(this.root) == 0){
                    this.root = newItem;
                }

                newItem.setNext(currentItem);
                currentItem.setPrevious(newItem);

                return true;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = this.root;

        while (currentItem != null){
            int result = item.compareTo(currentItem);

            if (result == 0){
                if (currentItem.previous() != null){
                    if (currentItem.next() != null){
                        currentItem.previous().setNext(currentItem.next());
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                    else{
                        currentItem.previous().setNext(null);
                    }
                }
                else{
                    this.root = currentItem.next();
                }

                return true;
            }
            else{
                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                }
                else{
                    System.out.println("Item not in the list.");
                    return false;
                }
            }
        }

        return false;
    }

    @Override
    public void traverse() {
        ListItem currentItem = this.root;

        while (currentItem != null) {
            System.out.println(currentItem.value);
            currentItem = currentItem.rightLink;
        }
    }
}
