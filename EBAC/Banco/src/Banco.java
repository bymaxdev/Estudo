import java.util.Random;
import java.util.Scanner;

public class Banco {
    Random random = new Random();
    Scanner entrada = new Scanner(System.in);

    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;


    public void abrirConta(){
        System.out.println("Bem-Vindo ao General Bank!");
        System.out.println("Vamos abrir sua conta!");
        System.out.println("Informe seu nome completo:");
        this.setDono(entrada.next());
        System.out.println( "Que tipo de conta gostaria de criar?");
        System.out.println("Digite [CC] para conta corrente ou [CP] para conta poupança.");
        this.setTipo(entrada.next());

        if (this.getTipo().equals("CC")){
            this.setNumConta(random.nextInt(100)+1);
            this.setSaldo(50);
            System.out.println("Por criar uma Conta Corrente depositamos um bônus de R$50,00 reais em sua conta!");
        } else if(this.getTipo().equals("CP")){
            this.setNumConta(random.nextInt(200)+101);
            this.setSaldo(150);
            System.out.println("Por criar uma Conta Corrente depositamos um bônus de R$150,00 reais em sua conta!");
        } else {
            System.out.println("Opção inválida!");
        }
        this.setStatus(true);
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("No momento sua conta tem o saldo de: " + this.getSaldo());
            System.out.println("Para fechar a conta precisamos que o(a) Sr(a). Retire o saldo e tente novamente.");
            this.menu();
        } else if (this.getSaldo() < 0) {
            System.out.println("No momento sua conta tem o saldo de: " + this.getSaldo());
            System.out.println("Para fechar a conta precisamos que o(a) Sr(a). Pague o débito e tente novamente.");
            this.menu();
        } else {
            System.out.println("Sua conta foi fechada com sucesso!");
            this.setStatus(false);
        }
    }
    public void depositar(double dep){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo()+dep);
            System.out.println("Deposito de " + dep + " realizado com sucesso!");
            System.out.println("Seu saldo atual é de: " + this.getSaldo());
        } else {
            System.out.println("A sua encontra se encontra fechada, portando não é possível realizar depósitos.");
        }

    }
    public void sacar(double sac){
        if (this.getSaldo() >= sac && this.isStatus()){
            this.setSaldo(getSaldo() - sac);
            System.out.println("Saque de " + sac + " realizado com sucesso!");
            System.out.println("Seu saldo atual é de: " + getSaldo());
        } else if (this.getSaldo() < sac && this.isStatus()){
            System.out.println("Não há saldo suficiente na conta!");
            System.out.println("Seu saldo atual é de: " + getSaldo());
        }else {
            System.out.println("Sua conta foi encerrada portanto não há mais saldo em sua conta.");
        }
    }
    public void pagarMensal(){
        if (this.getTipo().equals("CC") && this.isStatus()){
            setSaldo(getSaldo() - 12);
            System.out.println("Sua mensalidade foi paga!");
            System.out.println("E seu saldo atual é de: " + getSaldo());
        } else if (this.getTipo().equals("CP") && this.isStatus()) {
            setSaldo(getSaldo() - 20);
            System.out.println("Sua mensalidade foi paga!");
            System.out.println("E seu saldo atual é de: " + getSaldo());
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void menu(){
        boolean continuar = true;

        while (continuar){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Abrir Conta");
            System.out.println("2 - Verificar Saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar Mensalidade");
            System.out.println("6 - Dados da Conta");
            System.out.println("7 - Fechar Conta");
            System.out.println("0 - Sair");

            int opcao = entrada.nextInt();

            if (this.isStatus() || opcao == 1 || opcao == 0){
                switch (opcao){
                    case 1:
                        if (this.isStatus()){
                            System.out.println("Você já tem uma conta em nosso banco!");
                        }else {
                            this.abrirConta();
                        }
                            break;
                    case 2:
                            System.out.println("Seu saldo atual é de: " + getSaldo());
                            break;
                    case 3:
                            System.out.println("Informe o valor do depósito:");
                            double valorDeposito = entrada.nextDouble();
                            depositar(valorDeposito);
                            break;
                    case 4:
                            System.out.println("Informe o valor do saque:");
                            double valorSaque = entrada.nextDouble();
                            sacar(valorSaque);
                            break;
                    case 5:
                            pagarMensal();
                            break;
                    case 6:

                            System.out.println("Número da conta: " + getNumConta());
                            System.out.println("Dono da conta: " + getDono());
                            System.out.println("Tipo: " + getTipo());
                            System.out.println("Saldo da conta: " + getSaldo());
                            if(this.isStatus()){
                                System.out.println("Status da conta: Aberta");
                            } else {
                                System.out.println("Status da conta: Fechada");
                            }


                        break;
                    case 7:
                        fecharConta();
                        break;
                    case 0:
                        continuar = false;
                        System.out.println("Programa encerrado. Obrigado!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } else {
                System.out.println("Para interagir com o nosso menu o(a) Sr(a). precisa primeiro criar uma conta!");
            }

        }


    }
}
