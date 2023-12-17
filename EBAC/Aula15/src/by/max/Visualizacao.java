package by.max;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video video;

    public Visualizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.video.setViews(this.video.getViews()+1);
    }

    public void avaliar(){
        this.video.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.video.setAvaliacao(nota);
    }
    public void avaliar(float percent){
        int tot = 0;
        if (percent<=20){
            tot = 3;
        } else if (percent<=50) {
            tot = 5;
        } else if (percent<=90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.video.setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Espectador= " + espectador + "\n" +
                "Video= " + video + "\n";
    }
}
