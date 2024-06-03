/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author ABDULLAHI
 */
public class Zoo {
     public static void main(String[] args) {
        
        Lion lion = new Lion("LIBAX", 5);
        Elephant elephant = new Elephant("MARODI", 10);
        Monkey monkey = new Monkey("DANYER ", 3);

        
        System.out.println("Demonstrating method overriding:");
        lion.makeSound();
        lion.eat();

        elephant.makeSound();
        elephant.eat();

        monkey.makeSound();
        monkey.eat();

        
        System.out.println("\nDemonstrating polymorphism with overloaded methods:");
        lion.makeSound(3);
        elephant.eat("fruits");
        monkey.makeSound(2);
    }
}
    
