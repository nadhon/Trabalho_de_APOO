package AppDeskTop;

public class Tema {
    private String corDeFundo;
    private String corDaFonte;
    private String nomeDaFonte;
    private static int tamanhoDaFonte;

    private Tema(String corDeFundo, String corDaFonte, int tamanhoDaFonte, String nomeDaFonte){
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

        public TemaBuilder comCorDeFundo(String corDeFundo){
            this.corDeFundo = corDeFundo;
            return this;
        }

        public TemaBuilder comCorDaFonte(String corDaFonte){
            this.corDaFonte = corDaFonte;
            return this;
        }

        public TemaBuilder comNomeDaFonte(String nomeDaFonte,int tamanhoDaFonte){
            this.nomeDaFonte = nomeDaFonte;
            return this;
        }


        public String getNomeDaFonte() {
            return nomeDaFonte;
        }

        public void setNomeDaFonte(String nomeDaFonte) {
            this.nomeDaFonte = nomeDaFonte;
        }

        public String getCorDaFonte() {
            return corDaFonte;
        }

        public void setCorDaFonte(String corDaFonte) {
            this.corDaFonte = corDaFonte;
        }

        public String getCorDeFundo() {
            return corDeFundo;
        }

        public void setCorDeFundo(String corDeFundo) {
            this.corDeFundo = corDeFundo;
        }
        public Tema build(){
            return new Tema(corDeFundo,corDaFonte,nomeDaFonte,tamanhoDaFonte);
        }
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
}
