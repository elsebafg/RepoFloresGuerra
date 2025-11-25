public class Main {
    public static void main(String[] args) {
        Corcho c1 = new Corcho();
        Corcho c2 = new Corcho();
        Botella b1 = new Botella(c1);
        Botella b2 = new Botella(c2);
        Botella b3 = new Botella();

        Sacacorchos sacacorchos = new Sacacorchos();
        sacacorchos.destapar(b1);
    }
}
