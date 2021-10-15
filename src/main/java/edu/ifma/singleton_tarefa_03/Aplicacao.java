package edu.ifma.singleton_tarefa_03;

public class Aplicacao {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        //Logger log1 = new Logger();
        log1.setActive(true);
        log1.log("PRIMEIRA MENSAGEM DE LOG");

        Logger log2 = Logger.getInstance();
        //Logger log2 = new Logger();
        log2.log("SEGUNDA MENSAGEM DE LOG");
    }
}
