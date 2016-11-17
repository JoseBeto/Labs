import java.util.HashMap;

/**
 * This class will great a dual hash map 
 * 	using two hash maps.
 * 
 * @author Jose Bocanegra
 *
 * @param <K>
 * @param <V>
 */
public class DualHashMap<K, V> implements DualMap<K, V> {
	/**
	 * keyMap variable is the HashMap used to
	 * 	retrieve Value from Key
	 */
	HashMap<K, V> keyMap = new HashMap<K, V>();
	/**
	 * valueMap variable is the Hashmap used to
	 * 	retrieve Key from Value
	 */
	HashMap<V, K> valueMap = new HashMap<V, K>();

	/**
	 * put method checks if the keyMap already
	 * 	contains key or value. if it does,
	 * 	it will remove key and it's value
	 * 	using the remove function in this class.
	 */
	@Override
	public void put(K key, V value) {
		if(keyMap.containsKey(key)){
			remove(key, get(key));
		}
		if(keyMap.containsValue(value)){
			remove(reverseGet(value), value);
		}
		keyMap.put(key, value);
		valueMap.put(value, key);
	}

	/**
	 * remove method removes the given key
	 * 	and value from both maps, keyMap
	 * 	and valueMap
	 */
	@Override
	public void remove(K key, V value) {
		keyMap.remove(key, value);
		valueMap.remove(value, key);
	}

	/**
	 * get method returns the value of
	 * 	keyMap using key
	 */
	@Override
	public V get(K key) {
		return keyMap.get(key);
	}

	/**
	 * reverseGet method returns the
	 * 	key of valueMap using value
	 */
	@Override
	public K reverseGet(V value) {
		return valueMap.get(value);
	}
}
