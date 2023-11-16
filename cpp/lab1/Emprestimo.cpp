#include "Emprestimo.h"

Emprestimo::Emprestimo(Livro *livro, Pessoa *reponsavel)
{
    this->livro = livro;
    this->responsavel = responsavel;
}

Livro* Emprestimo::getLivroEmprestado()
{
    return this->livro;
}

Pessoa* Emprestimo::getResponsavel()
{
    return this->responsavel;
}