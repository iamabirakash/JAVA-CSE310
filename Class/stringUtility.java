class StringUtils {
    public static boolean isNullOrEmpty(String str){
        return str==null || str.isEmpty();
    }
    public static String capitalize(String str){
        if(isNullOrEmpty(str)) return str;
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
public class stringUtility {
    public static void main(String[] args) {
        System.out.println(StringUtils.isNullOrEmpty(""));
        System.out.println(StringUtils.capitalize("hello"));
    }
}
