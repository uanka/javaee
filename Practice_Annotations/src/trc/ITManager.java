package trc;

public class ITManager implements IManager {
	private String name;
	public ITManager() {}
	public ITManager(String name) {
		this.name = name;
	}
	@Override
	public void greet() {
		System.out.println("We glad to see you in our store!");
	}

	@Override
	public void sell() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void advise() {
		System.out.println("You will be obsessed with this item");
	}

	public String toString() {
		return "IT-manager " + name;
	}
}
