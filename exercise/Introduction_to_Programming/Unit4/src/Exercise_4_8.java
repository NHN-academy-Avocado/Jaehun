
public class Exercise_4_8 {
    public static void method(int a, Account b) {           // Exercise 4.8
        a *= 2;
        b.bal *= 2;
    }
    public static void main(String[] args) {
        int c = 100;
        Account r = new Account(100);
        method(c,r);
        System.out.println(c + " " + r.bal);
    }
}

// method에서 Account 객체를 넘겨받아서 b.bal을 수정하면 값이 수정되지만
// method에서 ㅁ*=2를 하면 넘겨받은 인자가 수정되는게 아닌
// a*=2를 하면 로컬변수 a가 새로 생성되고 이게 따로 리턴되는게 아니라서 값은 변하지 않는다.