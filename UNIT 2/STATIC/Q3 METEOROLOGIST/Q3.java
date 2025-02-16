// You are using Java
class StringOps {
   //type your code here
   public String manipulate(String[] args){
       String result;
       if(args.length == 1){
           result =  new StringBuilder(args[0]).reverse().toString();
       } else if(args.length == 2){
           result = args[0]+args[1];
       } else {
           result = "Invalid input";
       }
       return result;
   }
}
class Main {
    public static void main(String[] args) {
        StringOps seetha = new StringOps();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] input_data = input.split(" ");
        String result = seetha.manipulate(input_data);
        System.out.println(result);
    }
}
