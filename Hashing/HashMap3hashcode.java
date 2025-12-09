import java.util.*;

public class HashMap3hashcode {

    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; 
        private int N; 
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; 
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); 
            LinkedList<Node> ll = buckets[bi];

            for (Node node : ll) {
                if (node.key.equals(key)) {
                    node.value = value; 
                    return;
                }
            }

            ll.add(new Node(key, value)); 
            n++;

            if ((double) n / N > 2.0) {
                rehash();
            }
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            N = N * 2;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;
            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            LinkedList<Node> ll = buckets[bi];

            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return true;
                }
            }
            return false;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            LinkedList<Node> ll = buckets[bi];

            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
            return null;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            LinkedList<Node> ll = buckets[bi];

            for (Node node : ll) {
                if (node.key.equals(key)) {
                    ll.remove(node);
                    n--;
                    return node.value;
                }
            }
            return null;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 100);
        map.put("USA", 200);
        map.put("China", 150);

        System.out.println("India: " + map.get("India"));
        System.out.println("Contains USA? " + map.containsKey("USA"));
        System.out.println("Removed China: " + map.remove("China"));
        System.out.println("Contains China? " + map.containsKey("China"));
    }
}
