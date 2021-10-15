package edu.ifma.adapter_tarefa_04;

import edu.ifma.adapter_tarefa_04.adapter.AdapterSomaArrayToSomaList;

public class AppTest {
    public static void main(String[] args) {
        SomadorExistente somadorExistente = new SomadorExistente();

        AdapterSomaArrayToSomaList arrayToSomaList = new AdapterSomaArrayToSomaList(somadorExistente);

        Cliente cliente = new Cliente(arrayToSomaList);
        
        cliente.executar();
    }
}
