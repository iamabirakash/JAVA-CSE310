// You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.contains(b)){
            System.out.println("Found Substring: "+b);
        }
        else{
            System.out.println("Substring not found");
        }
        
        
        
    }
