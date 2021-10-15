package edu.ifma.singleton_tarefa_03;

public class Logger {
    private boolean active;
    private static Logger instance;
    private Logger() {
        
    }
    public static Logger getInstance(){
        if(instance == null){
            instance =  new Logger();
        }
        return instance;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public boolean isActive() {
        return active;
    }
    public void log(String str){
        if(this.active)
        System.out.println("LOG::"+str);
    }


    
}
