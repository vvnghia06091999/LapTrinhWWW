package vn.edu.iuh.ui;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import vn.edu.iuh.beans.Employee;

public class Test {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
		Employee e = (Employee) factory.getBean("employee");

		System.out.println(e);
	}
}
