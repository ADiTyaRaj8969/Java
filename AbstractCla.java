abstract class Car{
    public abstract double getAve();
}
class lam extends Car{
    

    @Override
    public double getAve() {
        // TODO Auto-generated method stub
        return 22.7;
    }
}
class Bug extends Car{
    

    @Override
    public double getAve() {
        // TODO Auto-generated method stub
        return 100.3;
    }
}


public class AbstractCla {
    public static void main(String[] args) {
        lam l=new lam();
        Bug b=new Bug();
        System.out.println(l.getAve());
        System.out.println(b.getAve());
    }
}
