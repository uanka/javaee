import java.util.Collection;

public class ITRC {
	private String name;
	private Collection<IStore> stores;
	ITRC(){};
	void open() {
		System.out.println("The TRC "+name+" is open");
	}
	void close() {
		System.out.println("The TRC "+name+" is closed");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<IStore> getStores() {
		return stores;
	}
	public void setStores(Collection<IStore> stores) {
		this.stores = stores;
	}
	
	public String toString() {
		return "TRC \"" + name + "\" offers you such stores :\n" + stores.toString();
	}
}
