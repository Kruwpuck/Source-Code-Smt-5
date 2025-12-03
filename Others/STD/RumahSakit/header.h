#ifndef HEADER_H_INCLUDED
#define HEADER_H_INCLUDED

#include <iostream>
#include <string>

using namespace std;

struct elm_pasien;
struct elm_dokter;
struct elm_relasi;

typedef elm_pasien* adr_pasien;
typedef elm_dokter* adr_dokter;
typedef elm_relasi* adr_relasi;

struct infotype_pasien {
    int NIK;
    string nama;
    string Umur;
};

struct infotype_dokter {
    string spesialisasi;
    int ID;
    string nama;
};

struct elm_pasien {
    infotype_pasien info;
    adr_pasien next_pasien;
    adr_pasien prev_pasien;
};

struct elm_dokter {
    infotype_dokter info;
    adr_dokter next_dokter;
};

struct elm_relasi {
    adr_pasien next_pasien;
    adr_dokter next_dokter;
    adr_relasi next_relasi;
    string info;
};

struct List_pasien {
    adr_pasien first;
    adr_pasien last;
};

struct List_relasi {
    adr_relasi first;
};

struct List_dokter {
    adr_dokter first;
};

void insert_dokter(List_dokter &L, adr_dokter P);
void insert_pasien(List_pasien &L, adr_pasien P);
void insert_relasi(List_relasi &L, adr_relasi P);
void delete_dokter(List_dokter &L, adr_dokter &P);
void delete_Firstdokter(List_dokter &L, adr_dokter &P);
void delete_Lastdokter(List_dokter &L, adr_dokter &P);
void delete_Afterdokter(List_dokter &L, adr_dokter &P);
void delete_pasien(List_pasien &L, adr_pasien &P);
void delete_Firstpasien(List_pasien &L, adr_pasien &P);
void delete_Lastpasien(List_pasien &L, adr_pasien &P);
void delete_Afterpasien(List_pasien &L, adr_pasien &P);
void delete_relasi(List_relasi &L, adr_relasi &P);
void find_dokter(List_dokter L, adr_dokter &P);
void find_pasien(List_pasien L, adr_pasien &P);
void checkrelasi(List_relasi L, adr_pasien P, adr_dokter Q, adr_relasi &R);
void show_dokter(List_dokter L);
void show_pasien(List_pasien L);
void show_pasien_daridokter(List_relasi L, adr_dokter P);
void show_dokter_daripasien(List_relasi L, adr_pasien P);
void show_All_relasidokter(List_dokter Lp, List_relasi Lr);
void show_All_relasipasien(List_pasien Lc, List_relasi Lr);
void count_pasien(List_relasi L, adr_dokter P);
void count_dokter(List_relasi L, adr_pasien P);
void count_dokterTanpapasien(List_relasi Lr, List_dokter Lp);
void count_pasienTanpadokter(List_relasi Lr, List_pasien Lc);
void edit_dokter(List_relasi &L, adr_dokter P, adr_pasien Q, adr_pasien R);
void edit_pasien(List_relasi &L, adr_pasien P, adr_dokter Q, adr_dokter R);
void menu(List_relasi &Lr, List_dokter &Lp, List_pasien &Lc);
void delete_relasipasien(List_relasi &L, adr_pasien &P);
void delete_relasidokter(List_relasi &L, adr_dokter &P);
bool checkNIK(List_pasien L, int NIK);
bool checkID(List_dokter L, int ID);

#endif // HEADER_H_INCLUDED