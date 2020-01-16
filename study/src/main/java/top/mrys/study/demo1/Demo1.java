package top.mrys.study.demo1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/**
 * @author mrys
 * 2020/1/9
 */
@ComponentScan
public class Demo1 {

	private static Log log = LogFactory.getLog(Demo1.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Demo1.class);
		System.out.println("--------发的吉林省---------");
		log.info("2123daf的方式多个");
		String[] names = context.getBeanDefinitionNames();
		Arrays.stream(names).forEach(System.out::println);
		if (context instanceof TypeVariable) {
			System.out.println(123123);
		}
		System.out.println("-----------------");
	}
}
