public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value){
        this.value = value;
    }

    //next(), setNext(), previous(), setPrevious() and compareTo()

    protected abstract ListItem next();
    protected abstract ListItem setNext(ListItem item);
    protected abstract ListItem previous();
    protected abstract ListItem setPrevious(ListItem item);

    protected int compareTo(ListItem item){
        int res = ((String)this.value).compareTo((String)item.value);
        return res;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }
}
