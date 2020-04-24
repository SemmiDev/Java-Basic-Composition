package composition;

public class Composition {
    public static void main(String[] args) {
        Siswa a = new Siswa("SamDev","17","Ngoding");
        Guru  b = new Guru("Abdul Salim","30","Fisika",a); // parameter Composition Siswa diisi dengan a 
        System.out.println(b);
    }
}
