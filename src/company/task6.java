package company;

  class Items {
        private int w;
        private int v;

        public Items(int w, int v){
            this.w = w;
            this.v = v;
        }

        public int getW() {
            return w;
        }

        public int getV() {
            return v;



    }
 }
     public class task6 {
        static final int MAX_WEIGHT = 14;

      static Items[] items = {
                new Items(5, 3),
                new Items(10, 5),
                new Items(6, 4),
                new Items(5, 2)
        };

        public static void main(String[] args) {
            System.out.println(findBestResult(items.length - 1, MAX_WEIGHT));
        }

        private static int findBestResult(int i, int weigth) {
            if (i < 0) {
                return 0;
            }
            if (items[i].getW() > weigth) {
                return findBestResult(i-1, weigth);
            }
            else {
                return Math.max(findBestResult(i-1, weigth), findBestResult(i-1, weigth - items[i].getW()) + items[i].getV());
            }
        }
    }
