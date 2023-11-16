#include "Emprestimo.h"

#include <string>
#include <iostream>
using namespace std;

int main()
{
    cout << "Iniciando main...\n";

    Pessoa murilo("Murilo S. D.");
    string nome = murilo.getNome();
    cout << "Imprimindo nome\n";
    cout << nome;

    Pessoa autor("Machado de Assis");

    Livro book("O Cortiço", autor);

    Emprestimo empEmprestimo(book, murilo);


    cout << "Nome: ";
    // cout << emp->getResponsavel()->getNome();
    // cout << "\nAutor: ";
    // cout << emp->getLivroEmprestado()->getAutor()->getNome();
    // cout << "\nTitulo: ";
    // cout << emp->getLivroEmprestado()->getTitulo();


    // cout << "Livro emprestado para " + emp->getResponsavel()->getNome() + 
    //     "\nTitulo: " + emp->getLivroEmprestado()->getTitulo() + "\nAutor: " +
    //     emp->getLivroEmprestado()->getAutor()->getNome() + "\n";
    return 0;
}