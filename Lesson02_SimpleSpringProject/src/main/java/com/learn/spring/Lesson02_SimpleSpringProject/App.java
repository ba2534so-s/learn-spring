package com.learn.spring.Lesson02_SimpleSpringProject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
        Developer obj1 = (Developer) context.getBean("developer");
        obj1.age = 18;
        obj1.code();
    }
}
