class Stu{
    private String name;
    private int roll;
    private String city;
    private double num;
    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setRoll(int a){
        this.roll=a;
    }
    public String getCity(){
        return city;
    }
    public double getNum(){
        return num;
    }
    public void setCity(String n2){
        this.city=n2;
    }
    public void setNum(double a2){
        this.num=a2;
    }


}


public class Encap {
    public static void main(String[] args) {
        Stu s=new Stu();
        s.setName("ansh");
        s.setCity("rajkot");
        s.setNum(972440066);
        s.setRoll(42);
        System.out.println(s.getName());
        System.out.println(s.getRoll());
        System.out.println(s.getCity());
        System.out.println(s.getNum());

        


    }
}
