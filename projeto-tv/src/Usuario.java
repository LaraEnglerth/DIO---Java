public class Usuario {
    public static void main(String[] args) throws Exception {

        SmarTv smarTv = new SmarTv();

        smarTv.dominuirVolume();
        smarTv.dominuirVolume();
        smarTv.dominuirVolume(); //diminui volume em 3
        smarTv.aumentarVolume();

        System.out.println("TV LIGADA? " + smarTv.ligada);
        System.out.println("CANAL ATUAL: " + smarTv.canal);
        System.out.println("VOLUME ATUAL: " + smarTv.volume);

        smarTv.ligar(); //chamando o método para ligar a TV
        System.out.println("ATUALIZAÇÃO: TV LIGADA? " + smarTv.ligada);

        smarTv.mudarCanal(13);
        System.out.println("NOVO CANAL: " + smarTv.canal);

    }
}
