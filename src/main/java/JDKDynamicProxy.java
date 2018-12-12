import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: dudg
 * @Date: Created in 17:38 2018/11/21
 * @Description:
 */
public class JDKDynamicProxy implements InvocationHandler{

    private Object target;

    JDKDynamicProxy(){super();}

    JDKDynamicProxy(Object target){
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("getName".equals(method.getName())){
            System.out.println("++++++before "+method.getName() + "++++++");
            Object result = method.invoke(target,args);
            System.out.println("++++++after "+method.getName() + "++++++");
            return result;
        }
        else{
           return method.invoke(target,args);
        }
    }
}
