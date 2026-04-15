public class Circle
{
    int radius;
    public Circle(int radius) { this.radius = radius; } // 생성자1

    public void set(int radius) { this.radius = radius; } // set
    public static void main(String[] args)
    {
        Circle ob1 = new Circle(1); // 생성초기화
        Circle ob2 = new Circle(2); // 생성초기화
        Circle s;

        s = ob2; // 복사, s->2
        ob1 = ob2; //객체 치환, 복사가 아님, ob1->2
        System.out.println("ob1.radius=" + ob1.radius); //2
        System.out.println("ob2.radius=" + ob2.radius); //2

    }

}