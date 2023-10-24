package se.distansakademin;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<TodoItem> todoItems = new ArrayList<>();

    // Print evey item in our todo list
    public void printList(){
        // Loop (iterate) over each todo item with index
        for (int i = 0; i < todoItems.size(); i++) {
            var item = todoItems.get(i);// Get the current item
            int place = i+1; // Get the current place
            System.out.println(place + ". " + item); // Print todo item with current place
        }
    }

    // Add a todo item to the list
    public void addTodo(String description){
        // Create new todo
        TodoItem item = new TodoItem(description);

        // Add the new item to the list
        todoItems.add(item);
    }

    public void completeTodo(int place){
        // Complete todo at place
    }

    public void deleteTodo(int place){
        // Delete todo at place
    }
}
