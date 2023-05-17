class Main {
    public static void main(String[] args){
        System.out.println("hola mundo");

        //Métodos constructores
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("ABE234", new Account("Andrea Herrera", "AND456")); 
        car2.passenger = 5;
        car.printDataCar();
    }
}