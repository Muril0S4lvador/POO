#if !defined(LIVRO_H)
#define LIVRO_H

#include <string>
#include "Pessoa.h"

using namespace std;

class Livro{

    string titulo;
    Pessoa *autor;

public:
    Livro() {}
    Livro (const string &titulo, Pessoa &autor);
    string getTitulo() const;
    Pessoa& getAutor() const;

};

#endif // LIVRO_H
