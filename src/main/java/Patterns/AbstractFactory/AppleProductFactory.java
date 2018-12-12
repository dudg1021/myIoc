package Patterns.AbstractFactory;

/**
 * @Author: dudg
 * @Date: Created in 12:48 2018/11/23
 * @Description:
 */
public class AppleProductFactory extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
