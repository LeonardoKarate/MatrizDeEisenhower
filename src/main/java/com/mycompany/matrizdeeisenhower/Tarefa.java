/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrizdeeisenhower;

/**
 *
 * @author leona
 */
public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private boolean urgente;
    private boolean importante;
    private boolean feito;
    
    public Tarefa(int id, String titulo, String descricao, boolean urgente, boolean importante, boolean feito) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.urgente = urgente;
        this. importante = importante;
        this.feito = feito;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the urgente
     */
    public boolean isUrgente() {
        return urgente;
    }

    /**
     * @param urgente the urgente to set
     */
    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    /**
     * @return the importante
     */
    public boolean isImportante() {
        return importante;
    }

    /**
     * @param importante the importante to set
     */
    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    /**
     * @return the feito
     */
    public boolean isFeito() {
        return feito;
    }

    /**
     * @param feito the feito to set
     */
    public void setFeito(boolean feito) {
        this.feito = feito;
    }
    
}
