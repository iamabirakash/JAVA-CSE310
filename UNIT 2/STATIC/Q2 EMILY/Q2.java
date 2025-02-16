// You are using Java
class ExpenseAnalyzer {
     //type your code here
    public int calculateMaxRemainingBudget(int[] a){
        int sum = 0;
        for(int profit:a){
            sum += profit;
        }
        int minsum = Integer.MAX_VALUE;
        int cursum = 0;
        for(int val:a){
            cursum += val;
            if(cursum < minsum){
                minsum = cursum;
            }
            if(cursum>0){
                cursum = 0;
            }
        }
        int max = sum - minsum;
        if(minsum >= 0){
            max = sum;
        }
        return max;
        // public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // for(int i=0;i<n;i++){
        //     a[i] = sc.nextInt();
        // }
        // int sum = 0;
    }
}
class MaxSumAfterDeletion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] expenses = new int[n];
        for (int i = 0; i < n; i++) {
            expenses[i] = scanner.nextInt();
        }

        ExpenseAnalyzer analyzer = new ExpenseAnalyzer();
        int maxRemainingBudget = analyzer.calculateMaxRemainingBudget(expenses);

        System.out.println(maxRemainingBudget);

        scanner.close();
    }
}
