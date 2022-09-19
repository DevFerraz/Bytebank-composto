public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo";
        paulo.cpf = "012.345.678-90";
        paulo.profissao = "Programador";
        paulo.nascimento = "21/04/1983";
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nascimento);
        System.out.println(contaDoPaulo.pegaSaldo());
    }
}
