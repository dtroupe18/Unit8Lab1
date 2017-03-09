/**
 * Created by Dave on 3/6/17.
 */
public class ListNode {

    private Object value;
    private ListNode next;

    public ListNode(Object v, ListNode n) {
        value = v;
        next = n;
    }

    public Object getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
