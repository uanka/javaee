package trc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("istore")
public class AppleStore implements IStore{

	private final static String name = "iStore";
	public AppleStore() {}
	private ITManager techmanager;
	
	public String getName() {
		return name;
	}
	
	public ITManager getManager() {
		return techmanager;
	}
	@Autowired
	public void setManager(ITManager manager) {
		this.techmanager = manager;
	}
	public String toString() {
		return "Welcome to the store of Apple's products '" + name +
				"'!\nThere is a " + techmanager + ", who'd like to help you";
	}
}
