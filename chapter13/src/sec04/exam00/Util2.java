package sec04.exam00;

public class Util2 {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<k, V> p2) {
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}
