package sample.s1;

public abstract class Base {


    public Base() {
    }

    abstract Base a1();

    protected abstract void a2();

    public static void aaa() {
    }

    protected void p() {
        Inner inner = new Inner();
        inner.innerP();
    }

    public class Inner {

        public void innerT() {
            p();
            aaa();
        }

        private void innerP() {

        }
    }

    private static class Nested {

        public void nestedT() {

        }
    }
}
