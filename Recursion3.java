public class Recursion3 {


    public static void PrintPerm(String str,String per){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0, i) + str.substring(i+1);
            PrintPerm(newStr, per+curr);

        }
    }
    public static int CountPaths(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }
        
        return CountPaths(i+1, j, n, m)+CountPaths(i, j+1, n, m);
    }

    public static void main(String[] args) {
        // String str="abc";
        // PrintPerm(str, "");
        System.out.println(CountPaths(0, 0, 3, 3));
        
    }
}

