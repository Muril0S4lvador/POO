#include "Livro.h"

Livro::Livro(const string &titulo, Pessoa *autor)
{
    this->autor = autor;
    this->titulo = titulo;
}

string Livro::getTitulo() const
{
    return this->titulo;
}

Pessoa* Livro::getAutor()
{
    return this->autor;
}