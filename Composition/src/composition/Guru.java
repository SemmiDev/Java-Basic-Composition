package composition;

public class Guru {
    private String nama;
    private Siswa siswa; // nama kelas diikuti nama objek
    private String umur;
    private String mapel;
    
    public Guru(String nama, String umur, String mapel,Siswa siswa){ // kita masukkan juga kedalam paameter constructor guru
        this.nama = nama;
        this.umur = umur;
        this.mapel = mapel;
        this.siswa = siswa;
    }
    
    @Override
    public String toString(){ // jangan lupa untuk memanggil gunakan keyword this.author.getName(); // misalkan
        return "Nama siswa : " + this.siswa.getNama()+ "\nUmur : " + this.siswa.getUmur() + "\nhobi : " + this.siswa.getHobi()
                + "\n\nNama guru : " + this.nama + "\nUmur : " + this.umur + "\nMapel : " + this.mapel;
    }
}
