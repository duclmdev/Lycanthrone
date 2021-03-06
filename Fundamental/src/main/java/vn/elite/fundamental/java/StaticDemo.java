package vn.elite.fundamental.java;

public class StaticDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("vn.elite.fundamental.main");
        Thread.sleep(5000);
        //        System.out.println("trong vn.elite.fundamental.main: " + A.b);
        A a = new A();
        System.out.println(a.a);
        System.out.println("trong vn.elite.fundamental.main: " + A.b);
    }

    static class A {
        static String b;

        String a;

        static {
            System.out.println("static truoc: " + b);
            b = b == null ? "gia tri moi" : "khoi tao gia tri b";
            System.out.println("static sau: " + b);
        }

        public A(String a) {
            this.a = a;
        }

        public A() {
            this.a = "gia tri a";
        }
    }
}
