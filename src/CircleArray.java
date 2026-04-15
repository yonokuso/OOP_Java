class Circle2
{
    int radius;
    public Circle2(int radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return 3.14*radius*radius;
    }
}

public class CircleArray // public을 붙여서 얘가 파일이름이어야 실행됨
{
    public static void main(String[] args)
    {
        Circle2 [] c; // 배열 선언
        c = new Circle2[5]; // 배열 생성

        for(int i = 0; i < c.length; i++)
        {
            c[i] = new Circle2(i); // 레퍼런스 생성
        }

        for(int i=0; i<c.length; i++)
        {
            System.out.print((int)(c[i].getArea() ) + " ");
        }
    }
}