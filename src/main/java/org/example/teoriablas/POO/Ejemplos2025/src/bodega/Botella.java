public class Botella {
     private Corcho corcho;

     public Botella(){
         corcho = new Corcho();
     }

     public Botella(Corcho corcho) {
         this.corcho = corcho;
     }

    public Corcho getCorcho() {
         return corcho;
    }
    public void setCorcho(Corcho corcho) {
         this.corcho = corcho;
    }
    public boolean estaTapada(){
         return this.corcho.getEnBotella();
    }
}
