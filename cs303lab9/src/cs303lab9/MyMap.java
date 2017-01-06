package cs303lab9;
public class MyMap<K, V> {
	
	private int DEFAULT_CAPACITY = 100; //16
	@SuppressWarnings("unchecked")
	private MyEntry<K,V>[] table = new MyEntry[DEFAULT_CAPACITY];
	private int size;

	public Object get(K key) {
		int hash = key.hashCode() % DEFAULT_CAPACITY;
        MyEntry entry = table[hash];
 
        // if bucket is found then traverse through the linked list and
        // see if element is present
        while(entry != null) {
            if(entry.getKey().equals(key)) {
                return entry.getValue();
            }
            entry = entry.getNext();
        }
        return null;
	}
	
	public void put(K key, V value) {
		int hash = key.hashCode() % DEFAULT_CAPACITY;
	    MyEntry entry = table[hash];
	    if(entry != null) {
	    	if(entry.getKey().equals(key)) {
	    		entry.setValue(value);
	    	}
	    	else {
	    		// traverse to the end of the list and insert new element 
                // in the same bucket
                while(entry.getNext() != null) {
                    entry = entry.getNext();
                }
                MyEntry newEntry = new MyEntry(key, value);
                entry.setNext(newEntry);
	    	}
	    }
	    else {
	    	if(size == DEFAULT_CAPACITY) {
	    		DEFAULT_CAPACITY *= 2;
	    	}
	    	hash = key.hashCode() % DEFAULT_CAPACITY;
	    	MyEntry newEntry = new MyEntry(key,value);
	    	table[hash] = newEntry;
	    	size++;
	    }
	}
	
	public int getSize() {
		return size;
	}
	
}
