package controller;

import java.util.ArrayList;
import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Funcao;
import entities.Funcionario;
import entities.Setor;
import repositories.FuncionarioRepositoryJsonImpl;
import repositories.FuncionarioRepositoryXmlImpl;

public class FuncionarioController {

	public void cadastrarFuncionario() {

		var funcionario = new Funcionario();
		funcionario.setId(UUID.randomUUID());

		var nome = JOptionPane.showInputDialog("Nome do funcionário:");

		var cpf = JOptionPane.showInputDialog("CPF do funcionário:");

		var matricula = JOptionPane.showInputDialog("Matrícula do funcionário:");

		var salario = JOptionPane.showInputDialog("Salário do funcionário:");

		var setor = new Setor();
		setor.setId(UUID.randomUUID());

		var setorNome = JOptionPane.showInputDialog("Nome do setor:");

		funcionario.setSetor(setor);

		var funcoes = new ArrayList<Funcao>();

		var qtdFuncoes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de funções:"));

		for (var i = 1; i <= qtdFuncoes; i++) {
			var funcao = new Funcao();
			funcao.setId(UUID.randomUUID());

			var descricao = JOptionPane.showInputDialog("Descrição da função " + i + ":");

			funcoes.add(funcao);
			funcao.setFuncao(descricao);
		}

		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setMatricula(matricula);
		funcionario.setSalario(Double.parseDouble(salario));
		funcionario.getSetor().setNome(setorNome);
		funcionario.getSetor().setId(UUID.randomUUID());
		funcionario.setFuncoes(funcoes);
		

		System.out.println("Funcionário cadastrado com sucesso!");

		var funcionarioRepositoryXml = new FuncionarioRepositoryXmlImpl();
		funcionarioRepositoryXml.exportar(funcionario);

		var funcionarioRepositoryJson = new FuncionarioRepositoryJsonImpl();
		funcionarioRepositoryJson.exportar(funcionario);

	}

}
