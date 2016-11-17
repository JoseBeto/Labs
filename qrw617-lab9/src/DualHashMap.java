
public class DualHashMap<K, V> implements DualMap<String, String> {

	private String[] first;
    private String[] second;
	
	public DualHashMap(String[] months1, String[] months2){
		first = months1;
		second = months2;
	}

	@Override
	public void put(String key, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String key, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reverseGet(String value) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
