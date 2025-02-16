// You are using Java
class StringManipulation {
    //type your code here
    public static String insertSubstring(String org,String substr, int pos){
        StringBuilder strbuild = new StringBuilder(org);
        strbuild.insert(pos,substr);
        return strbuild.toString();
    }
    // Scanner sc = new Scanner(System.in);
    // String orgstr = sc.nextLine();
    // String substr = sc.nextLine();
    // int idxpos = sc.nextInt();
    // StringBuilder strbuild = new StringBuilder(orgstr);
    // substr.insert(idxpos,substr);
    // String modstr = substr.toString();
    // System.out.println(modstr);
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String originalString = scanner.nextLine();
        String substringToInsert = scanner.nextLine();
        int insertionPosition = scanner.nextInt();
        String result = StringManipulation.insertSubstring(originalString, substringToInsert, insertionPosition);
        System.out.println(result);

        scanner.close();
    }
}
