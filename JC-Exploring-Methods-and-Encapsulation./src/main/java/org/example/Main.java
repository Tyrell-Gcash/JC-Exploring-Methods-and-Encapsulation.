package org.example;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void modifyValue(int value) {
        value = 100;
        System.out.println("Inside method: " + value);
    }

    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }

    public static void changeStudentName(Student student, String newName){
        student.setName(newName);
    }

    public static void findLargest(int... numbers) {
        OptionalInt largest = Arrays.stream(numbers).max();
        if(largest == OptionalInt.empty()){
            largest = OptionalInt.of(Integer.MIN_VALUE);
        }


        System.out.println("Largest " + ((numbers.length == 0)? "with no numbers": "in " + Arrays.toString(numbers) + " is: ") + largest.getAsInt());
    }

    public static void main(String[] args) {

//        //1. Designing Methods
//        Car myCar = new Car();
//        myCar.startEngine();
//        String status = myCar.drive(60);
//        System.out.println(status);
//        myCar.turnOffEngine();

//        //2. Passing Parameters: Primitives vs. Objects
//        int originalValue = 50;
//        System.out.println("Before method call: " + originalValue);
//        modifyValue(originalValue);
//        System.out.println("After method call: " + originalValue);
//        Student alex = new Student("Alex");
//        System.out.println("Name before change: " + alex.getName());
//        changeStudentName(alex,"Jordan");
//        System.out.println("Name after change: " + alex.getName());

//        //3. Using Varargs
//        printMessages("Hello", "World");
//        printMessages("Testing", "Varargs", "Here");
//        printMessages();
//        findLargest(10, 5, 25, 15);
//        findLargest(-5, -1, -10);
//        findLargest();

//        //4. Access Specifiers
//        Account myAccount = new Account();
//        myAccount.displayAccountDetails();
//        SmartDoor door = new SmartDoor();
//        System.out.println("Is the door locked? " + door.isLocked());
//        door.unlockdoor();
//        System.out.println("Is the door locked? " + door.isLocked());
//        door.lockdoor();
//        System.out.println("Is the door locked? " + door.isLocked());

//        //5. Static Methods and Variables
//        System.out.println("App Name: " + Utility.getAppName());
//
//        // The following line would cause a compile-time error
//        // System.out.println("Instance ID: " + Utility.getInstanceId());
//
//        Utility utilInstance = new Utility();
//        System.out.println("Instance ID: " + utilInstance.getInstanceId());
//        System.out.println(25.0 + " degrees C is " + Converter.celsiusToFahrenheit(25.0)  + " degrees F.");

//        //6. Method Overloading
//        Display d = new Display();
//        d.show(42);
//        d.show("Hello");
//        d.show("Goodbye", 3);
//        System.out.println(25.0 + " degrees C is " + Converter.celsiusToFahrenheit(25.0)  + " degrees F.");
//        System.out.println(77.0 + " degrees F is " + Converter.fahrenheitToCelsius(77.0)  + " degrees C.");

//        //7. Constructors and Constructor Overloading
//        Pizza pizza1 = new Pizza();
//        pizza1.display();
//
//        Pizza pizza2 = new Pizza("Pepperoni");
//        pizza2.display();
//
//        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
//        pizza3.display();

//        Computer comp1 = new Computer("Generic", 8);
//        Computer comp2 = new Computer("Dell", 8);
//        Computer comp3 = new Computer("Apple", 16);
//
//        System.out.println("Computer 1:" + comp1.getDetails());
//        System.out.println("Computer 2:" + comp2.getDetails());
//        System.out.println("Computer 3:" + comp3.getDetails());

//        //8. Encapsulation
//        Thermostat stat = new Thermostat(22.5);
//        System.out.println("Initial temp: " + stat.getTemperatureCelsius());
//
//        stat.setTemperatureCelsius(5.0); // Try to set an invalid temp
//        System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());
//
//        stat.setTemperatureCelsius(25.0); // Set a valid temp
//        System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());
        User user = new User("12345678");
        System.out.println(user.getPassword());
        user.setPassword("pass");
        System.out.println(user.getPassword());
        user.setPassword("secure_password_123");


    }
}

class Car{
    public void startEngine() {
        System.out.println("Engine has started.");
    }

    public String drive(int speed) {
        return "The car is moving at " + speed + " mph.";
    }

    public void turnOffEngine(){
        System.out.println("Engine has been turned off.");
    }
}

class Student{
    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Account {
    private String owner = "Alice";
    private double balance = 1200.50;

    private String getDetails() {
        return owner + " has a balance of $" + balance;
    }

    public void displayAccountDetails() {
        // We can call the private method from within the class
        System.out.println(getDetails());
    }
}

class Bank {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.displayAccountDetails();

        // The following line would cause a compile-time error if uncommented
        // System.out.println(myAccount.balance);
    }
}

class SmartDoor{
    private boolean isLocked;

    public SmartDoor(){
        this.isLocked = true;
    }

    public void lockdoor(){
        System.out.println("Locking the door...");
        this.isLocked = true;
    }

    public void unlockdoor(){
        System.out.println("Unlocking the door...");
        this.isLocked = false;
    }

    public boolean isLocked(){
        return isLocked;
    }
}

class Utility {

    public static String getAppName() {
        return "My Awesome App";
    }

    public String getInstanceId() {
        return "ID-12345";
    }
}

class Converter{

    public static double celsiusToFahrenheit(double celsius){
        double Fahrenheit = (celsius * 9.0/5.0) + 32;
        return Fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double Celcius = (fahrenheit - 32) * 5.0/9.0;
        return Celcius;
    }
}

class Display {

    public void show(String message) {
        System.out.println("Message: " + message);
    }

    public void show(String message, int times) {
        System.out.println("Repeating Message:");
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    public void show(int number) {
        System.out.println("Number: " + number);
    }
}

class Pizza {
    private String toppings;
    private int size; // in inches

    public Pizza() {
        this.toppings = "Cheese";
        this.size = 12;
        System.out.println("Default pizza created.");
    }

    public Pizza(String toppings) {
        this(); // Calls the no-argument constructor first
        this.toppings = toppings;
        System.out.println("Pizza with custom toppings created.");
    }

    public Pizza(String toppings, int size) {
        this.toppings = toppings;
        this.size = size;
        System.out.println("Fully custom pizza created.");
    }

    public void display() {
        System.out.println("Size: " + size + " inches, Toppings: " + toppings);
    }
}

class Computer {
    private String brand;
    private int ramInGB;

    public Computer() {
        this("Generic"); // Calls constructor with brand only
    }

    public Computer(String brand) {
        this(brand, 8); // Calls constructor with brand and RAM
    }

    public Computer(String brand, int ramInGB) {
        this.brand = brand;
        this.ramInGB = ramInGB;
    }

    public String getDetails() {
        return "Brand = " + brand + ", RAM = " + ramInGB + "GB";
    }
}

class Thermostat {
    private double temperatureCelsius;

    public Thermostat(double temp) {
        // Use the setter in the constructor to enforce rules from the start
        setTemperatureCelsius(temp);
    }

    public double getTemperatureCelsius() {
        return this.temperatureCelsius;
    }

    public void setTemperatureCelsius(double temp) {
        if (temp >= 10.0 && temp <= 30.0) {
            this.temperatureCelsius = temp;
        } else {
            System.out.println("Error: Temperature must be between 10.0 and 30.0 Celsius.");
        }
    }
}

class User{
    private String password;

    public User(String password){
        setPassword(password);
    }

    public String getPassword(){
        String password;
        password = "Current masked password: " + "*".repeat(this.password.length());

        return password;
    }

    public void setPassword(String password){

        System.out.println("Attempting to set valid password '" + password + "'...");
        if(password.length() < 8){
            System.out.println("Error: Password must be at least 8 characters long.");
        }
        else{
            this.password = password;
        }

    }
}