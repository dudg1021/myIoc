import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * @Author: dudg
 * @Date: Created in 18:03 2018/11/21
 * @Description:
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("++++++before "+ methodProxy.getSuperName()+"++++++");
        System.out.println(method.getName());
        Object o1 = methodProxy.invokeSuper(o,objects);
        System.out.println("++++++after "+ methodProxy.getSuperName()+"++++++");
        return o1;
    }
}
