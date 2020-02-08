// heap.cpp : �ܼ� ���� ���α׷��� ���� �������� �����մϴ�.
//

#include "stdafx.h"
#include <iostream>
using namespace std;

const int HeapSize = 100;

template <class Type>
class Element {
public:
    Type key;
};

template <class Type>
class MaxHeap {
public:
   MaxHeap (int sz) ;
   void display();
   void Insert(const Element<Type>& x);
   Element<Type> *DeleteMax(Element<Type>&);
   void inorder();
private:
   Element<Type> *heap;
   int n;        // current size of MaxHeap
   int capacity; // Maximum allowable size of MaxHeap

   void HeapEmpty(){ cout << "Heap Empty" << "\n";};
   void HeapFull(){ cout << "Heap Full";};
   void inorder(int CurrentNodeIndex) ;
};


template <class Type>
MaxHeap<Type>::MaxHeap (int sz = HeapSize)
{
    capacity = sz; n = 0;
    heap = new Element<Type> [capacity + 1]; // Don't want to use heap[0]
};

template <class Type>
void MaxHeap<Type>::display()
{
	int i;
	for(i=1; i <= n; i++) cout << i << ": " << heap[i].key << " ";
	cout << "\n";
}

template <class Type>
void MaxHeap<Type>::Insert(const Element<Type>& x)
{
   int i ;
   if (n == capacity) {HeapFull(); return;}   // �ʿ��ϴٸ� heap ũ�⸦ Ȯ��
   n++;
   for (i = n; 1; ) {
       if (i == 1) break; // at root
       if (x.key <= heap[i/2].key) break;
       // move from parent to i
       heap[i] = heap[i/2];
       i /= 2;
   }
   heap[i] = x;
}

template <class Type>
Element<Type>* MaxHeap<Type>::DeleteMax(Element<Type>& x)
{
   int i, j ;
   if (!n) {HeapEmpty(); return 0;}
   x = heap[1]; 
   Element<Type> k = heap[n]; n--;

   for (i = 1, j = 2; j <= n; )
   {
       if ( j < n) if (heap[j].key < heap[j+1].key) j++;
       // j points to the larger child
       if (k.key >= heap[j].key) break;
       heap[i] = heap[j];
       i = j; j *= 2;
   }
   heap[i] = k;
   return &x;
}

template <class Type>
void MaxHeap<Type>::inorder()    // �������迭�� ǥ���� ����Ʈ���� ������ȸ
{
   int root = 1 ;   // ��Ʈ ����� ÷�� = 1
   cout << "\n���� ��ȸ: " ;
   inorder(root);
   cout << "\n\n" ;
}

template <class Type>
void MaxHeap<Type>::inorder(int CurrentNodeIndex) // �������迭�� ǥ���� ����Ʈ���� ������ȸ
{
     if (CurrentNodeIndex <= n) {         // ��ȿ�� ����� ���
		inorder(2*CurrentNodeIndex);      // ���� �ڽĳ��
		cout << heap[CurrentNodeIndex].key << "  ";
		inorder(2*CurrentNodeIndex + 1);  // ������ �ڽĳ��
     }
}


int _tmain(int argc, _TCHAR* argv[])
// int main()
{
	MaxHeap<int> m(20);
	Element<int> a, b, c, d, e, f, g, h, i, j;

	a.key = 5; b.key = 3; c.key = 11; d.key = 3; e.key = 15;
	f.key = 2; g.key = 8; h.key = 22; i.key = 20; j.key = 9;

	m.Insert(a); m.Insert(b); m.Insert(c); m.Insert(d); m.Insert(e);
	m.Insert(f); m.Insert(g); m.Insert(h); m.Insert(i); m.Insert(j);

	m.inorder() ;    // 10���� ���� ������ �������� ������ȸ

	Element<int> x;  // �����Ǵ� ���Ұ� ����Ǵ� ����

	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";
	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";
	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";
	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";
	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";
	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";
	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";
	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";
	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";
	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";
	m.display();
	if (m.DeleteMax(x)) cout << x.key << "\n";  // �� ť���� �����ϰ� ��

	return 0;
}
