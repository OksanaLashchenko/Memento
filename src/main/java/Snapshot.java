public class Snapshot {

    private final String notification1;
    private final String notification2;
    private final String notification3;
    private final Editor editor;

    public Snapshot(String notification1, String notification2, String notification3, Editor editor) {
        this.notification1 = notification1;
        this.notification2 = notification2;
        this.notification3 = notification3;
        this.editor = editor;
    }

    public void restore() {
        editor.setNotification1(notification1);
        editor.setNotification2(notification2);
        editor.setNotification3(notification3);
    }

}
