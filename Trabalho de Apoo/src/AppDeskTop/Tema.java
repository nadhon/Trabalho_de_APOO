package AppDeskTop;

public class Tema {
    private String corDeFundo;
    private String corDaFonte;
    private String nomeDaFonte;
    private int tamanhoDaFonte;
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

    public static class  TemaBuilder{
        private String corDeFundo;
        private String corDaFonte;
        private String nomeDaFonte;

        public class comCorDeFundo(String corDeFundo){
            this.comCorDeFundo= corDeFundo;
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
    public String toString() {
        return "Tema{" +
                "corDeFundo='" + corDeFundo + '\'' +
                ", corDaFonte='" + corDaFonte + '\'' +
                ", nomeDaFonte='" + nomeDaFonte + '\'' +
                ", tamanhoDaFonte=" + tamanhoDaFonte +
                '}';
    }



}
