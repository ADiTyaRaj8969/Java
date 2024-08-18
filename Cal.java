import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first num");
        int fir=sc.nextInt();
        System.out.println("enter sec");
        int sec=sc.nextInt();
        System.out.println("enter third num");
        int thi=sc.nextInt();
        System.out.println("enter fourth num");
        int fou=sc.nextInt();
        System.out.println("enter Fifth num");
        int fiv=sc.nextInt();
        System.out.println("Enter 1 to find the Smallest\nEnter 2 to find largest\nEnter 3 to find sum\nEnter 4 to find average");

        int fun=sc.nextInt();
        switch (fun) {
            case 2:
            if(fir>sec&&fir>thi&&fir>fou&&fir>fiv){
                System.out.println("Largest is "+fir);
            }
            else if(sec>fir&&sec>thi&&sec>fou&&sec>fiv){
                System.out.println("Largest is "+sec);
            }
            else if(thi>fir&&sec<thi&&thi>fou&&thi>fiv){
                System.out.println("Largest is "+thi);
            }
            else if(fou>fir&&fou>thi&&sec<fou&&fou>fiv){
                System.out.println("Largest is "+fou);
            }
            else if(fiv>fir&&fiv>thi&&fiv>fou&&sec<fiv){
                System.out.println("Largest is "+fiv);
            }
                
                break;
                case 1:
                int smal=99999;
                if(smal>=fir){
                    smal=fir;
                }
                if(smal>=sec){
                    smal=sec;
                }
                if(smal>=thi){
                    smal=thi;
                }
                if(smal>=fou){
                    smal=fou;
                }
                if(smal>=fiv){
                    smal=fiv;
                }
                System.out.println("smallest is "+smal);

                
                break;
                case 3:
                System.out.println("sum is "+(fir+sec+thi+fou+fiv));
                
                break;
                case 4:
                float avg;
                avg=(fir+sec+thi+fou+fiv)/5;
                System.out.println("average is "+avg);
                
                break;
        
            default:System.out.println("enter valid num");
                break;
        }

    }
}
