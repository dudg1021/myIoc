package Patterns.AbstractFactory;

/**
 * @Author: dudg
 * @Date: Created in 12:05 2018/11/23
 * @Description:
 */
public class ProductA2 extends AbstractProductA {
    @Override
    public void getName() {
        System.out.println("ProductA2------getName()");
    }

    @Override
    public void getUsage() {
        System.out.println("ProductA2------getUsage()");
    }
}
