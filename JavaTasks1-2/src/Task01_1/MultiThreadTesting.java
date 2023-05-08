package Task01_1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ethan Flynn
 */
public class MultiThreadTesting {
    
    public static void main(String[] args) {
        Thread T1 = new Thread(new MyTask("task A"));
        Thread T2 = new Thread(new MyTask("task B"));
        T1.start();
        T2.start();
    
    }
}
    
    class MyTask implements Runnable{
        
        private String taskName;
        
        public MyTask(String name){
            this.taskName = name;
        }
        
        @Override
        public void run(){
            for (int i = 0; i<10; i++){
                try {
                    System.out.println(taskName + "TEST" + i);
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyTask.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        
        }

    /**
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    }
    

