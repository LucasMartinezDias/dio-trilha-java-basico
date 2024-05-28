public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv está ligada : " + smartTv.ligada);
        System.out.println("Qual canal a Tv está: " + smartTv.canal);
        System.out.println("Qual o volume da Tv: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A Tv está ligada?: " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Qual o volume da Tv?: " + smartTv.volume);
    }
}
