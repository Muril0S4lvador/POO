#include "Emprestimo.h"

Emprestimo::Emprestimo(Livro &livro, Pessoa &reponsavel) : livro(&livro), responsavel(&responsavel)
{
}

Livro& Emprestimo::getLivroEmprestado()
{
    return *(this->livro);
}

Pessoa& Emprestimo::getResponsavel()
{
    return *(this->responsavel);
}