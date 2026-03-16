public class CircleArea{
    public static void main(String[] args){
        final double PI = 3.14; // 원주율을 상수로 선언

        double radius = 10.0; // 원의 반지름
        double circleArea = radius*radius*PI; // 면적계산
    
// 면적을 출력
        System.out.println("원의 면적 = " + circleArea);
    }
}