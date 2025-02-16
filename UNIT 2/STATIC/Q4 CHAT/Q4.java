// You are using Java
class EncoderDecoder {
     //type your code here
    public String encode(String[] args){
        StringBuilder encoded = new StringBuilder();
        for(int i=0;i<args.length;i++){
            encoded.append(args[i]);
            if(i<args.length-1){
                encoded.append("#");
            }
        }
        return encoded.toString();
    }
    public String[] decode(String encodedData){
        return encodedData.split("#");
    }
}
class Main {
    public static void main(String[] args) {
        EncoderDecoder encoderDecoder = new EncoderDecoder();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] messages = userInput.split(" ");
        String encoded = encoderDecoder.encode(messages);
        System.out.println("Encoded: " + encoded);
        String[] decoded = encoderDecoder.decode(encoded);
        System.out.println("Decoded: ");
        for (String message : decoded) {
            System.out.println(message);
        }

        scanner.close();
    }
}
