public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        //informações iniciais da tv
        System .out.println("Tv ligada? " + smartTv.ligada);
        System .out.println("Canal atual: " + smartTv.canal);
        System .out.println("Volume atual: " + smartTv.volume);
        
        //ligando a tv
        smartTv.ligar();
        System .out.println("Tv ligada? " + smartTv.ligada);
        
        //desligando a tv
        smartTv.desligar();
        System .out.println("Tv ligada? " + smartTv.ligada);
        
        //Chamando o comando para aumentar o volume da tv
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        //exibindo o resultado
        System .out.println("Volume atual: " + smartTv.volume);
        
        //Chamando o comando para diminuir o volume da tv
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        //exibindo o resultado
        System .out.println("Volume atual: " + smartTv.volume);
        
        //alterando o canal da tv e exibindo o resultado
        smartTv.aumentarCanal();
        System .out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System .out.println("Canal atual: " + smartTv.canal);
        //selecionando um canal específico, chama o método selecionarCanal e seleciona o canal desejado. No exemplo, canal 10.
        smartTv.selecionarCanal(10);
        System .out.println("Canal atual: " + smartTv.canal);
    }
}
