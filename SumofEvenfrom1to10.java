public class SumofEvenfrom1to10 {
    public static void main(String[] args) {
        int i=0,sum=0;
        while (i<=10) {
            if(i%2==0){
            sum+=i;}
            i++;
        }
        System.out.println("sum is "+sum);
    }
}
