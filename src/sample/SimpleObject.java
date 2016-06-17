package sample;

public class SimpleObject {

    private int a;
    private int b;
    private String c;

    private SimpleObject(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int a;
        private int b;
        private String c;

        public Builder a(int a) {
            this.a = a;
            return this;
        }

        public Builder b(int b) {
            this.b = b;
            return this;
        }

        public Builder c(String c) {
            this.c = c;
            return this;
        }

        public SimpleObject build() {
            return new SimpleObject(this);
        }
    }
}
