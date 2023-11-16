hello: Pessoa.o Livro.o Emprestimo.o main.cpp
	g++ -std=c++17 -o main main.cpp Pessoa.o Livro.o Emprestimo.o

Pessoa.o: Pessoa.h Pessoa.cpp
	g++ -std=c++17 -c -o Pessoa.o Pessoa.cpp

Livro.o: Pessoa.h Livro.h Livro.cpp
	g++ -std=c++17 -c -o Livro.o Livro.cpp

Emprestimo.o: Pessoa.h Livro.h Emprestimo.h Emprestimo.cpp
	g++ -std=c++17 -c -o Emprestimo.o Emprestimo.cpp