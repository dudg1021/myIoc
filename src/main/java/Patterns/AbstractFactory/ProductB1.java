package Patterns.AbstractFactory;

/**
 * @Author: dudg
 * @Date: Created in 12:07 2018/11/23
 * @Description:
 */
public class ProductB1 extends AbstractProductB {
    @Override
    public void getName() {
        System.out.println("ProductB1------getName()");
    }

    @Override
    public void getUsage() {
        System.out.println("ProductB1------getUsage()");
    }
}
