package Sistema_de_Pedidos_com_Simulacao_de_Notificacoes.Model;

public class Cliente {
    private String nome;
    private String CPF;
    private String email;

    public Cliente(String nome, String CPF, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Cliente{" +
                "nome='"+nome + '\''+
                "CPF='"+CPF + '\''+
                "email='"+email+'}';
    }
}
