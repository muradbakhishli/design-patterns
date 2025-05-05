package creational.builder;

public class Stadium {

    private String name;
    private int capacity;
    private double length;
    private double width;

    private Stadium(Builder builder) {
        this.name = builder.name;
        this.capacity = builder.capacity;
        this.length = builder.length;
        this.width = builder.width;
    }

    public static class Builder {

        private String name;
        private int capacity;
        private double length;
        private double width;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setLength(double length) {
            this.length = length;
            return this;
        }

        public Builder setWidth(double width) {
            this.width = width;
            return this;
        }

        public Stadium build(){
            return new Stadium(this);
        }

    }

    @Override
    public String toString() {
        return "Stadium{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
