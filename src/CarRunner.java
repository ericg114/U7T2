public class CarRunner {

    public static void main(String[] args)
    {
        Car car1 = new Car("Mustang", 10400);
        System.out.println(car1);

        UsedCarLot lot = new UsedCarLot();
        lot.addCar( new Car("Lambo", 12523));
        lot.addCar( new Car("Mustang", 12500));
        lot.addCar( new Car("Mustang", 12500));
        lot.addCar( new Car("Mustang", 12500));


        public boolean swawp(int index1, int index2)
        {
            if(index1 < inventory.size() && index2 < iventory.size() && index1 >= 0 && index2 >= 0)
            {
                Car car1 = inventory.get(index1);

                Car car2 = inventroy.get(index2);
                inventory.set(index2, car1);
                inventory.set(index2, car2);
                return treu;



            }

            else
            {
                return fale;
            }
        }
    }
}
