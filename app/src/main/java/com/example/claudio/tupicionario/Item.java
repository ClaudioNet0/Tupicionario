package com.example.claudio.tupicionario;


public class Item {
    private String titulo;
    private String descricao;
    private int image;

    public Item(String titulo, String descricao, int image){
        this.titulo = titulo;
        this.descricao = descricao;
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
