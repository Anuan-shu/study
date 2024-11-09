package Question01.src.com.oo.cc;

import Question01.src.com.oo.bb.B;

public class C {
    private B b;

    public C(int i) {
        b = new B(i);
        System.out.println("C" + i);
    }
}