#include <iostream>
using namespace std;
struct infotype_Toko{
    long long ID;
    string nama;
    string domain;
};
struct infotype_eCommerce{
    string Alamat;
    long long Kode;
    string nama;
};
typedef struct elm_Toko *adr_Toko;
typedef struct elm_eCommerce *adr_eCommerce;
typedef struct elm_Relasi *adr_Relasi;
struct List_Toko{
    adr_Toko first;
};
struct List_eCommerce{
    adr_eCommerce first;
    adr_eCommerce last;

};
struct List_Relasi{
    adr_Relasi first;
};
struct elm_Toko{
    infotype_Toko info;
    adr_Toko next_Toko;
};
struct elm_eCommerce{
    infotype_eCommerce info;
    List_Relasi relasi;
    adr_eCommerce next_eCommerce;
    adr_eCommerce prev_eCommerce;
};
struct elm_Relasi{
    adr_Toko next_Toko;
    adr_Relasi next_Relasi;
};
void inserteCommerce(List_eCommerce &L); 
void insertToko(List_Toko &L); 
void insertRelasi(List_eCommerce &Le, List_Toko &Lt); 
void deleteeCommerce(List_eCommerce &Le, adr_eCommerce &P); 
void deleteFirsteCommerce(List_eCommerce &L, adr_eCommerce &P);
void deleteLasteCommerce(List_eCommerce &L, adr_eCommerce &P);
void deleteAftereCommerce(List_eCommerce &L, adr_eCommerce &P);
void deleteToko(List_eCommerce &Le, List_Toko &Lt, adr_Toko &P); 
void deleteFirstToko(List_Toko &L, adr_Toko &P); 
void deleteLastAfterToko(List_Toko &L, adr_Toko &P);
void insertRelasiFirst(adr_eCommerce &P, adr_Relasi &R);
void deleteRelasi(adr_eCommerce &Q,adr_Relasi &P); 
void findeCommerce(List_eCommerce L, adr_eCommerce &P); 
void findToko(List_Toko L, adr_Toko &P); 
void findRelasi(adr_eCommerce P, adr_Toko Q, adr_Relasi &R);
void showeCommerce(List_eCommerce L); 
void showToko(List_Toko L); 
void showTokoDarieCommerce(List_eCommerce Le); 
void showAllRelasieCommerce(List_eCommerce Le); 
void showAllRelasiToko(List_Toko Lt, List_eCommerce Le); 
void showeCommerceDariToko(List_Toko Lt, List_eCommerce Le); 
void countAllRelasieCommerce(List_eCommerce Le); 
void countRelasiDariToko(List_Toko Lt, List_eCommerce Le); 
void countTokoTanpaeCommerce(List_Toko Lt, List_eCommerce Le); 
void editTokoDarieCommerce(List_Toko &Lt, List_eCommerce &Le); 
void mainMenu(List_eCommerce &Le, List_Toko &Lt); 
bool checkID(List_Toko L, long long ID);
bool checkKode(List_eCommerce L, long long Kode);
bool checkRelasi(adr_Toko P, adr_eCommerce Q);