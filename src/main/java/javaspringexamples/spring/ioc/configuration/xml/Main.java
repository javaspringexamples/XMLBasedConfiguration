package javaspringexamples.spring.ioc.configuration.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"javaspringexamples/spring/ioc/configuration/xml/XmlConfiguration.xml");
		UserService userService = applicationContext.getBean("userService", UserService.class);

		System.out.println("User1 Informations: " + userService.getUserinformation(1));
		System.out.println("User2 Informations: " + userService.getUserinformation(2));

		System.out.println("Locking User1 account");
		userService.lockAccountUser(1);
		System.out.println("User1 Informations: " + userService.getUserinformation(1));
	}

}
