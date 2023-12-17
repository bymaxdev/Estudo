public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equals("CC")){
            this.setSaldo(50);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Impossível fechar uma conta com saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Impossível fechar conta com débito");
        } else {
            this.setStatus(false);
        }
        System.out.println("Conta Fechada!");
    }

    public void depositar(double valor){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Abra uma conta para poder depositar");
        }
    }

    public void sacar(double valor){
        if (this.isStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Seu saldo atual é: " + this.getSaldo());
            } else {
                System.out.println("Saldo é insuficiente.");
                System.out.println("Seu saldo atual é: " + this.getSaldo());
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(){
        double valor = 0;
        if (this.getTipo().equals("CC")){
            valor = 12;
        } else if (this.getTipo().equals("CP")) {
            valor = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso pelo valor de: " + valor);
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
