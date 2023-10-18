public class Exercise1 {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10,  j < 10; i++, j++) {
            System.out.println(i + " + " + j + " = " + (i+j));
        }// 컴파일오류: for문 조건식 수정해야함   i < 10, j < 10   =>  i < 10&& j < 10
        System.out.println("I’ve printed out the sums of i and j up to " + i + "," + j);
        // 컴파일오류: i와 j가 정의되어 있지 않음
    }
}