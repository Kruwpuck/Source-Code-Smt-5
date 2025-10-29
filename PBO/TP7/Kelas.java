class Mahasiswa {
    static int jumlahMahasiswa = 0;
    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
        jumlahMahasiswa++;
    }

    static void infoKelas() {
        System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
    }
}
public class Kelas{
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Andi");
        Mahasiswa m2 = new Mahasiswa("Budi");
        Mahasiswa.infoKelas(); // Output: Jumlah Mahasiswa: 2
    }
}