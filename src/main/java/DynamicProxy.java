import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: dudg
 * @Date: Created in 11:44 2018/11/21
 * @Description:
 */
public class DynamicProxy implements InvocationHandler {

    /**
     * 需要代理的目标类
     */
    private Object target;

    /**
     * 绑定委托对象并返回一个代理类
     * @param target
     * @return
     */
    public Object bind(Object target){
        this.target = target;

        return Proxy.newProxyInstance(target.getClass().getClassLoader() ,target.getClass().getInterfaces(), this);
    }

    /**
     *
     * @param proxy 被代理的对象
     * @param method 要调用的方法
     * @param args 方法调用时所需要的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //切面前执行
        System.out.println("切面之前执行");
        //执行业务
        result = method.invoke(target,args);
        //切面后执行
        System.out.println("切面之后执行");

        return result;
    }
}
