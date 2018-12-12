package Patterns.FactoryMethod;

import Patterns.Simple.Fruit;
import Patterns.Simple.Grape;

/**
 * @Author: dudg
 * @Date: Created in 17:16 2018/11/22
 * @Description:
 */
public class GrapeFactory implements IFruitFactory {
    @Override
    public Fruit getFruit() {
        return new Grape();
    }
}
