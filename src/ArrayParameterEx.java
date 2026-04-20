public class ArrayParameterEx
{
    static void replaceSpace(char a[]) // 배열 레퍼런스 전달
    {
        for (int i = 0; i <a.length; i++)
        {
            if (a[i] == ' ')
                a[i] = ','; // 공백을 반점으로 대체
        }

    }   
    static void printCharArray(char a[])
    {
        for (int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]); // i번째 문자 프린트
        }
        System.out.println(); // enter
    }

    public static void main (String args[])
    {
        char c[] = {'T','h','i','s',' ','i','s',' ','a',' ',
        'p','e','n','c','i','l','.'};
        printCharArray(c);
        replaceSpace(c); // 대체
        printCharArray(c);
    }
}