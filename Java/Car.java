class Car {
    // Atributos con variables globales:
    Integer id;
    String license; // Las placas son alfanuméricas
    Account driver;
    Integer passenger;

    //Método constructor Car con sus parámetros de forma local:
    public Car(String license, Account driver){
        this.license = license; //This representa el objeto 
        this.driver = driver;
    }

    //Método para obtener los datos de la clase:
    void printDataCar() {
        System.out.println("License: " + license + "Name Driver: " + driver.name);
    }
}