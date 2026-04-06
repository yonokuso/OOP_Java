import java.util.Scanner;

public class ArrayAccess
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5]; // 

        //int max = 0;
        int min = 0;
        System.out.println("양수 5개를 입력하세요.");

        for (int i=0; i<5; i++)
        {
            intArray[i]=scanner.nextInt(); // 입력받은 정수를 배열에 저장

            if (intArray[0] > min) // min값이 0번보다 작으면
                min = intArray[i]; // min = 0번

            else if (intArray[i] < min) // 배열이 min보다 작으면
                min = intArray[i]; // min에 넣음
            
        }
        //System.out.print("가장 큰 수는 " + max +"입니다.");
        System.out.print("가장 작은 수는 " + min +"입니다.");


        scanner.close();
    }
}