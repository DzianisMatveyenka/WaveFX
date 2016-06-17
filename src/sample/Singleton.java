package sample;

public class Singleton {

    public void m1() {

    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static class SingletonHelper {

        private static final Singleton INSTANCE = new Singleton();

        public void mm1() {

        }
    }

    public class Hello {
        public void hm () {
            m1();
        }
    }
}
