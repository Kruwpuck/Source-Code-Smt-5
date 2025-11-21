// Fungsi untuk memuat daftar pengguna
function loadUsers() {
    /* Kode ini menggunakan AJAX untuk mengirim permintaan GET ke file 'ambil_data.php',
    yang akan mengambil data dari session dan mengembalikan daftar pengguna dalam format HTML
    untuk ditampilkan di elemen dengan ID 'daftar_pengguna'. Jika terjadi error, akan 
    menampilkan pesan alert kepada pengguna. */
    //CODE DISINI

    $.ajax({
        url: "ambil_data.php",
        type: "GET",
        success: function (data) {
            $("#daftar_pengguna").html(data);
        },
        error: function () {
            alert("Gagal mengambil data pengguna.");
        }
    });
}


// Menangani pengiriman form tambah pengguna
/* Kode ini menangani pengiriman form dengan mencegah reload halaman,
mengambil data 'nama' dan 'email' dari input, lalu mengirim data tersebut 
ke 'proses_tambah.php' melalui AJAX. Setelah berhasil, data pengguna 
akan diperbarui dan input akan dikosongkan. Jika gagal, akan menampilkan
pesan error kepada pengguna. */
//CODE DISINI

$("#form-tambah-pengguna").on("submit", function (e) {
    e.preventDefault(); 

    let nama = $("#nama").val();
    let email = $("#email").val();

    $.ajax({
        url: "proses_tambah.php",
        type: "POST",
        data: {
            nama: nama,
            email: email
        },
        success: function (response) {
            alert(response);
            loadUsers();
            $("#nama").val(""); 
            $("#email").val(""); 
        },
        error: function () {
            alert("Gagal menambah pengguna.");
        }
    });
});


// Menangani penghapusan pengguna
/* Kode ini menangani klik pada tombol hapus untuk menghapus pengguna. 
AJAX akan mengirimkan ID pengguna ke 'proses_hapus.php', yang akan menghapus 
data dari session. Setelah proses selesai, daftar pengguna akan diperbarui.
Jika ada error, pesan kesalahan akan ditampilkan. */
//CODE DISINI

$(document).on("click", ".hapus-btn", function () {
    let id = $(this).data("id");

    $.ajax({
        url: "proses_hapus.php",
        type: "GET", 
        data: { 
            id: id,
            t: Date.now()   // anti-cache => FIX terpenting!
        },
        success: function (response) {
            alert(response);
            loadUsers(); 
        },
        error: function () {
            alert("Gagal menghapus pengguna.");
        }
    });
});


// Memuat daftar pengguna saat halaman dimuat
/* Kode ini memastikan bahwa setelah halaman selesai dimuat, fungsi 
loadUsers() akan dijalankan secara otomatis untuk mengambil dan menampilkan 
data pengguna dari session tanpa perlu reload halaman. */
//CODE DISINI

$(document).ready(function () {
    loadUsers();
});
