package br.com.DIO.desafio.domínio;

public abstract class Conteúdo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descrição;

    public static Conteúdo get() {
        return null;
    }

    public static boolean isPresent() {
        return false;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
