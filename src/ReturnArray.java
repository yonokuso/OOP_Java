public class ReturnArray
{
    static int[] makeArray()
    {
        int temp[] = new int[4];
        for (int i = 0; i<temp.length; i++)
            temp[i] = i; // 0123으로 초기화
        return temp; // 배열 리턴
    }

    public static void main (String[] args)
    {
        int intArray[]; // 배열 레퍼런스 변수 선언
        intArray = makeArray(); // 메소드로부터 배열 전달받음
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i]+" "); // 배열 모든 원소 출력
    }
    
}
