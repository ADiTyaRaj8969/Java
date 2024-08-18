class Shape{
    void draw(){
        System.out.println("Draw Shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Draw Circle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Draw Square");
    }
}
class OverrideDemo{
    public static void main (String[] args){
        Circle c = new Circle();
        c.draw();
        Square sq = new Square();
        sq.draw();
        Shape sh = new Shape();
        sh.draw();
    }
}