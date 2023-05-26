public class Editor {

    private String notification1;
    private String notification2;
    private String notification3;

    public void setNotification1(String notification1) {
        this.notification1 = notification1;
    }

    public void setNotification2(String notification2) {
        this.notification2 = notification2;
    }

    public void setNotification3(String notification3) {
        this.notification3 = notification3;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(notification1, notification2, notification3, this);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "notification1='" + notification1 + '\'' +
                ", notification2='" + notification2 + '\'' +
                ", notification3='" + notification3 + '\'' +
                '}';
    }

}
