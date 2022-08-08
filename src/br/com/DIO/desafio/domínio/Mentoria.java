package br.com.DIO.desafio.domínio;

import java.time.LocalDate;

public class Mentoria extends Conteúdo {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public Mentoria() {
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescrição() + '\'' +
                ", data=" + data +
                '}';
    }


}


