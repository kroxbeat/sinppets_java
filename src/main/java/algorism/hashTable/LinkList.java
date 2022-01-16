package algorism.hashTable;

public class LinkList {
    int data;
    LinkList next = null;

    public LinkList(int data) {
        this.data = data;
    }

    void append(int data) {
        LinkList end = new LinkList(data);
        LinkList n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int data) {
        LinkList n = this;
        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        LinkList n= this;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        LinkList head = new LinkList(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();
        head.delete(3);
        head.retrieve();
    }
}
