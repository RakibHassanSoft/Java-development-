package Third10;
/*
 27. Make a Task class with taskName, dueDate, and status. From an array, display all pending tasks sorted by due date.
 */
public class Task27 {
      String taskName;
    String dueDate; // "yyyy-MM-dd"
    boolean isComplete;

    Task27(String name, String date, boolean complete) {
        taskName = name;
        dueDate = date;
        isComplete = complete;
    }

    boolean isPending() {
        return !isComplete;
    }
}
