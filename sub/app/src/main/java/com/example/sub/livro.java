package com.example.sub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sub.MainActivity;

import androidx.appcompat.app.AppCompatActivity;


public class livro extends AppCompatActivity {
    private String Nome;
    private String Editora;
    private String Autor;
    private Integer Ano;
    private Integer Codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar_livro);
//        tela = findViewById(R.id.painel);
//        tela.setText("");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public Integer getAno() {
        return Ano;
    }

    public void setAno(Integer ano) {
        Ano = ano;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer codigo) {
        Codigo = codigo;
    }




}
