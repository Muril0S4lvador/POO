#if !defined(EMPRESTIMO_H)
#define EMPRESTIMO_H

#include "Pessoa.h"
#include "Livro.h"

class Emprestimo{

    Livro *livro;
    Pessoa *responsavel;

public:
    Emprestimo() {}
    Emprestimo(Livro *livro, Pessoa *reponsavel);
    Livro *getLivroEmprestado();
    Pessoa *getResponsavel();

};

#endif // EMPRESTIMO_H
