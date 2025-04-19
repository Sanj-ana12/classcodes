package test;

abstract class Vehicle {
 protected String make;
 protected String model;
 protected int year;
 protected String fuelType;

 public Vehicle(String make, String model, int year, String fuelType) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.fuelType = fuelType;
 }

 public abstract double calculateFuelEfficiency(); 
 public double distanceTraveled(double fuelUsed) {
     return calculateFuelEfficiency() * fuelUsed;
 }
 public abstract int getMaxSpeed(); 

 public void displayInfo() {
     System.out.println(year + " " + make + " " + model + " (" + fuelType + ")");
 }
}

class Car extends Vehicle {
 public Car(String make, String model, int year, String fuelType) {
     super(make, model, year, fuelType);
 }

 public double calculateFuelEfficiency() {
     return 15.0; 
 }
 public int getMaxSpeed() {
     return 180;
 }
}
class Truck extends Vehicle {
 public Truck(String make, String model, int year, String fuelType) {
     super(make, model, year, fuelType);
 }
 public double calculateFuelEfficiency() {
     return 8.0;
 }

 public int getMaxSpeed() {
     return 120; 
 }
}
class Motorcycle extends Vehicle {
 public Motorcycle(String make, String model, int year, String fuelType) {
     super(make, model, year, fuelType);
 }
   public double calculateFuelEfficiency() {
     return 35.0; 
 }

 public int getMaxSpeed() {
     return 160; 
 }
}
public class Main {
 public static void main(String[] args) {
     Car car = new Car("Toyota", "Camry", 2022, "Petrol");
     Truck truck = new Truck("Volvo", "FH16", 2020, "Diesel");
     Motorcycle bike = new Motorcycle("Yamaha", "R15", 2023, "Petrol");

     Vehicle[] vehicles = {car, truck, bike};

     for (Vehicle v : vehicles) {
         v.displayInfo();
         System.out.println("Fuel Efficiency: " + v.calculateFuelEfficiency() + " km/l");
         System.out.println("Distance Traveled with 10L: " + v.distanceTraveled(10) + " km");
         System.out.println("Max Speed: " + v.getMaxSpeed() + " km/h");
         System.out.println("--------------------------------------------------");
     }
 }
}
