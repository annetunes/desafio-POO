package br.com.DIO.desafio.domínio;

import br.com.DIO.desafio.domínio.d.Conteúdo;

public class Curso extends Conteúdo {


    private int cargaHoraria;


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescrição() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
