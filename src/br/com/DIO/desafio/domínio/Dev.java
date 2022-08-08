package br.com.DIO.desafio.domínio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteúdo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteúdo> conteudosConluidos = new LinkedHashSet<>();


    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void progredir(){
        this.conteudosInscritos.stream().findFirst();

        if (!Conteúdo.isPresent()) {
              System.out.println("Você não está matriculado em nenhum conteúdo!");
          } else {
            this.conteudosConluidos.add(Conteúdo.get());
              this.conteudosInscritos.remove(Conteúdo.get());
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConluidos
                .stream()
                .mapToDouble(Conteúdo -> Conteúdo.calcularXp())
                .sum();

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteúdo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteúdo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteúdo> getConteudosConluidos() {
        return conteudosConluidos;
    }

    public void setConteudosConluidos(Set<Conteúdo> conteudosConluidos) {
        this.conteudosConluidos = conteudosConluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConluidos, dev.conteudosConluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConluidos);
    }
}
