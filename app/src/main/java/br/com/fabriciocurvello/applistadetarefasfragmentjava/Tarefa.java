package br.com.fabriciocurvello.applistadetarefasfragmentjava;

import java.io.Serializable;

public class Tarefa implements Serializable {

    private String nomeTarefa;
    private String data;
    private String local;
    private String descricao;

    // Construtor
    public Tarefa(String nomeTarefa, String data, String local, String descricao) {
        this.nomeTarefa = nomeTarefa;
        this.data = data;
        this.local = local;
        this.descricao = descricao;
    }

    // Getters
    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public String getDescricao() {
        return descricao;
    }
}
