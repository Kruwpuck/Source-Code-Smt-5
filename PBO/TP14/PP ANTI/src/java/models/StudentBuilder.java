package models;

public class StudentBuilder extends TableBuilder{
    public StudentBuilder() {
//      (#1.2 Sesuaikan value dari var table dan primaryKey)
        this.table = "Student";
        this.primaryKey = "id";
//      (#1.3 Sesuaikan isi dari kolom table yang akan dibuat dengan berdasarkan informasi class yang ada pada soal)
//      *note : dimensi pertama sebagai banyak kolom, dimensi kedua pasti memiliki 2 elemen (nama kolom dan tipe data kolom)
        columns = new String[4][];
        columns[0] = new String[]{"id", "INT"};
        columns[1] = new String[]{"nim", "VARCHAR(20)"};
        columns[2] = new String[]{"name", "VARCHAR(100)"};
        columns[3] = new String[]{"address", "VARCHAR(200)"};
    }
}