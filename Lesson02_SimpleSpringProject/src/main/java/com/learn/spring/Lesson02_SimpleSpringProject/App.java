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
    	System.out.println("SINGLETON");
    	Developer obj1 = (Developer) context.getBean("singletonDeveloper");
    	
    	System.out.println("Initial age before assignment: " + obj1.getAge());
    	System.out.println("Laptop memory: " + obj1.getComputer().getMemory());
    	
    	obj1.setAge(18);
        obj1.code();
        System.out.println("Dev 1 age: " + obj1.getAge());
        
        Developer obj2 = (Developer) context.getBean("singletonDeveloper");
        System.out.println("Dev 2 age: " + obj2.getAge());
        System.out.println();

        
        // Scope can also be changed to Prototype Scope (manually)
        // Prototype scope: Spring container will create new objects every time getBean is called
        System.out.println("PROTOTYPE");
        Developer obj3 = (Developer) context.getBean("prototypeDeveloper");
        obj3.setAge(22);
        System.out.println("Dev 3 age: " + obj3.getAge());
        
        Developer obj4 = (Developer) context.getBean("prototypeDeveloper");
        System.out.println("Dev 4 age: " + obj4.getAge());
        System.out.println();
        
        
        
        
    }
}
