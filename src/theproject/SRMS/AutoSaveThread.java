
package theproject.SRMS;


public class AutoSaveThread extends Thread {
    private StudentManager manager;

    public AutoSaveThread(StudentManager manager) {
        this.manager = manager;
        setDaemon(true); 
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(30000); 
                FileHandler.saveToFile(manager.getStudents());
                System.out.println("\n[System] Auto-saved records to file.");
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}