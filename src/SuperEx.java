class Point
{
    private int x, y;
    public Point(){
        this.x = this.y = 0;
        System.out.println("생성자");
    }

    public Point(int x, int y) //생성자
    {
        this.x = x; this.y = y;
        System.out.println("xy생성자");

    }
    public void showPoint()
    {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point{
    private String color;
    public ColorPoint(int x, int y, String color)
    {
        super(x,y); // 생성자
        this.color = color;
    }

    public void showColorPoint()
    {
        System.out.print(color);
        showPoint();
    }
}

public class SuperEx
{
    public void main(String[] args)
    {
        ColorPoint cp = new ColorPoint(5,6,"blue");
        cp.showColorPoint();
    }
}