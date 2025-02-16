// You are using Java
class StringManipulation {
   //type your code here
   public static String concatenateUnique(String firststr,String secondstr){
       StringBuilder result = new StringBuilder();
       for(char c : firststr.toCharArray()){
           if(result.indexOf(String.valueOf(c))==-1){
               result.append(c);
           }
       }
       for(char c : secondstr.toCharArray()){
           if(result.indexOf(String.valueOf(c))==-1){
               result.append(c);
           }
       }
       return result.toString();
   }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String concatenatedString = StringManipulation.concatenateUnique(firstString, secondString);
        System.out.println(concatenatedString);

        scanner.close();
    }
}
