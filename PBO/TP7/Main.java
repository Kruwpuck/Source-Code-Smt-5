public class Main {
    public static void main(String[] args) {
        Kubus k = new Kubus("Kiub", 5);
        Lingkaran l = new Lingkaran("Sirkel", 14);
        PersegiPanjang pp = new PersegiPanjang("Rektangel", 8, 9);
        PrismaSegitiga ps3 = new PrismaSegitiga("Prismarine", 6, 7, 10);

        l.Info();
        System.out.println("Keliling Lingkaran: " + l.hitungKeliling());
        System.out.println("Luas Lingkaran: " + l.hitungLuas());
        System.out.println();

        pp.Info();
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println();

        k.Info();
        System.out.println("Volume Kubus: " + k.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + k.hitungLuasPermukaan());
        System.out.println();

        ps3.Info();
        System.out.println("Volume Prisma Segitiga: " + ps3.hitungVolume());
        System.out.println("Luas Permukaan Prisma Segitiga: " + ps3.hitungLuasPermukaan());
        System.out.println();
    }   
}
public interface BangunDatar{
    public double hitungKeliling();
    public double hitungLuas();
}
public interface BangunRuang{
    public double hitungVolume();
    public double hitungLuasPermukaan();
}
public abstract class Bentuk{
    private String nama;
    public Bentuk(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public abstract void Info();
}
public class Kubus extends Bentuk implements BangunRuang{
    private int sisi;
    public Kubus(String nama, int sisi){
        super(nama);
        this.sisi = sisi;
}
    @Override
    public void Info(){
        System.out.println("Nama Bentuk: " + getNama());
        System.out.println("Sisi: " + sisi);
    }
    @Override
    public double hitungVolume(){
        return 6 * sisi * sisi;
    }
    @Override
    public double hitungLuasPermukaan(){
        return sisi * sisi * sisi;
    }
}
public class Lingkaran extends Bentuk implements BangunDatar{
    private int jariJari;
    public Lingkaran(String nama, int jariJari){
        super(nama);
        this.jariJari = jariJari;
    }
    @Override
    public void Info(){
        System.out.println("Nama Bentuk: " + getNama());
        System.out.println("Jari-Jari: " + this.jariJari);
    }
    @Override
    public double hitungKeliling(){
        return Math.round(Math.PI * 2 * this.jariJari);
    }
    @Override
    public double hitungLuas(){
        return Math.round(Math.PI * this.jariJari * this.jariJari);
    }
}
public class PersegiPanjang extends Bentuk implements BangunDatar{
    private int panjang;
    private int lebar;
    public PersegiPanjang(String nama, int panjang, int lebar){
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public void Info(){
        System.out.println("Nama Bentuk: " + getNama());
        System.out.println("Panjang: " + this.panjang);
        System.out.println("Lebar: " + this.lebar);
    }
    @Override
    public double hitungKeliling(){
        return 2 * (this.panjang + this.lebar);
    }
    @Override
    public double hitungLuas(){
        return this.panjang * this.lebar;
    }
}
public class PrismaSegitiga extends Bentuk implements BangunRuang{
    private int alas;
    private int tinggi;
    private int tinggiPrisma;
    public PrismaSegitiga(String nama, int alas, int tinggi, int tinggiPrisma){
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggiPrisma = tinggiPrisma;
    }
    @Override
    public void Info(){
        System.out.println("Nama Bentuk: " + getNama());
        System.out.println("Alas: " + this.alas);
        System.out.println("Tinggi: " + this.tinggi);
        System.out.println("Tinggi Prisma: " + this.tinggiPrisma);
    }
    @Override
    public double hitungVolume(){
        return 0.5 * this.alas * this.tinggi * this.tinggiPrisma;
    }
    @Override
    public double hitungLuasPermukaan(){
        return (0.5 * this.alas * this.tinggi) + 2 * (0.5 * this.alas * this.tinggiPrisma);
    }
}