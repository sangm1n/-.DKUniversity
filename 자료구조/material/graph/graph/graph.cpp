// graph.cpp : �ܼ� ���� ���α׷��� ���� �������� �����մϴ�.
// ���ø�Ʈ�� ������� �� ���Ͽ� ��� Ŭ�������� �����ϰ� ����

#include "stdafx.h"
#include <iostream>
using namespace std;

class Graph;   //���漱��

 //���Ḯ��Ʈ�� �׷����� ǥ���ϱ� ���� ��� ����
class ChainNode {       // �ϳ��� ��� Ŭ����
friend class Graph; 
private:
   int data;       // ������ �ʵ�
   ChainNode *link;  // ��ũ �ʵ�
};

typedef ChainNode *ChainNodePointer ;

class Graph
{
public:
	Graph(int size) ;
	void InsertEdge(int v, int u);    // ��������Ʈ�� ǥ��
    void PrintVertex();               // ��������Ʈ�� ���
    void DFS(const int v);            // ���� �켱 Ž��
    void Components();                // ������ ���ϱ�
private:
    ChainNodePointer *HeadNodes;   // ��������Ʈ���� �� ������ ��� ���
	int n ;                        // n: ������ ��
	bool *visited ;                // �湮 ���θ� ǥ��
};

Graph::Graph(int size)
{ 
	HeadNodes = new ChainNodePointer[size]; // n���� ����� �迭 ����
	visited   = new bool[size];          // n���� visited �ʵ� ����
	n = size;
    for(int i=0; i<n; i++) {
	   HeadNodes[i] = 0 ;     // ��� ����� �ʱ�ȭ
       visited[i] = false;    // visited �ʵ��� �ʱ�ȭ
	}
}

void Graph::InsertEdge(int u, int v) 
{
   // ���� u�� ���Ḯ��Ʈ�� �� �տ� ��带 ����
   ChainNode *p = new ChainNode();
   p->data = v; 
   p->link = HeadNodes[u] ;
   HeadNodes[u] = p ;

   // ���� v�� ���Ḯ��Ʈ�� �� �տ� ��带 ����
   p = new ChainNode();
   p->data = u ;
   p->link = HeadNodes[v] ;
   HeadNodes[v] = p ;
}

void Graph::PrintVertex()
{
   cout << "\n\n ����Ʈ�� ǥ������ ��  -----   ";

   for(int i=0; i<n; i++)
   {
       cout << "\n " << i << " �� ��������: ";
       for(ChainNode *p = HeadNodes[i]; p; p=p->link)
           cout << p->data << "  ";
   }
}

void Graph::DFS(const int v)
{
   cout << v << "  ";
   visited[v] = true;
   for(ChainNode *p = HeadNodes[v]; p; p=p->link)
   {
       int w = p->data;
       if (!visited[w])
       {
           DFS(w);
       }
   }
}

void Graph::Components()
{
   cout << "\n\n DFS�� ���� ��� ���ϱ�:";
   for(int i=0; i<n; i++)
       if(!visited[i]) {
		   cout << "\n �ϳ��� ���� ��� - ";
           DFS(i);      // �ϳ��� ��� �߰�
	   }
}

int _tmain(int argc, _TCHAR* argv[])
{
   int n, e ;  // n: ������ ��, e: ������ ��
   int k, u, v ;
   cout << " ������ ���� ������ ���� �Է��Ͻÿ�: ";
   cin >> n >> e ;

   Graph g(n);
   
   for(int i=0; i<e; i++) {
	   k = i+1;
       cout << k << "��° ����(u, v)�� �Է� > ";
	   cin >> u >> v ;
       g.InsertEdge(u, v);
   }
   g.PrintVertex();  // �Էµ� �׷����� ���Ḯ��Ʈ ���
   g.Components();   // �Էµ� �׷����� ���� ��� ���ϱ�
   cout << "\n\n";

   return 0;
}

