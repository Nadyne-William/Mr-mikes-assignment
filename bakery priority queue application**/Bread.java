package bakery;

public class Bread {

        private String goodsName;

        private double manufactureTime;

        private int price;

        public Bread(double manufactureTime) {
            this.manufactureTime = manufactureTime;
        }

        public Bread(){};

        public double getManufactureYear() {
            return manufactureTime;
        }

        public void setManufactureYear(double manufactureTime) {
            this.manufactureTime = manufactureTime;
        }
    }

