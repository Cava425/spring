import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTests {
	@Test
	public void test(){
		ClassPathXmlApplicationContext cat = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User bean = cat.getBean(User.class);
		System.out.println(bean);
	}
}
