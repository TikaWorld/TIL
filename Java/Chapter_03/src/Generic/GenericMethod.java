package Generic;

public class GenericMethod {
    public static void main(String[] arg) {
        Pair<Integer, String> p1 = new Pair<Integer, String>(1, "Apple");
        Pair<Integer, String> p2 = new Pair<Integer, String>(1, "Apple");
        System.out.println(Util.<Integer, String>compare(p1, p2));

        Pair<String, String> p3 = new Pair<String, String>("User1", "Apple");
        Pair<String, String> p4 = new Pair<String, String>("User2", "Apple");
        System.out.println(Util.<String, String>compare(p3, p4));

        int result1 = Util.compare(10, 20);
        System.out.println(result1);
        System.out.println(Util.compare(4.5, 3));
    }
}

class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }

    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return  Double.compare(v1, v2);
    }
}

class Pair<K, V> {
    private  K key;
    private  V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey() { return this.key; }
    public V getValue() { return this.value; }
}