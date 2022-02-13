public class TodoList {
    public static String[] model = new String[10];

    public static void main(String[] args) {

    }

    /**
     * Display todo list
     */
    public static void showTodoList() {
        for( var i = 0; i < model.length; i++){
            String todo = model[i];
            var no = i++;

            if (todo != null) {
                System.out.println(no + "." + todo);
            }
        }
    }

    /**
     * Add todo list items
     */
    public static void addTodoList(){

    }

    /**
     * Remove todo list items
     */
    public static void deleteTodoList(){

    }

    /**
     * Display view todolist menu
     */
    public static void viewShowTodoList(){

    }

    /**
     * Display view add todolist
     */
    public static void viewAddTodoList(){

    }

    /**
     * Display view remove todolist
     */
    public static void viewRemoveTodoList(){

    }
}
