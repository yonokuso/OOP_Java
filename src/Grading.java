import java.util.Scanner;
public class Grading {
    public static void main(String[] args){
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt(); // 점수 읽기
        if(score < 60) // score가 60 미만
            grade = 'F';
        else if(score < 70) // score 70미만
            grade = 'D';
        else if(score < 80) // score 80이상 90미만
            grade = 'C';
        else if (score < 90) // score 60이상 70미만
            grade = 'B';
        else // score 90 이상
            grade = 'A';
        System.out.println("학점은 "+ grade + "입니다.");

        scanner.close();
    }
}