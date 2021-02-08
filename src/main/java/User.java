/**
 * @author Wuqili
 * @version 1.0
 * @date 2020/8/19 17:16
 */
public class User {
    private User() { }
    private static User instances = null;
    public static User getInstance(){
        if (instances == null)
            return new User();
        return instances;
    }
    public  void single(){
        System.out.println("多例模式");
    }
}
