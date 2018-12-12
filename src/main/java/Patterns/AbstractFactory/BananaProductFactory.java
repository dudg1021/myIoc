package Patterns.AbstractFactory;

/**
 * @Author: dudg
 * @Date: Created in 12:49 2018/11/23
 * @Description:
 */
public class BananaProductFactory extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
