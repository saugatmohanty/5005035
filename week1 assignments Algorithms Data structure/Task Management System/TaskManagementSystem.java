public class TaskManagementSystem {
    private Node head;

    public TaskManagementSystem() {
        head = null;
    }

    // Add a task to the linked list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task by taskId
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by taskId
    public boolean deleteTask(int taskId) {
        if (head == null) {
            return false;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        // Adding Tasks
        tms.addTask(new Task(1, "Design", "In Progress"));
        tms.addTask(new Task(2, "Development", "Not Started"));
        tms.addTask(new Task(3, "Testing", "Completed"));

        // Searching for a Task
        System.out.println(tms.searchTask(2));  // Output: Task{taskId=2, taskName='Development', status='Not Started'}

        // Traversing Tasks
        tms.traverseTasks();

        // Deleting a Task
        tms.deleteTask(2);
        tms.traverseTasks();
    }
}

//Types of Linked Lists:

//Singly Linked List:

//Structure: Each node contains data and a reference (or link) to the next node in the sequence.
//Advantages: Simple to implement, uses less memory per node compared to doubly linked lists.
//Disadvantages: Can only traverse in one direction; no direct access to the previous node.
//Doubly Linked List:

//Structure: Each node contains data, a reference to the next node, and a reference to the previous node.
//Advantages: Can be traversed in both directions (forward and backward); easier to delete a node when you have a reference to it.
//Disadvantages: Uses more memory per node due to the extra reference; slightly more complex to implement.
//Time Complexity Analysis:

//Add Operation:

//Best Case: O(1) (when adding the first node)
//Worst Case: O(n) (when traversing to the end to add a new node)
//Search Operation:

//Best Case: O(1) (if the task is at the head)
//Worst Case: O(n) (if the task is at the end or not present)
//Traverse Operation:

//Best Case: O(n) (must visit all nodes)
//Worst Case: O(n) (must visit all nodes)
//Delete Operation:

//Best Case: O(1) (if the task to be deleted is at the head)
//Worst Case: O(n) (if the task to be deleted is at the end or not present)
//Advantages of Linked Lists Over Arrays for Dynamic Data:

//Dynamic Size:

//Linked lists can grow and shrink dynamically, which is not possible with arrays unless you use dynamic arrays like ArrayList in Java.
//Efficient Insertions and Deletions:

//Insertions and deletions are generally more efficient (O(1) time complexity) when you have a reference to the node to be inserted or deleted, particularly in doubly linked lists.
//Memory Utilization:

//Linked lists allocate memory as needed, which can be more efficient than arrays that may allocate more memory than required.
//Disadvantages of Linked Lists Compared to Arrays:

//Memory Overhead:

//Linked lists use more memory per element due to the storage required for pointers/references.
//Cache Locality:

//Arrays have better cache performance due to contiguous memory allocation, while linked lists can lead to cache misses due to non-contiguous memory allocation.
//Random Access:

//Arrays provide O(1) time complexity for accessing any element using its index, whereas linked lists have O(n) time complexity for accessing elements.




