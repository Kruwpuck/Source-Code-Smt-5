
import java.util.List;

class Mahasiswa{
    String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
}
class DataMahasiswa{
    static List<Mahasiswa> daftar = new ArrayList<>();
    
    static void tambah (String nama){
        daftar.add(new Mahasiswa(nama));
    }
    static void tampilkan(){
        for(Mahasiswa mhs : daftar){
            System.out.println("Nama Mahasiswa: " + mhs.nama);
        }
        System.out.println("Total Mahasiswa: " + daftar.size());
    }
}
public class MainApp {
    public static void main(String[] args) {
        DataMahasiswa.tambah("Andi");
        DataMahasiswa.tambah("Budi");
        DataMahasiswa.tambah("Cecep");
        DataMahasiswa.tampilkan();
    }
}
