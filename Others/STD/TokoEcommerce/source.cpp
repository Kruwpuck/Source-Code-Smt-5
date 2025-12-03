#include "header.h"
void mainMenu(List_eCommerce &Le, List_Toko &Lt){
    adr_Relasi R;
    adr_eCommerce P,Q;
    adr_Toko C,D;
    infotype_eCommerce dataP;
    infotype_Toko dataC;
    int pilihan;
    cout << "==================================================================" << endl;
    cout << "||                 Sistem Manajemen Toko E-commerce             ||" << endl;
    cout << "==================================================================" << endl;
    cout << "||               Ririn Nur Aini    //   103032400054            ||" << endl;
    cout << "||           Chelsea Izza Amanda   //   103032400077            ||" << endl;
    cout << "==================================================================" << endl;
    cout << "||   1. Data eCommerce                                          ||" << endl;
    cout << "||   2. Data Toko                                               ||" << endl;
    cout << "||   3. Data Relasi                                             ||" << endl;
    cout << "||   4. Exit                                                    ||" << endl;
    cout << "==================================================================" << endl;
    cout << "Masukkan pilihan: ";
    cin >> pilihan;
    if (pilihan == 4){
        return ;
    }
    while (pilihan < 1 || pilihan > 4){
        cout << "==================================================================" << endl;
        cout << "||                        INPUT INVALID                         ||" << endl;
        cout << "==================================================================" << endl;
        cout << "||               Ririn Nur Aini    //   103032400054            ||" << endl;
        cout << "||           Chelsea Izza Amanda   //   103032400077            ||" << endl;
        cout << "==================================================================" << endl;
        cout << "||   1. Data eCommerce                                          ||" << endl;
        cout << "||   2. Data Toko                                               ||" << endl;
        cout << "||   3. Data Relasi                                             ||" << endl;
        cout << "||   4. Keluar                                                  ||" << endl;
        cout << "==================================================================" << endl;
        cout << "Masukkan pilihan: ";
        cin >> pilihan;
    }
    if (pilihan == 1){
        cout << "==================================================================" << endl;
        cout << "||                       MENU ECOMMERCE                         ||" << endl;
        cout << "==================================================================" << endl;
        cout << "||               Ririn Nur Aini    //   103032400054            ||" << endl;
        cout << "||           Chelsea Izza Amanda   //   103032400077            ||" << endl;
        cout << "==================================================================" << endl;
        cout << "||   1. Menambahkan eCommerce                                   ||" << endl;
        cout << "||   2. Menghapus eCommerce                                     ||" << endl;
        cout << "||   3. Mencari eCommerce                                       ||" << endl;
        cout << "||   4. Menampilkan eCommerce                                   ||" << endl;
        cout << "||   5. Menampilkan Toko dari eCommerce Tertentu                ||" << endl;
        cout << "||   6. Menampilkan Semua Relasi eCommerce                      ||" << endl;
        cout << "||   7. Menghitung Semua Relasi eCommerce                       ||" << endl;
        cout << "||   8. Kembali                                                 ||" << endl;
        cout << "==================================================================" << endl;
        cout << "Masukkan pilihan: ";
        cin >> pilihan;
        cout << endl;
        if (pilihan == 1){
            inserteCommerce(Le); // a
        }else if(pilihan == 2){
            deleteeCommerce(Le, P); // d
        }else if(pilihan == 3){
            findeCommerce(Le, P); // g
        }else if(pilihan == 4){
            showeCommerce(Le); // j
        }else if(pilihan == 5){
            showTokoDarieCommerce(Le); // l
        }else if(pilihan == 6){
            showAllRelasieCommerce(Le); // m
        }else if(pilihan == 7){
            countAllRelasieCommerce(Le); // p
        }else if(pilihan == 8){
            cout << "Kembali ke menu utama" << endl;
        }else{
            cout << "Pilihan tidak valid" << endl;
        }
    }else if(pilihan == 2){
        cout << "==================================================================" << endl;
        cout << "||                          MENU TOKO                           ||" << endl;
        cout << "==================================================================" << endl;
        cout << "||               Ririn Nur Aini    //   103032400054            ||" << endl;
        cout << "||           Chelsea Izza Amanda   //   103032400077            ||" << endl;
        cout << "==================================================================" << endl;
        cout << "||   1. Menambahkan Toko                                        ||" << endl;
        cout << "||   2. Menghapus Toko                                          ||" << endl;
        cout << "||   3. Mencari Toko                                            ||" << endl;
        cout << "||   4. Menampilkan Toko                                        ||" << endl;
        cout << "||   5. Menampilkan eCommerce dari Toko Tertentu                ||" << endl;
        cout << "||   6. Menampilkan Semua Relasi Toko                           ||" << endl;
        cout << "||   7. Menghitung Relasi Toko Tertentu                         ||" << endl;
        cout << "||   8. Kembali                                                 ||" << endl;
        cout << "==================================================================" << endl;
        cout << "Masukkan pilihan: ";
        cin >> pilihan;
        if (pilihan == 1){
            insertToko(Lt); // b
        }else if(pilihan == 2){
            deleteToko(Le, Lt, D); // e
        }else if(pilihan == 3){
            findToko(Lt, C); // h
        }else if(pilihan == 4){
            showToko(Lt); // k
        }else if(pilihan == 5){
            showeCommerceDariToko(Lt, Le); // o
        }else if(pilihan == 6){
            showAllRelasiToko(Lt, Le); // n
        }else if(pilihan == 7){
            countRelasiDariToko(Lt, Le); // q
        }else if(pilihan == 8){
            cout << "Kembali ke menu utama" << endl;
        }else{
            cout << "Pilihan tidak valid" << endl;
        }
    }else if (pilihan == 3){
        cout << "==================================================================" << endl;
        cout << "||                        MENU RELASI                           ||" << endl;
        cout << "==================================================================" << endl;
        cout << "||               Ririn Nur Aini    //   103032400054            ||" << endl;
        cout << "||           Chelsea Izza Amanda   //   103032400077            ||" << endl;
        cout << "==================================================================" << endl;
        cout << "||   1. Menambahkan Relasi                                      ||" << endl;
        cout << "||   2. Menghapus Relasi                                        ||" << endl;
        cout << "||   3. Check Relasi                                            ||" << endl;
        cout << "||   4. Jumlah Toko Tanpa eCommerce                             ||" << endl;
        cout << "||   5. Edit Toko dari eCommerce                                ||" << endl;
        cout << "||   6. Kembali                                                 ||" << endl;
        cout << "==================================================================" << endl;
        cout << "Masukkan pilihan: ";
        cin >> pilihan;
        if (pilihan == 1){
            insertRelasi(Le, Lt); // c
        }else if (pilihan == 2){
            findeCommerce(Le, P);
            if (P != NULL){
                findToko(Lt, C);
                if (C != NULL){
                    findRelasi(P, C, R);
                }
            }
            deleteRelasi(P, R); // f
        }else if (pilihan == 3){
            findeCommerce(Le, P);
            if (P != NULL){
                findToko(Lt, C);
                if (C != NULL){
                    findRelasi(P, C, R); // i
                }
            }

        }else if (pilihan == 4){
            countTokoTanpaeCommerce(Lt, Le); // r
        }else if (pilihan == 5){
            editTokoDarieCommerce(Lt, Le); // s
        }else if (pilihan == 6){
            cout << "Kembali ke menu utama" << endl;
        }else{
            cout << "Pilihan tidak valid" << endl;
        }
    }
    mainMenu(Le, Lt);
}
void inserteCommerce(List_eCommerce &L){
    infotype_eCommerce dataP;
    cout << "Masukkan Nama eCommerce : ";
    cin >> dataP.nama;
    cout << "Masukkan Alamat eCommerce: ";
    cin >> dataP.Alamat;
    cout << "Masukkan Kode eCommerce  : ";
    cin >> dataP.Kode;
    while (!checkKode(L, dataP.Kode)){
        cout << "Kode sudah ada, masukkan Kode lain : ";
        cin >> dataP.Kode;
    }
    adr_eCommerce P = new elm_eCommerce;
    P->info = dataP;
    P->next_eCommerce = NULL;
    P->prev_eCommerce = NULL;
    P->relasi.first = NULL;
    if(L.first == NULL){
        L.first = P;
        L.last = P;
    }else{
        L.last->next_eCommerce = P;
        P->prev_eCommerce = L.last;
        L.last = P;
    }
}
void insertToko(List_Toko &L){
    infotype_Toko dataC;
    cout << "Masukkan Nama Toko: ";
    cin >> dataC.nama;
    cout << "Masukkan Domain      : ";
    cin >> dataC.domain;
    cout << "Masukkan ID Toko : ";
    cin >> dataC.ID;
    while (!checkID(L, dataC.ID)){
        cout << "ID sudah ada, masukkan ID lain : ";
        cin >> dataC.ID;
    }
    adr_Toko P = new elm_Toko;
    P->info = dataC;
    P->next_Toko = NULL;
    if(L.first == NULL){
        L.first = P;
    }else{
        P->next_Toko = L.first;
        L.first = P;
    }
}
void insertRelasi(List_eCommerce &Le, List_Toko &Lt){
    if(Le.first == NULL){
        cout << "Data eCommerce kosong" << endl;
        return;
    }else if(Lt.first == NULL){
        cout << "Data Toko kosong" << endl;
        return;
    }
    adr_eCommerce P;
    findeCommerce(Le, P);
    if(P == NULL){
        return;
    }
    adr_Toko Q;
    findToko(Lt, Q);
    if(Q == NULL){
        return;
    }
    if (!checkRelasi(Q, P)){
        cout << "Relasi sudah ada" << endl;
        return;
    }
    adr_Relasi R = new elm_Relasi;
    R->next_Toko = Q;
    insertRelasiFirst(P, R);
}
void insertRelasiFirst(adr_eCommerce &P, adr_Relasi &R){
    if (P->relasi.first == NULL){
        R->next_Relasi = NULL;
        P->relasi.first = R;
    }else{
        R->next_Relasi = P->relasi.first;
        P->relasi.first = R;
    }
}
void deleteeCommerce(List_eCommerce &Le, adr_eCommerce &P){
    if(Le.first == NULL){
        cout << "Data eCommerce kosong" << endl;
        return;
    }
    findeCommerce(Le, P);
    if (P == NULL){
        return;
    }
    if (P->relasi.first != NULL){
        adr_Relasi R;
        R = P->relasi.first;
        while (R != NULL){
            deleteRelasi(P, R);
            // delete R;
            R = P->relasi.first;
        }
    }
    if (Le.first->next_eCommerce == NULL){
        Le.first = NULL;
    }else if(P == Le.first){
        deleteFirsteCommerce(Le, P);
    }else if (P == Le.last){
        deleteLasteCommerce(Le, P);
    }else{
        deleteAftereCommerce(Le, P);
    }
}
void deleteFirsteCommerce(List_eCommerce &L, adr_eCommerce &P){
    L.first = P->next_eCommerce;
    P->next_eCommerce = NULL;
    P->prev_eCommerce = NULL;
}
void deleteLasteCommerce(List_eCommerce &L, adr_eCommerce &P){
    L.last = P->prev_eCommerce;
    P->prev_eCommerce = NULL;
    L.last->next_eCommerce = NULL;
}
void deleteAftereCommerce(List_eCommerce &L, adr_eCommerce &P){
    P->next_eCommerce->prev_eCommerce = P->prev_eCommerce;
    P->prev_eCommerce->next_eCommerce = P->next_eCommerce;
    P->next_eCommerce = NULL;
    P->prev_eCommerce = NULL;
}
void deleteToko(List_eCommerce &Le, List_Toko &Lt, adr_Toko &P){
    if (Lt.first == NULL){
        cout << "Data Toko kosong" << endl;
        return;
    }
    findToko(Lt, P);
    if (P == NULL){
        return;
    }
    if (Le.first != NULL){
        adr_eCommerce Q = Le.first;
        while (Q != NULL){
            if (Q->relasi.first != NULL){
                adr_Relasi R = Q->relasi.first;
                while (R != NULL){
                    if (R->next_Toko == P){
                        deleteRelasi(Q, R);
                        R = Q->relasi.first;
                    }else{
                        R = R->next_Relasi;
                    }
                }
            }
            Q = Q->next_eCommerce;
        }
    }
    if (Lt.first->next_Toko == NULL){
        Lt.first = NULL;
    }else if(P == Lt.first){
        deleteFirstToko(Lt, P);
    }else {
        deleteLastAfterToko(Lt, P);
    }
}
void deleteFirstToko(List_Toko &L, adr_Toko &P){
    L.first = P->next_Toko;
    P->next_Toko = NULL;
}
void deleteLastAfterToko(List_Toko &L, adr_Toko &P){
    adr_Toko Q = L.first;
    while (Q->next_Toko != P){
        Q = Q->next_Toko;
    }
    if (P->next_Toko == NULL){
        Q->next_Toko = P->next_Toko;
    }
    Q->next_Toko = NULL;
}
void deleteRelasi(adr_eCommerce &Q ,adr_Relasi &P){
    if(Q->relasi.first == NULL){
        cout << "Data Relasi kosong" << endl;
    }else{
        if(Q->relasi.first->next_Relasi == NULL){
            P = Q->relasi.first;
            Q->relasi.first = NULL;
        }else{
            if (P == Q->relasi.first){
                Q->relasi.first = P->next_Relasi;
                P->next_Relasi = NULL;
            }else{
                adr_Relasi R = Q->relasi.first;
                while(R->next_Relasi != P){
                    R = R->next_Relasi;
                }
                if (P->next_Relasi != NULL){
                    R->next_Relasi = P->next_Relasi;
                    P->next_Relasi = NULL;
                }else{
                    R->next_Relasi = NULL;
                }

            }
        }
    }
    cout << "==================================================================" << endl;
}
void findeCommerce(List_eCommerce L, adr_eCommerce &P){
    long long Kode;
    cout << "Masukkan Kode eCommerce yang dicari : ";
    cin >> Kode;
    cout << endl;
    P = L.first;
    while(P != NULL){
        if(P->info.Kode == Kode){
            cout << "Data eCommerce ditemukan" << endl;
            cout << "Nama eCommerce    : " << P->info.nama << endl;
            cout << "Kode eCommerce     : " << P->info.Kode << endl;
            cout << "Alamat eCommerce    : " << P->info.Alamat << endl;
            cout << "==================================================================" << endl;
            return;
        }
        P = P->next_eCommerce;
    }
    cout << "Data eCommerce tidak ditemukan" << endl;
    cout << "==================================================================" << endl;
    P = NULL;
}
void findToko(List_Toko L, adr_Toko &P){
    long long ID;
    cout << "Masukkan ID Toko yang dicari : ";
    cin >> ID;
    P = L.first;
    while(P != NULL){
        if(P->info.ID == ID){
            cout << "Data Toko ditemukan" << endl;
            cout << "Nama Toko : " << P->info.nama << endl;
            cout << "ID Toko  : " << P->info.ID << endl;
            cout << "Domain       : " << P->info.domain << endl;
            cout << "==================================================================" << endl;
            return;
        }
        P = P->next_Toko;
    }
    cout << "Data Toko tidak ditemukan" << endl;
    cout << "==================================================================" << endl;
    P = NULL;
}
void findRelasi(adr_eCommerce P, adr_Toko Q, adr_Relasi &R){
    if (P->relasi.first == NULL){
        cout << "Data Relasi kosong" << endl;
    }else{
        R = P->relasi.first;
        while(R != NULL){
            if(R->next_Toko == Q){
                cout << "Data Relasi ditemukan" << endl;
                cout << "Nama eCommerce     : " << P->info.nama << endl;
                cout << "Kode eCommerce      : " << P->info.Kode << endl;
                cout << "Alamat eCommerce     : " << P->info.Alamat << endl;
                cout << "==================================================================" << endl;
                cout << "Nama Toko : " << Q->info.nama << endl;
                cout << "ID Toko  : " << Q->info.ID << endl;
                cout << "Domain       : " << Q->info.domain << endl;
                cout << "==================================================================" << endl;
                return;
            }
            R = R->next_Relasi;
        }
        cout << "Data Relasi tidak ditemukan" << endl;
        cout << "==================================================================" << endl;
        R = NULL;
    }
}
void showeCommerce(List_eCommerce L){
    adr_eCommerce P = L.first;
    if(P == NULL){
        cout << "Data eCommerce kosong" << endl;
    }else{
        cout << "Data eCommerce : " << endl;
        while(P != NULL){
            cout << "Nama eCommerce    : " << P->info.nama << endl;
            cout << "Kode eCommerce     : " << P->info.Kode << endl;
            cout << "Alamat eCommerce    : " << P->info.Alamat << endl;
            cout << "==================================================================" << endl;
            P = P->next_eCommerce;
        }
    }
}
void showToko(List_Toko L){
    adr_Toko P = L.first;
    if(P == NULL){
        cout << "Data Toko kosong" << endl;
        cout << "==================================================================" << endl;
    }else{
        cout << "Data Toko : " << endl;
        while(P != NULL){
            cout << "Nama Toko : " << P->info.nama << endl;
            cout << "ID Toko  : " << P->info.ID << endl;
            cout << "Domain       : " << P->info.domain << endl;
            cout << "==================================================================" << endl;
            P = P->next_Toko;
        }
    }
}
void showTokoDarieCommerce(List_eCommerce Le){
    if (Le.first == NULL){
        cout << "Data eCommerce kosong" << endl;
    }else{
        adr_eCommerce P;
        findeCommerce(Le, P);
        if (P == NULL){
            return;
        }
        if (P->relasi.first == NULL){
            cout << "eCommerce Ini Tidak Memiliki Relasi" << endl;
        }else{
            adr_Relasi R = P->relasi.first;
            while (R != NULL){
                cout << "Nama Toko : " << R->next_Toko->info.nama << endl;
                cout << "ID Toko  : " << R->next_Toko->info.ID << endl;
                cout << "Domain       : " << R->next_Toko->info.domain << endl;
                cout << "==================================================================" << endl;
                R = R->next_Relasi;
            }
        }
    }
}
void showAllRelasieCommerce(List_eCommerce Le){
    if (Le.first == NULL){
        cout << "Data eCommerce kosong" << endl;
    }else{
        adr_eCommerce P = Le.first;
        adr_Relasi R;
        bool ada;
        while (P != NULL){
            cout << "Nama eCommerce    : " << P->info.nama << endl;
            cout << "Kode eCommerce     : " << P->info.Kode << endl;
            cout << "Alamat eCommerce    : " << P->info.Alamat << endl;
            cout << "==================================================================" << endl;
            R = P->relasi.first;
            while (R != NULL){
                cout << "Nama Toko : " << R->next_Toko->info.nama << endl;
                cout << "ID Toko  : " << R->next_Toko->info.ID << endl;
                cout << "Domain       : " << R->next_Toko->info.domain << endl;
                cout << "==================================================================" << endl;
                R = R->next_Relasi;
                ada = true;
            }
            if (!ada){
                cout << "Data Relasi tidak ditemukan" << endl;
            }
            P = P->next_eCommerce;
        }
    }
}
void showAllRelasiToko(List_Toko Lt, List_eCommerce Le){
    if (Lt.first == NULL){
        cout << "Data Toko kosong" << endl;
    }else if (Le.first == NULL){
        cout << "Data eCommerce kosong" << endl;
    }else{
        adr_Toko P = Lt.first;
        adr_Relasi R;
        adr_eCommerce Q;
        bool ada;
        while (P != NULL){
            ada = false;
            cout << "Nama Toko : " << P->info.nama << endl;
            cout << "ID Toko  : " << P->info.ID << endl;
            cout << "Domain       : " << P->info.domain << endl;
            cout << "==================================================================" << endl;
            Q = Le.first;
            while (Q != NULL){
                R = Q->relasi.first;
                while (R != NULL){
                    if (R->next_Toko == P){
                        cout << "Nama eCommerce    : " << Q->info.nama << endl;
                        cout << "Kode eCommerce     : " << Q->info.Kode << endl;
                        cout << "Alamat eCommerce    : " << Q->info.Alamat << endl;
                        cout << "==================================================================" << endl;
                        ada = true;
                    }
                    R = R->next_Relasi;
                }
                Q = Q->next_eCommerce;
            }
            if (!ada){
                cout << "Data Relasi tidak ditemukan" << endl;
            }
            P = P->next_Toko;
        }
    }
}
void showeCommerceDariToko(List_Toko Lt, List_eCommerce Le){
    if (Lt.first == NULL){
        cout << "Data eCommerce kosong" << endl;
    }else if (Lt.first == NULL){
        cout << "Data Toko kosong" << endl;
    }else{
        adr_Toko P;
        adr_Relasi R;
        findToko(Lt, P);
        if (P == NULL){
            return;
        }
        adr_eCommerce Q = Le.first;
        bool ada = false;
        while (Q != NULL){
            R = Q->relasi.first;
            while (R != NULL){
                if (R->next_Toko == P){
                    cout << "Nama eCommerce    : " << Q->info.nama << endl;
                    cout << "Kode eCommerce     : " << Q->info.Kode << endl;
                    cout << "Alamat eCommerce    : " << Q->info.Alamat << endl;
                    cout << "==================================================================" << endl;
                    ada = true;
                }
                R = R->next_Relasi;
            }
            Q = Q->next_eCommerce;
        }
        if (!ada){
            cout << "Data Relasi tidak ditemukan" << endl;
        }
    }
}
void countAllRelasieCommerce(List_eCommerce Le){
    if (Le.first == NULL){
        cout << "Data eCommerce kosong" << endl;
    }else{
        adr_eCommerce P = Le.first;
        int count;
        while (P != NULL){
            adr_Relasi R = P->relasi.first;
            count = 0;
            while (R != NULL){
                count++;
                R = R->next_Relasi;
            }
            P = P->next_eCommerce;
        }
        cout << "Jumlah Relasi : " << count << endl;
    }
}
void countRelasiDariToko(List_Toko Lt, List_eCommerce Le){
    if (Lt.first == NULL){
        cout << "Data Toko kosong" << endl;
    }else if (Le.first == NULL){
        cout << "Data eCommerce kosong" << endl;
    }else {
        adr_Toko P;
        findToko(Lt, P);
        if (P == NULL){
            return;
        }
        adr_eCommerce Q = Le.first;
        int count = 0;
        while (Q != NULL){
            adr_Relasi R = Q->relasi.first;
            while (R != NULL){
                if (R->next_Toko == P){
                    count++;
                }
                R = R->next_Relasi;
            }
            Q = Q->next_eCommerce;
        }
        cout << "Jumlah Relasi : " << count << endl;
    }
}
void countTokoTanpaeCommerce(List_Toko Lt, List_eCommerce Le){
    if (Lt.first == NULL){
        cout << "Data Toko kosong" << endl;
        return;
    }
    adr_Toko P = Lt.first;
    int count = 0;
    bool ada;
    while (P != NULL){
        adr_eCommerce Q = Le.first;
        ada = false;
        while (Q != NULL){
            adr_Relasi R = Q->relasi.first;
            while (R != NULL){
                if (R->next_Toko == P){
                    ada = true;
                }
                R = R->next_Relasi;
            }
            Q = Q->next_eCommerce;
        }
        if (!ada){
            count++;
        }
        P = P->next_Toko;
    }
    cout << "Jumlah Toko tanpa eCommerce : " << count << endl;
    cout << "==================================================================" << endl;
}
void editTokoDarieCommerce(List_Toko &Lt, List_eCommerce &Le){
    if (Le.first == NULL){
        cout << "Data eCommerce kosong" << endl;
    }else if (Lt.first == NULL){
        cout << "Data Toko kosong" << endl;
    }else{
        adr_eCommerce P;
        findeCommerce(Le, P);
        if (P == NULL){
            return;
        }
        adr_Toko Q,S;
        findToko(Lt, Q);
        if (Q == NULL){
            return;
        }
        adr_Relasi R,T;
        findRelasi(P, Q, R);
        if (R == NULL){
            return;
        }
        cout << "Masukkan ID Toko yang baru : "<< endl;
        findToko(Lt, S);
        findRelasi(P, S, T);
        if (T != NULL){
            cout << "Relasi sudah ada" << endl;
            return;
        }
        R->next_Toko = S;
        cout << "Data Toko berhasil diubah" << endl;
    }
}

bool checkID(List_Toko L, long long ID){
    adr_Toko P = L.first;
    while (P != NULL){
        if (P->info.ID == ID){
            return false;
        }
        P = P->next_Toko;
    }
    return true;
}
bool checkKode(List_eCommerce L, long long Kode){
    adr_eCommerce P = L.first;
    while (P != NULL){
        if (P->info.Kode == Kode){
            return false;
        }
        P = P->next_eCommerce;
    }
    return true;
}
bool checkRelasi(adr_Toko P, adr_eCommerce Q){
    adr_Relasi R = Q->relasi.first;
    while (R != NULL){
        if (R->next_Toko == P){
            return false;
        }
        R = R->next_Relasi;
    }
    return true;
}
