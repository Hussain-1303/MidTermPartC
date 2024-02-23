/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author blessedguy
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Prompt the user to enter their favorite actor
        System.out.print("Enter your favorite actor: ");
        String favoriteActor = scanner.nextLine();
        
        // Display a message confirming the creation of the user profile
        System.out.println("\nUser profile created successfully!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Actor: " + favoriteActor);
        
        scanner.close();
    }
}
