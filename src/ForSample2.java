public class ForSample2
{
    public static void main(String[] args)
    {
        int sum = 1;

        for (int i = 1; i <=10 ; i++)
        {
            sum *= i;
            System.out.print(i);

            if (i<=9) // 1-9까지는 *출력
                System.out.print("*");
            else{
                System.out.print("=");
                System.out.print(sum);
            }
        }
    }
}