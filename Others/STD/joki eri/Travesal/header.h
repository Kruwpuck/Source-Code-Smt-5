#ifndef HEADER_H_INCLUDED
#define HEADER_H_INCLUDED
#include <iostream>
using namespace std;
typedef int infotype;
typedef struct elm *adrNode;
struct elm{
    adrNode right;
    adrNode left;
    infotype info;
};

struct stack{
    adrNode info[15];
    int Top;
};

void createStack(stack &S);
bool isEmpty(stack S);
bool isFull(stack S);
void push(stack &S, adrNode x);
adrNode pop(stack &S);
void printInfo(stack S);

adrNode newNode(infotype x);
void insertNode(adrNode &root, adrNode p);
void preOrderIterative(adrNode root);
void inOrderIterative(adrNode root);
void postOrderIterative(adrNode root);

#endif // HEADER_H_INCLUDED
