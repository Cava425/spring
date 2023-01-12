import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cat = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User bean = cat.getBean(User.class);
		System.out.println(bean);
	}
}
