package Patterns;

import Patterns.Simple.*;

/**
 * @Author: dudg
 * @Date: Created in 15:40 2018/11/22
 * @Description:
 */
public class SimpleFactory {
    public static Fruit getFruit(Class<?> classz){

        if (classz.getName().equals(Apple.class.getName())) {
            return new Apple();
        }
        else if(classz.getName().equals(Banana.class.getName())) {
            return new Banana();
        }
        else if(classz.getName().equals(Grape.class.getName())){
            return new Grape();
        }

        return null;
    }
}






