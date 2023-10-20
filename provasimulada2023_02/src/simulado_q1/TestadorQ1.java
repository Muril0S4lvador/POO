package simulado_q1;

import java.util.Date;

/**
 * Questão 1.
 * 
 * Crie classes para representar dados sobre uma base de usuários (UserBase) do Twitter, seguindo o diagrama UML fornecido.
 * 
 * Implemente funcionalidade nas suas classes para calcular a porcentagem de usuários "verificados" (VerifiedUser) 
 * em uma UserBase assim como o tamanho médio de cada mensagem (ou seja o tamanho médio do atributo text de 
 * todos os tweets de todos os usuários).
 * 
 * Crie um testador para suas classes. 
 * 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		UserBase x = new UserBase();

		User murilo = new User("Murilo");
		User salvador = new User("$4LW4_!)0R");
		VerifiedUser yo = new VerifiedUser("Lelenio Sal'Vatorh Delm Onec", new Date());

		murilo.tweet("Não sou lá fã de POO, mas é necessário aprender né... vamos lá!");
		murilo.tweet("Carai ate que to indo bem\nbem longe de duas horas, mas consigo fazer pelo menos");

		salvador.tweet("ODEIO JAVA JAVA ODEIO ODEIO ODEIO IDOEIOIDSJVBLFKVBDFLV PUTA QUE APAROIWRUTPOWIRGAFJVALFK");
		salvador.tweet("Queria da umazinha hoje pena que estoy solo :(");

		yo.tweet("Israel é um estado gebocida e ilegitimo, \ntodos que seguem este estado perverso querem garantir os statuos quo\nOcidental filhas da puta");
		yo.tweet("Se putin estivesse na minha frente agora ia botar p mamar\n\nAINN PAPAI UIIII CHORA");
		yo.tweet("O preço do medo da morte é nunca conseguir viver");

		x.addUser(murilo);
		x.addUser(salvador);
		x.addUser(yo);

		int sum = 0, cont = 0, verifieds = 0;
		for( User u : x.getUsuarios() ){
			System.out.println(u);

			if(u.isVerified()) verifieds++;

			System.out.println("Tamanho médio de tweets da conta:"+u.tamanhoMedioTweets()+"\n");
			sum += u.tamanhoMedioTweets();
			cont++;
		}
		System.out.println("Tamanho medio de tweets da rede: " + sum/cont);
		System.out.println("Verificados na rede: " + verifieds);


	}

}
