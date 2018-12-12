
import Patterns.AbstractFactory.*;
import Patterns.FactoryMethod.AppleFactory;
import Patterns.FactoryMethod.BananaFactory;
import Patterns.FactoryMethod.GrapeFactory;
import Patterns.Simple.*;
import Patterns.SimpleFactory;
import Patterns.Singleton;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: dudg
 * @Date: Created in 16:35 2018/11/21
 * @Description:
 */
public class Application {
    public static void main(String[] args) {
        bubbleSort();
    }

    public static void bubbleSort(){
        int[] sortArr = new int[]{ 12,45,68,32,11,5,7,91 };

        for (int i = 0; i < sortArr.length-1; i++) {
            for (int j = 0; j < sortArr.length-i-1; j++) {
                if(sortArr[j] > sortArr[j+1]){
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j+1];
                    sortArr[j+1] = temp;
                }
            }
        }

        for (int i:sortArr){
            System.out.println(i);
        }
    }

    public static void testAbstractFactory(){
        AppleProductFactory appleProductFactory = new AppleProductFactory();
        ProductA1 productA1 = (ProductA1) appleProductFactory.createProductA();
        ProductB1 productB1 = (ProductB1) appleProductFactory.createProductB();
        productA1.getName();
        productB1.getName();

        BananaProductFactory bananaProductFactory = new BananaProductFactory();
        ProductA2 productA2 = (ProductA2) bananaProductFactory.createProductA();
        ProductB2 productB2 = (ProductB2) bananaProductFactory.createProductB();
        productA2.getName();
        productB2.getName();
    }

    public static void testFactoryMethod(){
        AppleFactory appleFactory = new AppleFactory();
        Fruit fruit = appleFactory.getFruit();

        GrapeFactory grapeFactory = new GrapeFactory();
        Grape grape = (Grape) grapeFactory.getFruit();

        BananaFactory bananaFactory = new BananaFactory();
        Banana banana = (Banana)bananaFactory.getFruit();
    }

    public static void testSimpleFactory(){
        Fruit fruit = SimpleFactory.getFruit(Grape.class);

        Apple apple = (Apple)SimpleFactory.getFruit(Apple.class);

        Banana banana = (Banana)SimpleFactory.getFruit(Banana.class);
    }

    public static void testSingleton(){

        Singleton singleton = Singleton.getInstance();
    }

    public void testJdkProxy(){
        UserService userService = new UserServiceImpl();

        InvocationHandler invocationHandler = new JDKDynamicProxy(userService);

        UserService userServiceProxy = (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(),userService.getClass().getInterfaces() , invocationHandler);

        System.out.println(userServiceProxy.getName(1));
        System.out.println(userServiceProxy.getAge(1));
    }

    public void testCglibProxy(){
//        CglibProxy cglibProxy = new CglibProxy();
//
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(UserServiceImpl);
//        enhancer.setCallback(cglibProxy);
//
//        UserService o = (UserService)enhancer.create();
//        o.getName(1);
//        o.getAge(1);

        CglibProxy cglibProxy = new CglibProxy();

        UserService o = (UserService)cglibProxy.getInstance(new UserServiceImpl());
        o.getName(1);
        o.getAge(1);
    }
}
