import java.util.ArrayList;

public class TaskList {
    // FIELDS
    private String name;
    private String desc;
    private ArrayList<Task> tasks;


    // GETTERS & SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<Task> getTasks() { return tasks; }
    public void setTasks(ArrayList<Task> tasks) { this.tasks = tasks;}


    // CONSTRUCTORS
    public TaskList() {
        this.name = "";
        this.desc = "";
        this.tasks = new ArrayList<Task>();
    }


    // METHODS
    public void addTask(Task task) { tasks.add(task); }
    public void removeTask(Task task) { tasks.remove(task); }

} // END OF CLASS
