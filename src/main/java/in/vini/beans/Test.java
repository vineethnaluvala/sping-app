package in.vini.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
//stash command

int i = 10;

String msg = "hello"
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		UserService user = context.getBean(UserService.class);
		user.printName(1);
	}

}
