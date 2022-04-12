package algorism.linkList;

public class LinkedList<T> {

    T data;
    LinkedList<T> next;

    public LinkedList() {
    }

    public LinkedList(T data) {
        this.data = data;
    }

   void append(T data) {
        LinkedList<T> nList = new LinkedList<>(data);
        LinkedList<T> n = this;
       while (n.next != null) {
           n = n.next;
       }
       n.next = nList;
    }

    void printList() {
        LinkedList<T> n = this;
        while (n.next != null) {
            System.out.println("n.next = " + n.next.data);
            n = n.next;
        }
    }

    void delete(T delData) {
        LinkedList<T> n = this;
        while (n.next != null) {
            if (n.next.data.equals(delData)) {
                n.next = n.next.next;
                break;
            }
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        list.append(new Person("kang",38));
        list.append(new Person("jung",39));
        list.append(new Person("hyun",40));
        list.append(new Person("king",41));
        list.printList();
        System.out.println("------");
        System.out.println(new Person("hyun",40).hashCode());
        System.out.println("------");
        list.delete(new Person("hyun",40));
        list.printList();
    }
}
