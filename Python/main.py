#Punto de entrada de la aplicación

#Se importa el elemento (nombre del archivo y el nombre de la clase)
from car import Car 
from account import Account

if __name__ == "__main__":
    print("hola mundo")
    car = Car("AMS234", Account("Andres Herrera", "ANDA456"))
    print(vars(car))
    print(vars(car.driver))
# Imprimirá en formato JSON


    #car2 = Car()
    #car2.license = "MBE324"
    #car2.driver = "Martha Wayne"
    #print(vars(car2)) 
    