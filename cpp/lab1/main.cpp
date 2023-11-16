#include "Emprestimo.h"

#include <string>
#include <iostream>
using namespace std;

int main()
{
    cout << "Iniciando main...\n";

    Pessoa* murilo = new Pessoa("Murilo S. D.");
    Pessoa* autor = new Pessoa("Machado de Assis");

    Livro* book = new Livro("O Cortiço", autor);

    Emprestimo* emp = new Emprestimo(book, murilo);


    cout << "Nome: ";
    cout << emp->getResponsavel()->getNome();
    // cout << "\nAutor: ";
    // cout << emp->getLivroEmprestado()->getAutor()->getNome();
    // cout << "\nTitulo: ";
    // cout << emp->getLivroEmprestado()->getTitulo();


    // cout << "Livro emprestado para " + emp->getResponsavel()->getNome() + 
    //     "\nTitulo: " + emp->getLivroEmprestado()->getTitulo() + "\nAutor: " +
    //     emp->getLivroEmprestado()->getAutor()->getNome() + "\n";
    return 0;
}