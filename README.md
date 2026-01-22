# TaskBoard

### Ideas

- Basically just trello
- Users can create boards with lists that contain tasks; tasks can be moved between lists

### Classes
- Task
  - String name, desc
  - Boolean completed
  - DateTime dueDate
  - String[] labels
- taskList
  - String name, desc
  - ArrayList<Task> tasks
- Board
  - String name
  - ArrayList(List) lists

