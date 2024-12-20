package com.charan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Alien obj = (Alien) context.getBean("alien");
//        obj.age = 22;
        System.out.println(obj.getAge());
        obj.writeCode();

//        Alien obj2 = (Alien) context.getBean("alien");
//        System.out.println(obj2.getAge());

//        obj.writeCode();
    }
}
