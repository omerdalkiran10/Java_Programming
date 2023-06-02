package day18_garbageCollection;

public class TestPizzaObjects {

    public static void main(String[] args) {

        Warmup_Pizza pizza1 = new Warmup_Pizza();

        // pizza1.size = 'L';

        pizza1.setInfo('L', 2, 3);


        Warmup_Pizza pizza2 = new Warmup_Pizza();

        //  pizza2.size = 'M';

        pizza2.setInfo('S', 1, 2);


        System.out.println( pizza1 );
        System.out.println(pizza2);

        System.out.println("-------------------------------------------------");

        double total = 0;     // if we calculate 20 Pizza for each size

        for (int i = 0; i < 20; i++) {

            Warmup_Pizza small = new Warmup_Pizza();
            small.setInfo('S', 2, 2);
            total += small.calcCost();

            Warmup_Pizza medium = new Warmup_Pizza();
            medium.setInfo('M', 3, 4);
            total += medium.calcCost();

            Warmup_Pizza large = new Warmup_Pizza();
            large.setInfo('L', 4, 5);
            total += large.calcCost();

        }


        System.out.println("total = " + total);




    }

}