interface Function<T,R> {
    R apply(T t);
}
class convertToString implements Function<Integer, String>{
    public String apply (Integer num){
        return "Number: "+num;
    }
}
public class intToString {
    public static void main(String[] args) {
        Function<Integer, String> obj = new Function<Integer,String>(){
            public String apply(Integer num){
                return "Number: "+num;
            }
        };
        System.out.println(obj.apply(10));
    }
}
