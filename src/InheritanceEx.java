class Person
{
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight)
    {
        this.weight = weight;

    }

    public int getWeight()
    {
        return weight;

    }
}

class Student extends Person
{
    public void set()
    {
        age = 30; //디폴트 멤버 접근 가능
        name = "홍길동"; // 슈퍼 클래스
        height = 175;
        //weight = 99;
        setWeight(99);
    }
}

public class InheritanceEx
{
    public static void main(String[] args)
    {
        Student s= new Student();
        s.set();
    }
}