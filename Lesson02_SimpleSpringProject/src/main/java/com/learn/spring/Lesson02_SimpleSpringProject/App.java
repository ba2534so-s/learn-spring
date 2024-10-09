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
    	 
    	// By default beans have Singleton Scope.
        // Singleton scope: Both obj1 and obj2 arr referring to the same object provided by the Spring Container
        // Scope can also be changed to Prototype Scope (manually)
        // Prototype scope: Spring container will create new objects every time getBean is called
    	Developer obj1 = (Developer) context.getBean("singletonDeveloper");
        obj1.setAge(18);
        obj1.code();
        System.out.println("Dev 1 age: " + obj1.getAge());
        
        Developer obj2 = (Developer) context.getBean("singletonDeveloper");
        System.out.println("Dev 2 age: " + obj2.getAge());
        
        
        
    }
}
