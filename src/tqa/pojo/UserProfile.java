/*
 * Created By Yugal Kukde
 */
package tqa.pojo;

/**
 *
 * @author YUGAL
 */
public class UserProfile {
    private static String userid;
    private static String password;
    private static String usertype;

    public static String getUserid() {
        return userid;
    }

    public static void setUserid(String userid) {
        UserProfile.userid = userid;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserProfile.password = password;
    }

    public static String getUsertype() {
        return usertype;
    }

    public static void setUsertype(String usertype) {
        UserProfile.usertype = usertype;
    }
}
