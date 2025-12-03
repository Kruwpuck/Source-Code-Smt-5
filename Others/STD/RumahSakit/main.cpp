#include "header.h"
int main()
{
    List_dokter Lp;
    List_pasien Lc;
    List_relasi Lr;
    Lp.first = NULL;
    Lr.first = NULL;
    Lc.first = NULL;
    Lc.last = NULL;
    menu(Lr, Lp, Lc);
    return 0;
}
