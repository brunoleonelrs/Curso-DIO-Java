//exercitando aprendizado sobre métodos e variáveis;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;
    
    //função de ligar e desligar a tv
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    //função de aumentar e diminuir o volume da tv
    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }
    //função de mudar ou seleionar canal da tv
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
    public void selecionarCanal(int novoCanal) {
        canal = novoCanal;
    }
}