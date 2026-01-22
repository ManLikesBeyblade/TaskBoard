import java.util.ArrayList;
import java.util.Date;

public class Task {
    // FIELDS
    private String name;
    private String desc;
    private Date dueDate;
    private boolean completed;
    private ArrayList<String> labels;


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

    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean getCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public ArrayList<String> getLabels() { return labels; }
    public void setLabels(ArrayList<String> labels) {
        this.labels = labels;
    }


    // CONSTRUCTORS
    public Task() {
        this.name = "";
        this.desc = "";
        this.dueDate = null;
        this.completed = false;
        this.labels = new ArrayList<String>();
    }


    // METHODS
    public void addLabel(String label) { labels.add(label); }
    public void removeLabel(String label) { labels.remove(label); }

} // END OF CLASS
