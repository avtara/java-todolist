import java.util.Scanner;

public class TodoList {
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        testInput();
    }

    /**
     * Display todo list
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            String todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Learning java";
        model[1] = "Take a bath";
        showTodoList();
    }

    /**
     * Add todo list items
     */
    public static void addTodoList(String todo) {
        var isFull = true;
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];
            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (var i = 0; i < 25; i++) {
            addTodoList("todo-" + i);
        }
    }

    /**
     * Remove todo list items
     */
    public static boolean deleteTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        }

        if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = number - 1; i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testDeleteTodoList() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");

        var result = deleteTodoList(4);
        System.out.println(result);
        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var data = input("Nama");
        System.out.println("Hi " + data);
    }

    /**
     * Display view todolist menu
     */
    public static void viewShowTodoList() {

    }

    /**
     * Display view add todolist
     */
    public static void viewAddTodoList() {

    }

    /**
     * Display view remove todolist
     */
    public static void viewRemoveTodoList() {

    }
}
