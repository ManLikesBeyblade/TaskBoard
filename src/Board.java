import java.util.ArrayList;

public class Board {
    // FIELDS
    private String name;
    private String desc;
    private ArrayList<TaskList> taskLists;


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

    public ArrayList<TaskList> getTaskLists() { return taskLists; }
    public void setTasks(ArrayList<TaskList> taskLists) { this.taskLists = taskLists;}


    // CONSTRUCTORS
    public Board() {
        this.name = "";
        this.desc = "";
        this.taskLists = new ArrayList<TaskList>();
    }


    // METHODS
    public void addTaskList(TaskList taskList) { taskLists.add(taskList); }
    public void removeTaskList(TaskList taskList) { taskLists.remove(taskList); }

} // END OF CLASS
