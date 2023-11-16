#include "Livro.h"

Livro::Livro(const string &titulo, Pessoa &autor) : autor(&autor), titulo(titulo)
{
}

string Livro::getTitulo() const
{
    return this->titulo;
}

Pessoa& Livro::getAutor() const
{
    return *(this->autor);
}