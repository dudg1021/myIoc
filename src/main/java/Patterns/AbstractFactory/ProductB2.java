package Patterns.AbstractFactory;

/**
 * @Author: dudg
 * @Date: Created in 12:08 2018/11/23
 * @Description:
 */
public class ProductB2 extends AbstractProductB {
    @Override
    public void getName() {
        System.out.println("ProductB2------getName()");
    }

    @Override
    public void getUsage() {
        System.out.println("ProductB2------getUsage()");
    }
}
