#ifndef PESSOA_H
#define PESSOA_H

#include <string>

using namespace std;

class Pessoa{
    string nome;

public:
    Pessoa() {}
    Pessoa(const string &nome);
    string getNome()const;
    void setNome(const string &nome);
};

#endif