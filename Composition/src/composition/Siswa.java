package composition;

public class Siswa {
    private String nama;
    private String umur;
    private String hobi;
    
    public Siswa(String nama, String umur, String hobi){
        this.nama = nama;
        this.umur = umur;
        this.hobi = hobi;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public String getHobi() {
        return hobi;
    }
}
