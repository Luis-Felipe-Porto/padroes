package edu.ifma.adapter_tarefa_04;

public class Cliente {
    private SomadorEsperado somador;
    
    public Cliente(SomadorEsperado somador) {
        this.somador = somador;
    }

    public void executar(){
        int [] vetor = new int [] {1,2,3,4,5,6,7,8,9,10};
        int soma = somador.somavetor(vetor);
        System.out.println("Resultado "+ soma);

    }
}
