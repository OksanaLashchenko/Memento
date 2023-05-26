public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setNotification1("Notification1");
        editor.setNotification2("Notification2");
        editor.setNotification3("Notification3");

        Snapshot snapshot = new Snapshot("previous Notification1", "previous Notification2",
                "previous Notification3", editor);
        System.out.println(editor.toString());
        snapshot.restore();
        System.out.println(editor.toString());
    }

}
