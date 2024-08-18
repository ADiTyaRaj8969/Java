class Per{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setAge(int a){
        this.age=a;
    }
}



public class Encapsulation {
    public static void main(String[] args) {
Per p=new Per();
p.setName("Ansh");
p.setAge(19);
System.out.println(p.getName());
System.out.println(p.getAge());

    }
}
