public class TesteSacaNegativo {
    public static void main(String[] args) {
        Cliente larissa = new Cliente();
        larissa.nome = "Larissa";
        larissa.nascimento = "10/11/2000";
        larissa.cpf = "012.345.678-90";
        larissa.profissao = "Estudante";
        Conta contaDaLarissa = new Conta();
        contaDaLarissa.titular = larissa;
        contaDaLarissa.deposita(150);
        if (!contaDaLarissa.saca(350)) {
            System.out.println("Tentativa de saque no valor de R$" + 350.0);
            System.out.println("Não foi possível realizar o saque. Saldo atual da conta: R$" + contaDaLarissa.pegaSaldo());

        }
    }
}
