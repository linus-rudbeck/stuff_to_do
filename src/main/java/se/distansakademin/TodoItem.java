package se.distansakademin;

public class TodoItem {
    private boolean completed;
    private String description;

    public TodoItem(String description) {
        completed = false;
        this.description = description;
    }

    public void complete(){
        completed = true;
    }

    @Override
    public String toString() {
        String checkbox = completed ? "[x]" : "[ ]";

        return checkbox + " " + description;
    }
}
