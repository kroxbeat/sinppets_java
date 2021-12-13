package algorism.hashTable;

import java.util.LinkedList;

public class HashTable {
    class Node{
        String key;
        String value;
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
        String value() {
            return this.value;
        }
        void value(String value) {
            this.value = value;
        }
    }

    LinkedList<Node>[] data;

    public HashTable(int size) {
        this.data = new LinkedList[size];
    }

    int getHahsCode(String key) {
        int hashcode = 0;
        for (char c : key.toCharArray()) {
            hashcode += c;
        }
        return hashcode;
    }

    int convertToIndex(int hashcode) {
        return hashcode % data.length;
    }

    Node searchKey(LinkedList<Node> list, String key) {
        if(list == null) return null;
        for (Node node : list) {
            if (node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }

    void put(String key, String value) {
        int hashcode = getHahsCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if (node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.value(value);
        }
    }

    String get(String key) {
        int hashcode = getHahsCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not Fount": node.value;
    }

    public static void main(String[] args) {
        HashTable h = new HashTable(4);
        h.put("kang","kang is pretty");
        h.put("jung","jung is pretty");
        h.put("hyun","hyun is pretty");

        System.out.println(h.get("kang"));
        System.out.println(h.get("jung"));
        System.out.println(h.get("hyun"));
        System.out.println(h.get("hyun2"));
    }
}
