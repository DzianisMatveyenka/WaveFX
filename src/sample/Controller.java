package sample;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private int a;

    private static int b;

    public Controller() {
        System.out.println("constr");
    }

    private static class Helper {
        private static Controller getInstance() {
            b = 5;
            return new Controller();
        }

        private void sadf() {

        }
    }

    public static Controller getInstance() {
        List<?> list = new ArrayList<Object>();
        Object p = list.get(0);
        class Holder {
            private void hold() {

            }

            public void sss() {

            }
        }

        Holder holder = new Holder();
        holder.hold();
        holder.sss();

        Helper h = new Helper();
        h.sadf();
        return Helper.getInstance();
    }
}
