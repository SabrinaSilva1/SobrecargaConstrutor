public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor vazio

    public Relogio(){

    }

    // 1ª versão: inserindo todos os atributos
    
    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // 2ª versão: inserindo apenas hora e minuto

    public Relogio (int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;

    }

    // 3ª versão: inserindo apenas hora 

    public Relogio (int hora){
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    // 4ª versão: Possui erro , pois a versão não permite criar outro construtor com dois parâmetros do tipo int,
    // porém se fosse de tipos diferentes, poderia ser criado.

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
