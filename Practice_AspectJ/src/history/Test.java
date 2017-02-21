package history;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("conf.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		
		User user = (User) bf.getBean("user");
		user.logIn();
//		user.doSomething();
		user.chating();
//		user.doSomething();
		user.logOut();

	}

}
