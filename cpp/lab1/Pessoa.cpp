#include "Pessoa.h"

Pessoa::Pessoa(const string &nome) : nome(nome)
{
}

string Pessoa::getNome()const
{
    return this->nome;
}

void Pessoa::setNome(const string &nome)
{
    this->nome = nome;
}