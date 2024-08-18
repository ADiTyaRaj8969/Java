class Market{
    void prize(){
        System.out.println("Whole Market Prize is 1Cr");
    }
}
class Vegitable extends Market{
    void prize(){
        System.out.println("Aalu Lelo");
    }
}
class Grocery extends Market{
    void prize(){
        System.out.println("Kya aapke toothpaste mai namak hai?");
    }
}
class Shoes extends Market{
    void prize(){
        System.out.println("Tera Ghar chala jainga esme");
    }
}
class Clothing extends Market{
    void Prize(){
        
        System.out.println("Mera Joota Japani,  \r\n" + //
                        "Yea patloon armani\r\n" + //
                        "Sar pe aaj topi gucci \r\n" + //
                        "Fir bhi dil hai hindustani");
    }
}



public class SuperMarketOverrind {
    public static void main(String[] args) {
        Clothing Obj1=new Clothing();
        Obj1.Prize();
        Shoes Obj2=new Shoes();
        Obj2.prize();
    }
}
