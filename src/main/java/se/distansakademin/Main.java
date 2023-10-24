package se.distansakademin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList list = new TodoList();

        list.addTodo("Handla");
        list.addTodo("Städa");

        Scanner scanner = new Scanner(System.in);

        while (true) {

            list.printList();

            System.out.println("Available commands");
            System.out.println("add:<description> / cpl:<place> / del:<place>");
            System.out.print("Enter command: ");

            // add:handla --> lägg till "handla"
            // cpl:2 --> markera nr 2 som klar
            // del:2 --> ta bort nr 2

            scanner.next();
        }

    }
}