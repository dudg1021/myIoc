/**
 * @Author: dudg
 * @Date: Created in 17:39 2018/11/21
 * @Description:
 */
public class UserServiceImpl implements UserService {

    @Override
    public String getName(int id) {
        System.out.println("------getName------");
        return "Tom";
    }

    @Override
    public Integer getAge(int id) {
        System.out.println("------getAge------");
        return 10;
    }
}
