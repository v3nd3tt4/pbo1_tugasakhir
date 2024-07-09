public class Komik extends Buku {
    private int volume;

    public void getVolume(int volume){
        this.volume = volume;
    }

    public void naikkanHarga() {
        System.out.println("naikkan harga komik");
    }
}
