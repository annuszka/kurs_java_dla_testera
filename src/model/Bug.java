package model;

public class Bug implements ConsoleNotification{
    private String bugDescription;
    private BugReporter bugReporter;
    private int bugPriority;
    private boolean bugStatus;

    public Bug(String bugDescription, BugReporter bugReporter, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Incorrect bug description");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public void setBugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default:
                System.out.println("Incorrect bug priority range");
        }

    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
        notifyStatusChange();
        this.bugStatus = bugStatus;
    }

    public void showEmail() {
        System.out.println("Reporter email: " + bugReporter.getEmail());
    }

    public void showBugStatus() {
        System.out.println("Bug status: " + bugStatus);
    }

    public int getBugPriority() {
        return bugPriority;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugReporter=" + bugReporter +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                '}';
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("!!! Bug status has changed !!!");
    }
}
