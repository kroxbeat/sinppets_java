package algorism.hashTable;

import java.util.LinkedList;

public class HashTable {

    class Node {
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
    }

    LinkedList<Node>[] data;

    public HashTable(int size) {
        this.data = new LinkedList[size];
    }


    /**
     * @param value 해쉬코드 만들 소스
     * @return 만들 해쉬 결과
     */
    int makeHash(String value) {
        int count = 0;
        for (char c : value.toCharArray()) {
            count += c;
        }
        return count;
    }

    /**
     * @param hashValue 해쉬코드 값
     * @return 테이블 index 값으로 나머지 연산을 하여 bucket index 부여
     */
    int findIndex(int hashValue) {
        return hashValue % this.data.length;
    }

    /** 노트찾아 삼만리
     * @param list 노드 리스트
     * @param key 해당 리스트 에서 키
     * @return 조건에 맞는 Node 반환
     */
    Node searchNode(LinkedList<Node> list ,String key) {
        if (list == null) return null;
        for (Node node : list) {
            if (node.key.equals(key))
                return node;
        }
        return null;
    }

    /**
     * @param key 키
     * @param value 값
     */
    void put(String key, String value) {
        int hash = makeHash(key);
        int index = findIndex(hash);
        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<>();
            data[index] = list;
        }
        Node node = searchNode(list, key);
        if (node == null) {
            list.addLast(new Node(key,value));
        }else{
            node.setValue(value);
        }
    }

    String get(String key) {
        int hash = makeHash(key);
        int index = findIndex(hash);
        LinkedList<Node> list = data[index];
        Node node = searchNode(list, key);
        if (node == null) {
            return "Not found";
        } else {
            return node.getValue();
        }

    }

    public static void main(String[] args) {
        HashTable h = new HashTable(4);
        h.put("kang","첫 번째 입력 데이터");
        h.put("jung","jung 입력 데이터");
        h.put("hyun","hyun 입력 데이터");
        h.put("한글","한글 번째 입력 데이터");
        h.put("한글","한글 번째 입력 데이터 덥어쓰기");

        System.out.println(h.get("kang"));
        System.out.println(h.get("jung"));
        System.out.println(h.get("kan"));
        System.out.println(h.get("한글"));
    }
}
