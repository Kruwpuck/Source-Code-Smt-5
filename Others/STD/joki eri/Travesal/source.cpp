#include "header.h"

void createStack(stack &S) {
    S.Top = -1;
}

bool isEmpty(stack S) {
    return S.Top == -1;
}

bool isFull(stack S) {
    return S.Top == 14;
}

void push(stack &S, adrNode x) {
    if (!isFull(S)) {
        S.Top++;
        S.info[S.Top] = x;
    }
}

adrNode pop(stack &S) {
    if (!isEmpty(S)) {
        adrNode x = S.info[S.Top];
        S.Top--;
        return x;
    }
    return NULL;
}

void printInfo(stack S) {
    for (int i = S.Top; i >= 0; i--) {
        cout << S.info[i]->info << " ";
    }
    cout << endl;
}

adrNode newNode(infotype x) {
    adrNode p = new elm;
    p->info = x;
    p->left = NULL;
    p->right = NULL;
    return p;
}

void insertNode(adrNode &root, adrNode p) {
    if (root == NULL) {
        root = p;
    } else {
        if (p->info < root->info) {
            insertNode(root->left, p);
        } else {
            insertNode(root->right, p);
        }
    }
}

void preOrderIterative(adrNode root) {
    if (root == NULL) return;
    stack s;
    createStack(s);
    push(s, root);
    while (!isEmpty(s)) {
        adrNode q = pop(s);
        cout << q->info << " ";
        if (q->right) {
            push(s, q->right);
        }
        if (q->left) {
            push(s, q->left);
        }
    }
}

void inOrderIterative(adrNode root) {
    stack s;
    createStack(s);
    adrNode q = root;
    while (q != NULL || !isEmpty(s)) {
        while (q != NULL) {
            push(s, q);
            q = q->left;
        }
        q = pop(s);
        cout << q->info << " ";
        q = q->right;
    }
}

void postOrderIterative(adrNode root) {
    if (root == NULL) return;
    stack s1, s2;
    createStack(s1);
    createStack(s2);
    push(s1, root);
    while (!isEmpty(s1)) {
        adrNode q = pop(s1);
        push(s2, q);
        if (q->left) {
            push(s1, q->left);
        }
        if (q->right) {
            push(s1, q->right);
        }
    }
    while (!isEmpty(s2)) {
        cout << pop(s2)->info << " ";
    }
}
