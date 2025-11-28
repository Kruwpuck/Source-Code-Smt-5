#include "header.h"

using namespace std;

int main()
{
    adrNode root = NULL;
    int i,n, data;
    cout << "Masukkan jumlah node (n): ";
    cin >> n;
    for ( i = 0; i < n; i++) {
        cout << "Masukkan data ke-" << i+1 << ": ";
        cin >> data;
        adrNode p = newNode(data);
        insertNode(root, p);
    }
    cout << "\nPreorder Traversal: ";
    preOrderIterative(root);
    cout << "\nInorder Traversal: ";
    inOrderIterative(root);
    cout << "\nPostorder Traversal: ";
    postOrderIterative(root);
    cout << endl;

    return 0;
}
