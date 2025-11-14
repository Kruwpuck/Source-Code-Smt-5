public class Main {

    public static void main(String[] args) {
        BangunDatar[] bangunDatar = new BangunDatar[3];
        

        bangunDatar[0] = new Lingkaran("Bulet", 343);
        bangunDatar[1] = new PersegiPanjang("Kawasaki Sesaki", 30, 36);
        bangunDatar[2] = new Segitiga("Lancip", 25, 40);

        for (BangunDatar bd : bangunDatar) {
            System.out.println("Nama BangunDatar : " + bd.getNama());
            
            if (bd instanceof Lingkaran) {
                Lingkaran l = (Lingkaran) bd;
                System.out.println("Jari-jari        : " + l.getJariJari());
            } else if (bd instanceof PersegiPanjang) {
                PersegiPanjang pp = (PersegiPanjang) bd;
                System.out.println("Panjang          : " + pp.getPanjang());
                System.out.println("Lebar            : " + pp.getLebar());
            } else if (bd instanceof Segitiga) {
                Segitiga s = (Segitiga) bd;
                System.out.println("Alas             : " + s.getAlas());
                System.out.println("Tinggi           : " + s.getTinggi());
            }
            
            System.out.println("Luas             : " + bd.hitungLuas());
            System.out.println("Keliling         : " + bd.hitungKeliling());
            System.out.println();
        }

    }
}
public abstract class BangunDatar {
    private String nama;
    
    public BangunDatar(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}
public class PersegiPanjang extends BangunDatar {
    private int panjang;
    private int lebar;
    
    public PersegiPanjang(String nama,int panjang, int lebar) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public int getPanjang() {
        return panjang;
    }
    
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
    public int getLebar() {
        return lebar;
    }
    
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
}
public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;
    public Segitiga(String nama, int alas, int tinggi) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public int getAlas() {
        return alas;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
    
}
public class Lingkaran extends BangunDatar {
    private int jariJari;
    public Lingkaran(String nama, int jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }
    public int getJariJari() {
        return jariJari;
    }
    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}