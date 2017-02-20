package trc;

public class ClothStore implements IStore{
	
	private String name;
	private Manager manager;
	
	public ClothStore() {}
	
	public ClothStore(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Manager getManager() {
		return manager;
	}
	
	public void setManager(Manager man) {
		this.manager = man;
	}
	
	public String toString() {
		return "Welcome to the cloth store '" + name +
				"'!\nThere is a " + manager + ", who'd like to help you";
	}
}
