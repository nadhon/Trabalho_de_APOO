package AppDeskTop;

public class Tema {
    private String corDeFundo;
    private String corDaFonte;
    private String nomeDaFonte;
    private int tamanhoDaFonte;

    private Tema(String corDeFundo, String corDaFonte, int tamanhoDaFonte){
    }
    public String getCorDeFundo() {
        return corDeFundo;
    }

    public String getCorDaFonte() {
        return corDaFonte;
    }

    public String getNomeDaFonte() {
        return nomeDaFonte;
    }

    public int getTamanhoDaFonte() {
        return tamanhoDaFonte;
    }

    public Tema(String corDeFundo, String corDaFonte, String nomeDaFonte, int tamanhoDaFonte) {
        this.corDeFundo = corDeFundo;
        this.corDaFonte = corDaFonte;
        this.nomeDaFonte = nomeDaFonte;
        this.tamanhoDaFonte = tamanhoDaFonte;
    }

    public static class  TemaBuilder{
        private String corDeFundo;
        private String corDaFonte;
        private String nomeDaFonte;
        public String comCorDeFundo(String corDeFundo){
            this.corDeFundo = corDeFundo;
            return corDeFundo;
        }
        public String comCorDaFonte(String corDeFundo){
            this.corDaFonte = corDaFonte;
            return corDaFonte;
        }
        public String comNomeDaFonte(String corDeFundo){
            this.nomeDaFonte = nomeDaFonte;
            return nomeDaFonte;
        }
    }
    public void setCorDeFundo(String corDeFundo) {
        this.corDeFundo = corDeFundo;
    }

    public void setCorDaFonte(String corDaFonte) {
        this.corDaFonte = corDaFonte;
    }

    public void setNomeDaFonte(String nomeDaFonte) {
        this.nomeDaFonte = nomeDaFonte;
    }

    public void setTamanhoDaFonte(int tamanhoDaFonte) {
        this.tamanhoDaFonte = tamanhoDaFonte;
    }
    @Override
    public String toString() {
        return "Tema{" +
                "corDeFundo='" + corDeFundo + '\'' +
                ", corDaFonte='" + corDaFonte + '\'' +
                ", nomeDaFonte='" + nomeDaFonte + '\'' +
                ", tamanhoDaFonte=" + tamanhoDaFonte +
                '}';
    }
    public Tema build(){
        return new Tema(corDeFundo, corDaFonte, tamanhoDaFonte);
    }
}
