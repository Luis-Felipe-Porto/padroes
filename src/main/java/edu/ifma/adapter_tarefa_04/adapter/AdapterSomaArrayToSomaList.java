package edu.ifma.adapter_tarefa_04.adapter;

import java.util.ArrayList;
import java.util.List;

import edu.ifma.adapter_tarefa_04.SomadorEsperado;
import edu.ifma.adapter_tarefa_04.SomadorExistente;


public class AdapterSomaArrayToSomaList implements SomadorEsperado{
    
    private SomadorExistente somadorExistente;
    
    public AdapterSomaArrayToSomaList(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }
    @Override
    public int somavetor(int[] vetor) {
        List<Integer> intList = new ArrayList<Integer>(vetor.length);
        for (int i : vetor){intList.add(i);}
        return somadorExistente.somaLista(intList);
    }

}
