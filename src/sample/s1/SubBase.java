package sample.s1;

public class SubBase extends Base {

    private static final SubBase INSTANCE = new SubBase();


    public SubBase() {
        System.out.println("const subbase");
    }

    @Override
    SubBase a1() {
        return null;
    }


    @Override
    protected void a2() {
    }

    public static void aaa() {

    }

    public void p() {

    }

    public void method(Object o) {
        System.out.println("object");
    }

    public void method(int o) {
        System.out.println("int");
    }

    public void method(Integer o) {
        System.out.println("integer");
    }

    private void test1() {
        System.out.println("master");
    }

}
