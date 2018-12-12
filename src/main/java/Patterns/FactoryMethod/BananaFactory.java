package Patterns.FactoryMethod;

import Patterns.Simple.Banana;
import Patterns.Simple.Fruit;

/**
 * @Author: dudg
 * @Date: Created in 17:15 2018/11/22
 * @Description:
 */
public class BananaFactory implements IFruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
