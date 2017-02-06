import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("conf.xml");
		BeanFactory bf = new XmlBeanFactory(res);
		
		ITRC trc = (ITRC) bf.getBean("gulliver");
		System.out.println(trc.toString());

		
	}

}
