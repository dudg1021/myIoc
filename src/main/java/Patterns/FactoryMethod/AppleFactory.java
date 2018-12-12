package Patterns.FactoryMethod;

import Patterns.Simple.Apple;
import Patterns.Simple.Fruit;

/**
 * @Author: dudg
 * @Date: Created in 17:14 2018/11/22
 * @Description:
 */
public class AppleFactory implements IFruitFactory{
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
