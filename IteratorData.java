import java.util.Iterator;
import java.util.Map;

public class IteratorData<K, V> implements Iterator<Map.Entry<K, V>> {

    Iterator<Map.Entry<K, V>> data;

    public IteratorData(Map<K, V> myMap) { data = myMap.entrySet().iterator();}

    @Override
    public boolean hasNext() {return data.hasNext();}

    @Override
    public Map.Entry<K, V> next() {return data.next();}

    @Override
    public void remove() {data.remove();}
}
