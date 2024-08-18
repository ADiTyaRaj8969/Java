public class ConstructorIn {
    
    int sum;
     ConstructorIn(int a,int b){
      
      sum=a+b;
    
    }
    
    
    public static void main(String[] args) {
        ConstructorIn x=new ConstructorIn(50,70);
        System.out.println("a="+x.sum);
        
    }
}
