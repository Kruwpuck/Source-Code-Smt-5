import java.util.ArrayList;
import java.util.List;
public class DemoCollection {
    public static void main(String[] args) {
        // Membuat ArrayList
        List<String> namaMahasiswa = new ArrayList<>();

        namaMahasiswa.add("Andi");
        namaMahasiswa.add("Budi");
        namaMahasiswa.add("Citra");
        
        for (String nama : namaMahasiswa) {
            System.out.println("Nama Mahasiswa: " + nama);
        }
        System.out.println("Total Mahasiswa: " + namaMahasiswa.size());
}
}
