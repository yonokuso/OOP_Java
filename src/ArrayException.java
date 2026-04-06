public class ArrayException
{
    public static void main(String[] args)
    {
        int[] intArray = new int[5];
        intArray[0] = 0; // 0번만 초기화
        try{
            for(int i=0; i<5; i++)
            {
                intArray[i+1] = i+1+intArray[i]; // 0+1+0=1
                System.out.println("intArray["+i+"]"+"="+intArray[i]);
            } // i=4에서 예외발생
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }
    }
}