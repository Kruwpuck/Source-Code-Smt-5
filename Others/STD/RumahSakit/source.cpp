#include "header.h"
void menu(List_relasi &Lr, List_dokter &Lp, List_pasien &Lc){
    adr_relasi R;
    adr_dokter P,Q;
    adr_pasien C,D;
    string dataR;
    infotype_dokter dataP;
    infotype_pasien dataC;
    int pilihan;
    cout << "------------------------------------------------------------" << endl;
    cout << "|                 Sistem Manajemen Rumah Sakit             |" << endl;
    cout << "------------------------------------------------------------" << endl;
    cout << "|           Sheren Aulia Azahra  //   103032400036         |" << endl;
    cout << "|     Mutiara Zalfaa Ananda Khairudin //   103032430009    |" << endl;
    cout << "------------------------------------------------------------" << endl;
    cout << "|   1. Data dokter                                         |" << endl;
    cout << "|   2. Data pasien                                         |" << endl;
    cout << "|   3. Data relasi                                         |" << endl;
    cout << "|   4. Exit                                                |" << endl;
    cout << "------------------------------------------------------------" << endl;
    cout << "Masukkan pilihan: ";
    cin >> pilihan;
    cout << endl;
    if (pilihan == 4){
        return ;
    }
    while (pilihan < 1 || pilihan > 4){
        cout << "------------------------------------------------------------" << endl;
        cout << "|                        INPUT INVALID                     |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "|          Sheren Aulia Azahra   //   103032400036         |" << endl;
        cout << "|    Mutiara Zalfaa Ananda Khairudin //   103032430009     |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "|   1. Data dokter                                         |" << endl;
        cout << "|   2. Data pasien                                         |" << endl;
        cout << "|   3. Data relasi                                         |" << endl;
        cout << "|   4. Keluar                                              |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "Masukkan pilihan: ";
        cin >> pilihan;
        cout << endl;
    }
    if (pilihan == 1){
        cout << "------------------------------------------------------------" << endl;
        cout << "|                        MENU DOKTER                       |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "|          Sheren Aulia Azahra   //   103032400036         |" << endl;
        cout << "|    Mutiara Zalfaa Ananda Khairudin //   103032430009     |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "|   1. Menambahkan dokter                                  |" << endl;
        cout << "|   2. Menghapus dokter                                    |" << endl;
        cout << "|   3. Mencari dokter                                      |" << endl;
        cout << "|   4. Menampilkan dokter                                  |" << endl;
        cout << "|   5. Total dokter Tanpa pasien                           |" << endl;
        cout << "|   6. Total pasien Dari dokter Tertentu                   |" << endl;
        cout << "|   7. Menampilkan pasien dari dokter Tertentu             |" << endl;
        cout << "|   8. Kembali                                             |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "Masukkan pilihan: ";
        cin >> pilihan;
        cout << endl;
        if (pilihan == 1){
            cout << "Masukkan Nama dokter: ";
            cin >> dataP.nama;
            cout << "Masukkan Spesialisasi dokter: ";
            cin >> dataP.spesialisasi;
            cout << "Masukkan ID dokter: ";
            cin >> dataP.ID;
            while (!checkID(Lp, dataP.ID)){
                cout << "ID sudah ada" << endl;
                cin >> dataP.ID;
            }
            P = new elm_dokter;
            P->info = dataP;
            P->next_dokter = NULL;
            insert_dokter(Lp, P);
            cout << "Data dokter berhasil ditambahkan" << endl;
        }else if(pilihan == 2){
            P = NULL;
            delete_dokter(Lp, P);
            if (P != NULL){
                delete_relasidokter(Lr, P);
                cout << "Elemen List dokter "<< P->info.nama << " telah berhasil dihapus" << endl;
                delete P;
            }
        }else if(pilihan == 3){
            find_dokter(Lp, P);
        }else if(pilihan == 4){
            show_dokter(Lp);
        }else if(pilihan == 5){
            count_pasienTanpadokter(Lr, Lc);
        }else if(pilihan == 6){
            find_dokter(Lp, P);
            while (P == NULL){
                cout << "Data dokter tidak ditemukan" << endl;
                find_dokter(Lp, P);
            }
            count_pasien(Lr, P);
        }else if(pilihan == 7){
            find_dokter(Lp, P);
            while (P == NULL){
                cout << "Data dokter tidak ditemukan" << endl;
                find_dokter(Lp, P);
            }
            show_pasien_daridokter(Lr, P);
        }else if(pilihan == 8){
            cout << "Kembali ke menu utama" << endl;
        }else{
            cout << "Pilihan tidak valid" << endl;
        }
    }else if(pilihan == 2){
        cout << "------------------------------------------------------------" << endl;
        cout << "|                         MENU PASIEN                      |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "|          Sheren Aulia Azahra   //   103032400036         |" << endl;
        cout << "|    Mutiara Zalfaa Ananda Khairudin //   103032430009     |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "|   1. Menambahkan pasien                                  |" << endl;
        cout << "|   2. Menghapus pasien                                    |" << endl;
        cout << "|   3. Mencari pasien                                      |" << endl;
        cout << "|   4. Menampilkan pasien                                  |" << endl;
        cout << "|   5. Total pasien Tanpa dokter                           |" << endl;
        cout << "|   6. Total dokter Dari pasien Tertentu                   |" << endl;
        cout << "|   7. Menampilkan dokter dari pasien Tertentu             |" << endl;
        cout << "|   8. Kembali                                             |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "Masukkan pilihan: ";
        cin >> pilihan;
        cout << endl;
        if (pilihan == 1){
            cout << "Masukkan Nama pasien: ";
            cin >> dataC.nama;
            cout << "Masukkan Umur pasien: ";
            cin >> dataC.Umur;
            cout << "Masukkan NIK pasien: ";
            cin >> dataC.NIK;
            while (!checkNIK(Lc, dataC.NIK)){
                cout << "NIK sudah ada" << endl;
                cin >> dataC.NIK;
            }
            C = new elm_pasien;
            C->info = dataC;
            C->next_pasien = NULL;
            C->prev_pasien = NULL;
            insert_pasien(Lc, C);
            cout << "Data pasien berhasil ditambahkan" << endl;
        }else if(pilihan == 2){
            delete_pasien(Lc, C);
            if (C != NULL){
                delete_relasipasien(Lr, C);
                cout << "pasien dengan nama: " << C->info.nama  << " telah berhasil dihapus" << endl;
                delete C;
            }
        }else if(pilihan == 3){
            find_pasien(Lc, C);
        }else if(pilihan == 4){
            show_pasien(Lc);
        }else if(pilihan == 5){
            count_pasienTanpadokter(Lr, Lc);
        }else if(pilihan == 6){
            find_pasien(Lc, C);
            while (C == NULL){
                cout << "Data pasien tidak ditemukan" << endl;
                find_pasien(Lc, C);
            }
            count_dokter(Lr, C);
        }else if(pilihan == 7){
            find_pasien(Lc, C);
            show_dokter_daripasien(Lr, C);
        }else if(pilihan == 8){
            cout << "Kembali ke menu utama" << endl;
        }else{
            cout << "Pilihan tidak valid" << endl;
        }
    }else if (pilihan == 3){
        cout << "------------------------------------------------------------" << endl;
        cout << "|                        MENU RELASI                       |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "|          Sheren Aulia Azahra   //   103032400036         |" << endl;
        cout << "|    Mutiara Zalfaa Ananda Khairudin //   103032430009     |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "|   1. Menambahkan relasi                                  |" << endl;
        cout << "|   2. Menghapus relasi                                    |" << endl;
        cout << "|   3. Check relasi                                        |" << endl;
        cout << "|   4. Menampilkan pasien & relasinya                      |" << endl;
        cout << "|   5. Menampilkan dokter & relasinya                      |" << endl;
        cout << "|   6. edit relasi Dari dokter                             |" << endl;
        cout << "|   7. edit relasi Dari pasien                             |" << endl;
        cout << "|   8. Kembali                                             |" << endl;
        cout << "------------------------------------------------------------" << endl;
        cout << "Masukkan pilihan: ";
        cin >> pilihan;
        cout << endl;
        if (pilihan == 1){
            find_dokter(Lp, P);
            while (P == NULL){
                cout << "Data dokter tidak ditemukan" << endl;
                find_dokter(Lp, P);
            }
            find_pasien(Lc, C);
            while ( C == NULL){
                cout << "Data pasien tidak ditemukan" << endl;
                find_pasien(Lc, C);
            }
            cout << "Masukkan Info relasi: ";
            cin >> dataR;
            R = new elm_relasi;
            R->info = dataR;
            R->next_dokter = P;
            R->next_pasien = C;
            R->next_relasi = NULL;
            insert_relasi(Lr, R);
            cout << "relasi berhasil ditambahkan" << endl;
        }else if (pilihan == 2){
            find_dokter(Lp, P);
            while (P == NULL){
                cout << "Data dokter tidak ditemukan" << endl;
                find_dokter(Lp, P);
            }
            find_pasien(Lc, C);
            while ( C == NULL){
                cout << "Data pasien tidak ditemukan" << endl;
                find_pasien(Lc, C);
            }
            checkrelasi(Lr, C, P, R);
            if (R == NULL){
                cout << "relasi tidak ditemukan" << endl;
            }else{}
            delete_relasi(Lr, R);
            delete R;
            cout << "relasi berhasil dihapus" << endl;
        }else if (pilihan == 3){
            find_dokter(Lp, P);
            while (P == NULL){
                cout << "Data dokter tidak ditemukan" << endl;
                find_dokter(Lp, P);
            }
            find_pasien(Lc, C);
            while ( C == NULL){
                cout << "Data pasien tidak ditemukan" << endl;
                find_pasien(Lc, C);
            }
            checkrelasi(Lr, C, P, R);
        }else if (pilihan == 4){
            show_All_relasidokter(Lp, Lr);
        }else if (pilihan == 5){
            show_All_relasipasien(Lc, Lr);
        }else if (pilihan == 6){
            find_dokter(Lp, P);
            while (P == NULL){
                cout << "Data dokter tidak ditemukan" << endl;
                find_dokter(Lp, P);
            }
            find_pasien(Lc, C);
            while ( C == NULL){
                cout << "Data pasien tidak ditemukan" << endl;
                find_pasien(Lc, C);
            }
            checkrelasi(Lr, C, P, R);
            if (R != NULL){
                find_pasien(Lc, D);
                edit_dokter(Lr, P, C, D);
                cout << "relasi berhasil diubah" << endl;
            }
        }else if (pilihan == 7){
            find_pasien(Lc, C);
            while ( C == NULL){
                cout << "Data pasien tidak ditemukan" << endl;
                find_pasien(Lc, C);
            }
            find_dokter(Lp, P);
            while (P == NULL){
                cout << "Data dokter tidak ditemukan" << endl;
                find_dokter(Lp, P);
            }
            checkrelasi(Lr, C, P, R);
            if (R != NULL){
                find_dokter(Lp, Q);
                edit_pasien(Lr, C, P, Q);
                cout << "relasi berhasil diubah" << endl;
            }
        }else if (pilihan == 8){
            cout << "Kembali ke menu utama" << endl;
        }else{
            cout << "Pilihan tidak valid" << endl;
        }
    }
    menu(Lr, Lp, Lc);
}
void insert_dokter(List_dokter &L, adr_dokter P){
    if(L.first == NULL){
        L.first = P;
    }else{
        P->next_dokter = L.first;
        L.first = P;
    }
}
void insert_pasien(List_pasien &L, adr_pasien P){
    if(L.first == NULL){
        L.first = P;
        L.last = P;
    }else{
        L.last->next_pasien = P;
        P->prev_pasien = L.last;
        L.last = P;
    }
}
void insert_relasi(List_relasi &L, adr_relasi P){
    if(L.first == NULL){
        L.first = P;
    }else{
        P->next_relasi = L.first;
        L.first = P;
    }
}
void delete_dokter(List_dokter &L, adr_dokter &P){
    if(L.first == NULL){
        cout << "Data pasien kosong" << endl;
        return;
    }
    find_dokter(L, P);
    while (P == NULL){
        cout << "Data dokter tidak ditemukan" << endl;
        find_dokter(L, P);
    }
    if(P == L.first){
        delete_Firstdokter(L, P);
    }else if (P->next_dokter == NULL){
        delete_Lastdokter(L, P);
    }else{
        delete_Afterdokter(L, P);
    }
}
void delete_pasien(List_pasien &L, adr_pasien &P){
    if(L.first == NULL){
        cout << "Data pasien kosong" << endl;
        return;
    }
    find_pasien(L, P);
    if (P == NULL){
        cout << "Data pasien tidak ditemukan" << endl;
        return;
    }
    if (P == L.first){
        delete_Firstpasien(L, P);
    }else if (P == L.last){
        delete_Lastpasien(L, P);
    }else{
        delete_Afterpasien(L, P);
    }
}
void delete_relasi(List_relasi &L ,adr_relasi &P){
    if(L.first == NULL){
        cout << "Data relasi kosong" << endl;
    }else{
        if(P == L.first){
            L.first = P->next_relasi;
            P->next_relasi = NULL;
        }else{
            adr_relasi Q = L.first;
            while(Q->next_relasi != P){
                Q = Q->next_relasi;
            }
            if (P->next_relasi != NULL){
                Q->next_relasi = P->next_relasi;
            }
            Q->next_relasi = NULL;
        }
    }
}
void find_dokter(List_dokter L, adr_dokter &P){
    if (L.first == NULL){
        cout << "Data dokter kosong" << endl;
        return;
    }else{
        int ID;
        cout << "Masukkan ID dokter: ";
        cin >> ID;
        P = L.first;
        while(P != NULL){
            if(P->info.ID == ID){
                cout << "Data dokter ditemukan" << endl;
                cout << endl << "------------------------------------------------------------" << endl;
                cout << "|   Nama dokter: " << P->info.nama << endl;
                cout << "|   Spesialisasi dokter: " << P->info.spesialisasi << endl;
                cout << "|   ID dokter: " << P->info.ID << endl;
                cout << endl << "------------------------------------------------------------" << endl;
                return;
            }else{
                P = P->next_dokter;
            }
        }
    }
}
void find_pasien(List_pasien L, adr_pasien &P){
    if (L.first == NULL){
        cout << "Data pasien kosong" << endl;
        return;
    }else{
        int NIK;
        cout << "Masukkan NIK pasien: ";
        cin >> NIK;
        P = L.first;
        while(P != NULL){
            if(P->info.NIK == NIK){
                cout << "Data pasien ditemukan" << endl;
                cout << endl << "------------------------------------------------------------" << endl;
                cout << "|   Nama pasien: " << P->info.nama << endl;
                cout << "|   Umur pasien: " << P->info.Umur << endl;
                cout << "|   NIK pasien: " << P->info.NIK << endl;
                cout << endl << "------------------------------------------------------------" << endl;
                return;
            }else{
                P = P->next_pasien;
            }
        }
    }
}
void checkrelasi(List_relasi L, adr_pasien P, adr_dokter Q, adr_relasi &R){
    R = L.first;
    while(R != NULL){
        if(R->next_pasien == P && R->next_dokter == Q){
            cout << endl << "------------------------------------------------------------" << endl;
            cout << "|   relasi ditemukan" << endl;
            cout << "|   Info relasi: " << R->info << endl;
            cout << endl << "------------------------------------------------------------" << endl;
            return;
        }else{
            R = R->next_relasi;
        }
    }
    cout << endl << "------------------------------------------------------------" << endl;
            cout << "|   relasi Tidak Ditemukan" << endl;
    cout << endl << "------------------------------------------------------------" << endl;
}
void show_dokter(List_dokter L){
    if(L.first == NULL){
        cout << "Data dokter kosong" << endl;
    }else{
        adr_dokter P = L.first;
        cout << endl << "------------------------------------------------------------" << endl;
        while(P != NULL){
            cout << "|   Nama dokter: " << P->info.nama << endl;
            cout << "|   Spesialisasi dokter: " << P->info.spesialisasi << endl;
            cout << "|   ID dokter: " << P->info.ID << endl;
            cout << endl;
            P = P->next_dokter;
        }
        cout << "------------------------------------------------------------" << endl;
    }
}
void show_pasien(List_pasien L){
    if(L.first == NULL){
        cout << "Data pasien kosong" << endl;
    }else{
        adr_pasien P = L.first;
        cout << endl << "------------------------------------------------------------" << endl;
        while(P != NULL){
            cout << "|   Nama pasien: " << P->info.nama << endl;
            cout << "|   Umur pasien: " << P->info.Umur << endl;
            cout << "|   NIK pasien: " << P->info.NIK << endl;
            cout << endl;
            P = P->next_pasien;
        }
        cout << "------------------------------------------------------------" << endl;
    }
}
void show_pasien_daridokter(List_relasi L, adr_dokter P){
    if(L.first == NULL){
        cout << "Data relasi kosong" << endl;
    }else{
        adr_relasi R = L.first;
        bool ada = false;
        cout << endl << "------------------------------------------------------------" << endl;
        while(R != NULL){
            if(R->next_dokter == P){
                cout << "|   Nama pasien: " << R->next_pasien->info.nama << endl;
                cout << "|   Umur pasien: " << R->next_pasien->info.Umur << endl;
                cout << "|   NIK pasien: " << R->next_pasien->info.NIK << endl;
                cout << "|   Info relasi: " << R->info << endl;
                cout << endl;
                ada = true;
            }
            R = R->next_relasi;
        }
        if (!ada){
            cout << "|   dokter tidak memiliki relasi dengan pasien manapun" << endl;
        }
        cout << "------------------------------------------------------------" << endl;
    }
}
void show_dokter_daripasien(List_relasi L, adr_pasien P){
    if(L.first == NULL){
        cout << "Data relasi kosong" << endl;
    }else{
        adr_relasi R = L.first;
        bool ada = false;
        cout << endl << "------------------------------------------------------------" << endl;
        while(R != NULL){
            if(R->next_pasien == P){
                cout << "|   Nama dokter: " << R->next_dokter->info.nama << endl;
                cout << "|   Spesialisasi dokter: " << R->next_dokter->info.spesialisasi << endl;
                cout << "|   ID dokter: " << R->next_dokter->info.ID << endl;
                cout << "|   Info relasi: " << R->info << endl;
                cout << endl;
                ada = true;
            }
            R = R->next_relasi;
        }
        if (!ada){
            cout << "|   pasien tidak memiliki relasi dengan sekolah manapun" << endl;
        }
        cout << "------------------------------------------------------------" << endl;
    }
}
void show_All_relasidokter(List_dokter Lp, List_relasi Lr){
    if(Lp.first == NULL){
        cout << "Data dokter kosong" << endl;
    }else{
        adr_dokter P = Lp.first;
        cout << endl << "------------------------------------------------------------" << endl;
        while(P != NULL){
            cout << "|   Nama dokter: " << P->info.nama << endl;
            cout << "|   Spesialisasi dokter: " << P->info.spesialisasi << endl;
            cout << "|   ID dokter: " << P->info.ID << endl;
            cout << "------------------------------------------------------------" << endl;
            cout << "|     pasien Yang Memiliki relasi Dengan dokter Diatas     |" << endl;
            cout << "------------------------------------------------------------" << endl;
            show_pasien_daridokter(Lr, P);
            P = P->next_dokter;
        }
    }
}
void show_All_relasipasien(List_pasien Lc, List_relasi Lr){
    if(Lc.first == NULL){
        cout << "Data pasien kosong" << endl;
    }else{
        adr_pasien P = Lc.first;
        cout << endl << "------------------------------------------------------------" << endl;
        while(P != NULL){
            cout << "|   Nama pasien: " << P->info.nama << endl;
            cout << "|   Umur pasien: " << P->info.Umur << endl;
            cout << "|   NIK pasien: " << P->info.NIK << endl;
            cout << "------------------------------------------------------------" << endl;
            cout << "|     dokter Yang Memiliki relasi Dengan pasien Diatas     |" << endl;
            cout << "------------------------------------------------------------" << endl;
            show_dokter_daripasien(Lr, P);
            P = P->next_pasien;
        }
    }
}
void count_pasien(List_relasi L, adr_dokter P){
    if(L.first == NULL){
        cout << "Data relasi kosong" << endl;
    }else{
        adr_relasi R = L.first;
        int count_ = 0;
        while(R != NULL){
            if(R->next_dokter == P){
                count_++;
            }
            R = R->next_relasi;
        }
        cout << "|   Total pasien di dokter " << P->info.nama << ": " << count_ << endl;
    }
}
void count_dokter(List_relasi L, adr_pasien P){
    if(L.first == NULL){
        cout << "Data relasi kosong" << endl;
    }else{
        adr_relasi R = L.first;
        int count_ = 0;
        while(R != NULL){
            if(R->next_pasien == P){
                count_++;
            }
            R = R->next_relasi;
        }
        cout << "|   Total dokter dari pasien " << P->info.nama << ": " << count_ << endl;
    }
}
void count_dokterTanpapasien(List_relasi Lr, List_dokter Lp){
    if(Lr.first == NULL){
        show_dokter(Lp);
    }else{
        adr_dokter P = Lp.first;
        bool found;
        int count_ = 0;
        while (P != NULL){
            adr_relasi R = Lr.first;
            found = false;
            while(R != NULL){
                if (R->next_dokter == P){
                    found = true;
                }
                R = R->next_relasi;
            }
            if (!found){
                count_++;
            }
            P = P->next_dokter;
        }
        cout << "|   Total dokter yang tidak memiliki pasien: " << count_ << endl;
    }
}
void count_pasienTanpadokter(List_relasi Lr, List_pasien Lc){
    if(Lr.first == NULL){
        show_pasien(Lc);
    }else{
        adr_pasien P = Lc.first;
        bool found;
        int count_ = 0;
        adr_relasi R;
        while (P != NULL){
            R = Lr.first;
            found = false;
            while(R != NULL){
                if (R->next_pasien == P){
                    found = true;
                }
                R = R->next_relasi;
            }
            if (!found){
                count_++;
            }
            P = P->next_pasien;
        }
        cout << "|   Total pasien yang tidak memiliki dokter: " << count_ << endl;
    }
}
void edit_dokter(List_relasi &L, adr_dokter P, adr_pasien Q, adr_pasien R){
    adr_relasi S = L.first;
    adr_relasi T = NULL;
    checkrelasi(L, Q, P, T);
    T->next_pasien = R;
}
void edit_pasien(List_relasi &L, adr_pasien P, adr_dokter Q, adr_dokter R){
    adr_relasi S = L.first;
    adr_relasi T = NULL;
    checkrelasi(L, P, Q, T);
    T->next_dokter = R;
}
void delete_relasipasien(List_relasi &L, adr_pasien &P){
    adr_relasi R = L.first;
    while (R != NULL){
        if (R->next_pasien == P){
            delete_relasi(L,R);
            R = L.first;
        }
        R = R->next_relasi;
    }
}
void delete_relasidokter(List_relasi &L, adr_dokter &P){
    adr_relasi R = L.first;
    while (R != NULL){
        if (R->next_dokter == P){
            delete_relasi(L, R);
            R = L.first;
        }else{
            R = R->next_relasi;
        }
    }
}
void delete_Firstpasien(List_pasien &L, adr_pasien &P){
    if(L.first == NULL){
        cout << "Data pasien kosong" << endl;
        return;
    }
    if(L.first == L.last){
        L.first = NULL;
        L.last = NULL;
    }else{
        L.first = P->next_pasien;
        P->next_pasien = NULL;
        L.first->prev_pasien = NULL;
    }
}
void delete_Lastpasien(List_pasien &L, adr_pasien &P){
    if(L.first == NULL){
        cout << "Data pasien kosong" << endl;
        return;
    }
    if(L.first == L.last){
        L.first = NULL;
        L.last = NULL;
    }else{
        L.last = P->prev_pasien;
        P->prev_pasien = NULL;
        L.last->next_pasien = NULL;
    }
}
void delete_Afterpasien(List_pasien &L, adr_pasien &P){
    if(L.first == NULL){
        cout << "Data pasien kosong" << endl;
        return;
    }
    P->next_pasien->prev_pasien = P->prev_pasien;
    P->prev_pasien->next_pasien = P->next_pasien;
    P->next_pasien = NULL;
    P->prev_pasien = NULL;
}
void delete_Firstdokter(List_dokter &L, adr_dokter &P){
    if(L.first == NULL){
        cout << "Data dokter kosong" << endl;
        return;
    }
    if(L.first->next_dokter == NULL){
        L.first = NULL;
    }else{
        L.first = P->next_dokter;
        P->next_dokter = NULL;
    }
}
void delete_Lastdokter(List_dokter &L, adr_dokter &P){
    if(L.first == NULL){
        cout << "Data dokter kosong" << endl;
        return;
    }
    if(L.first->next_dokter == NULL){
        L.first = NULL;
    }else{
        adr_dokter Q = L.first;
        while (Q->next_dokter != P){
            Q = Q->next_dokter;
        }
        Q->next_dokter = NULL;
    }
}
void delete_Afterdokter(List_dokter &L, adr_dokter &P){
    if(L.first == NULL){
        cout << "Data dokter kosong" << endl;
        return;
    }
    adr_dokter Q = L.first;
    while (Q->next_dokter != P){
        Q = Q->next_dokter;
    }
    Q->next_dokter = P->next_dokter;
    P->next_dokter = NULL;
}
bool checkNIK(List_pasien L, int NIK){
    adr_pasien P = L.first;
    while (P != NULL){
        if (P->info.NIK == NIK){
            return false;
        }
        P = P->next_pasien;
    }
    return true;
}
bool checkID(List_dokter L, int ID){
    adr_dokter P = L.first;
    while (P != NULL){
        if (P->info.ID == ID){
            return false;
        }
        P = P->next_dokter;
    }
    return true;
}
