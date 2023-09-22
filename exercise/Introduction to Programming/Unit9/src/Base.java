public class Base {
    public Base() {
        infob = "I am an object of the Base class";
    }

    public String getInfo() {
        return infob;
    }

    private String infob;
}

class Derived extends Base {
    public Derived() {
        super();
        infod = "I am an object of the Derived class";
    }

    public String getInfo() {
        return infod + ", " + super.getInfo();
    }

    private String infod;
}

class Exercise3 {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        System.out.println(b.getInfo());
        System.out.println(d.getInfo());
        b = d;
        System.out.println(b.getInfo());
    }
}

// 컴파일 에러: public class는 .java에 한개만 있어야 함
// public class명과 파일 이름은 항상 같아야함 - 파일명 Base변경
// Base말고 public class 말고 class로

// System.out.println(b.getInfo());  -> I am an object of the Base class
// System.out.println(d.getInfo());  -> I am an object of the Derived class, I am an object of the Base class
// b=d 업캐스팅 b는 Derived()객체를 가르키므로 System.out.println(d.getInfo());와 같이 출력됨
