package trc;

public class Manager implements IManager {

	private String name;
	public Manager() {}
	public Manager(String name) {
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
		System.out.println("You will be glad with this item");
	}

	public String toString() {
		return "Manager " + name;
	}
}
