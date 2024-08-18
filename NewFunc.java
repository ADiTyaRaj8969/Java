public class NewFunc {
    public static void main(String[] args) {
        //1st
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n", s1, x);
            }
            System.out.println("================================");

            //2nd
        //      Scanner scanner = new Scanner(System.in);
        // int lineNumber = 0;
        
        // while (scanner.hasNext()) {
        //     lineNumber++;
        //     String line = scanner.nextLine();
        //     System.out.println(lineNumber + " " + line);
        // }
            
    }
}
