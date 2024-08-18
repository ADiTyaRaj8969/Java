import java.util.*;
class Patten{
    public static void main(String[] args) {
        //1st
        System.out.println("1th");
        int m=4;
        int n=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==m||j==n){System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    System.out.println();
    //2nd
    System.out.println("2th");
    
    for(int a=1;a<=4;a++){
        int b=0;
        for(b=0;b<a;b++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("3th");
    //3rd
    for(int a=4;a>=1;a--){
        int b=0;
        for(b=0;b<a;b++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("4th");
    //4th
    n=4;
    
    for(int a=1;a<=4;a++){
        for(m=1;m<=(n-1);m++){
            System.out.print(" ");
        }
        n=n-1;
        for(int b=0;b<a;b++){
            System.out.print("*");
        }


        System.out.println();
    }
    System.out.println();
    //5th
    System.out.println("5th");
    for(int a=1;a<=5;a++){
        int b=1;
        for(b=1;b<=a;b++){
            System.out.print(+b);
        }
        System.out.println();
    }
    System.out.println();
    //6th
    System.out.println("6th");
    for(int a=5;a>=1;a--){
        int b=1;
        for(b=1;b<=a;b++){
            System.out.print(+b);
        }
        System.out.println();
    }
    System.out.println();
    //7th
    System.out.println("7th");
    int x=1;
    for(int a=1;a<=5;a++){
        int b=1;
        
        for(b=1;b<=a;b++,x++){
            System.out.print(" "+x);
        }
        System.out.println();
    }
    System.out.println();
    x=0;
    //8th
    System.out.println("8th");
    m=5;
    n=5;
    for(int a=1;a<=m;a++){
        for(int b=1;b<=a;b++){
            if((a+b)%2==0){
                System.out.print("1");
            }
            else{System.out.print("0");}
        }
        System.out.println();
    }
    System.out.println();
    //10th
    System.out.println("10th");
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(  "*");
        }
        for(int j=1;j<=2*(4-i);j++){
            System.out.print(" ");
        }
        
        
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
        
    }
    for(int i=4;i>=1;i--){
         for(int j=1;j<=i;j++){
             System.out.print(  "*");
         }
         for(int j=1;j<=2*(4-i);j++){
             System.out.print(" ");
         }
        for(int j=1;j<=i;j++){
             System.out.print("*");
         }
         System.out.println();
        
     }
    System.out.println();
    //11th
    System.out.println("11th");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=(5-i);j++){
            System.out.print(" ");
        }
        System.out.println("*****");
        System.out.println();
    }
    //12th
    System.out.println("12th");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=(5-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(+i);
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println();
    //13th
    System.out.println("13th");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=(5-i);j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(+j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(+j);
        }
        System.out.println();
        

    }
    System.out.println();
    //14th
    System.out.println("14");
    for(int i=1;i<=4;i++){
        for(int j=1;j<=(4-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=4;i>=1;i--){
        for(int j=1;j<=(4-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }



}
}
