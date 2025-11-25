public class Sacacorchos {
    private boolean tieneCorcho;

    public void destapar(Botella b){
        if(b.estaTapada() && !this.tieneCorcho){
            Corcho elCorcho = b.getCorcho();
            elCorcho.setEnBotella(false);
        }else{
            System.out.println("botella destapada");
        }
    }
}
