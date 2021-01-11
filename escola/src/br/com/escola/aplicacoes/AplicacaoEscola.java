package br.com.escola.aplicacoes;

import br.com.escola.modelos.Aluno;
import br.com.escola.modelos.Curso;
import br.com.escola.modelos.Magica;
import br.com.escola.modelos.Professor;
import br.com.escola.modelos.Turma;
import br.com.escola.modelos.Unidade;

public class AplicacaoEscola {

	public static void main(String[] args) {
		Turma turma = new Turma(
				Magica.s("Sigla"),
				Magica.s("Periodo"),
				Magica.s("Sala"),
				new Aluno(
						Magica.i("RM"),
						Magica.s("Fone"),
						Magica.s("Nome"),
						Magica.b("Está ativo?")
						),
				new Professor(
						Magica.s("Nome"),
						Magica.f("Valor Hora"),
						Magica.s("Formação"),
						Magica.s("Area"),
						Magica.s("Email")
						),
				new Curso(
						Magica.s("Descricao"),
						Magica.i("Carga Horária"),
						Magica.f("Valor"),
						new Unidade(
								Magica.s("Nome"),
								Magica.s("Bairro"),
								Magica.s("Telefone")
								)
						)
				);
		
		
		System.out.println(turma.toString());
	}

}
