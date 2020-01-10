package top.mrys.study.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * @author mrys
 * 2020/1/9
 */
@ComponentScan
public class Demo1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Demo1.class);
		System.out.println("-----------------");
		String[] names = context.getBeanDefinitionNames();
		Arrays.stream(names).forEach(System.out::println);
		System.out.println("-----------------");
	}
}
