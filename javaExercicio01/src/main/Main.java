package main;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class Main {
	public static void main(String[] args) {
		System.out.println("\n------------ Sistema de cadastro de funcionário. ------------\n");

		var scanner = new Scanner(System.in);

		var funcionario = new Funcionario();

		funcionario.id = UUID.randomUUID();

		System.out.print("Informe o NOME do funcionário.......:");
		funcionario.nome = scanner.nextLine();

		System.out.print("Informe o CPF.......................:");
		funcionario.cpf = scanner.nextLine();

		System.out.print("Informe a matrícula.................:");
		funcionario.matricula = scanner.nextLine();

		System.out.print("Informe o salário...................:");
		funcionario.salario = scanner.nextDouble();

		funcionario.dataHoraCadastro = LocalDateTime.now();

		System.out.println("\n ------------Dados do cliente------------");
		System.out.println("\t Id do funcionário........:" + funcionario.id);
		System.out.println("\t Nome do funcionário......:" + funcionario.nome);
		System.out.println("\t CPF do funcionário.......:" + funcionario.cpf);
		System.out.println("\t Matrícula do funcionário.:" + funcionario.matricula);
		System.out.println("\t Salário do funcionário...: R$" + funcionario.salario);
		System.out.println("\t Funcionário cadastrado em:" + funcionario.dataHoraCadastro);
		
		var funcionarioRepository = new FuncionarioRepository();
		
		funcionarioRepository.exportarParaTxt(funcionario);
		
			
		
		
		
		

	}
}
