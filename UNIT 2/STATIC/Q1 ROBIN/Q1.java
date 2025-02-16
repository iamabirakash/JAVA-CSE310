// You are using Java
public static void main(String[] args) {
    //type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
        int sum = 0;
        for(int j=i+1;j<n;j++){
            sum += a[j];
        }
        if(a[i]>sum){
            System.out.println(a[i]);
        }
    }
}
