public class Bebas {
    private int id;
    private String nama;
    private String keterangan;

    // Constructor
    public Bebas() {
        System.out.println("Object Bebas telah diciptakan, constructor berjalan");
    }

    // Getter dan Setter untuk id
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk keterangan
    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    // Method untuk menampilkan informasi bebas
    public void tampilkanInfoBebas() {
        System.out.println("ini method untuk tampilkan info bebas");
    }

    public void tampilkanInfoBebas(String nama) {
        System.out.println("ini method untuk tampilkan info bebas berdasar nama");
    }

}
