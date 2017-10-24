package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option = 0;
        int count = 1;
        String enterIngredients = " ";
        String enterRecipe = " ";
        String answer = " yes ";
        String ingrdients = " ";
        String directions = " ";
        String enterDirections = " ";
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> recipe = new ArrayList<String>();
        recipe.add(ingrdients);
        recipe.add(directions);
        do {
            if (answer.equalsIgnoreCase("y")) {
                System.out.println(" add ingredients");
            }


            System.out.println(" Add Ingredients");
            answer = keyboard.nextLine();

            System.out.println(" show directions ");
            answer = keyboard.nextLine();

            System.out.println("Enter a number to select a menu option:");
            option = keyboard.nextInt();
            keyboard.nextLine();
            if (option == 1) {
                System.out.println(" add ingredients to the recipe:");
                enterIngredients = keyboard.nextLine();
                recipe.add(enterIngredients);
                System.out.println(recipe.get(recipe.indexOf(enterIngredients)));

            }
            if (option == 2) {
                System.out.println(" add more directions to the recipe:");
                enterDirections = keyboard.nextLine();
                recipe.add(enterDirections);
                System.out.println(recipe.get(recipe.indexOf(enterDirections)));
                for (String eachRecipe : recipe) {
                    System.out.println(recipe);
                }
            }


        } while (option != 3);
    }

    public static void colorDisplay (ArrayList<String> data){
        for (String recipe : data) {

            System.out.println(recipe);
        }

}
}
