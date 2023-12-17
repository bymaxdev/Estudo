package by.max;

public class Video implements AcoesVideo{
    private String titulo;
    private Integer avaliacao, views, curtidas;
    private Boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        if (this.getReproduzindo()){
            System.out.println("O video já está rolando.");
        } else {
            System.out.println("Video iniciado!");
            this.setReproduzindo(true);
            this.setViews(this.getViews()+1);
        }
    }

    @Override
    public void pause() {
        if (this.getReproduzindo()){
            this.setReproduzindo(false);
        } else {
            System.out.println("O video já está pausado.");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public Boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(Boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video:" + "\n" +
                "Titulo= " + titulo + "\n" +
                "Avaliacao= " + avaliacao + "\n" +
                "Views= " + views + "\n" +
                "Curtidas= " + curtidas + "\n" +
                "Reproduzindo= " + reproduzindo + "\n";
    }
}
