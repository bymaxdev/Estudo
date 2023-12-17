package by.max;

public class Gafanhoto extends Pessoa{
    private String login;
    private Integer totAssistido;

    public Gafanhoto(String nome, String sexo, Integer idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(Integer totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto: \n" + super.toString() +
                "Login= " + login  + "\n" +
                "Total Assistido= " + totAssistido + "\n";
    }
}