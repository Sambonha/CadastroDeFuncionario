package repositories;

import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	public void exportarParaTxt(Funcionario funcionario) {

		try {
			var printWriter = new PrintWriter("c:\\temp\\funcionario_" + funcionario.id + ".txt");
			printWriter.write(funcionario.id + "\n");
			printWriter.write(funcionario.nome + "\n");
			printWriter.write(funcionario.cpf + "\n");
			printWriter.write(funcionario.matricula + "\n");
			printWriter.write(funcionario.salario + "\n");
			printWriter.write(funcionario.dataHoraCadastro + "\n");
			printWriter.close();

			System.out.println("\n Dados gravados com sucesso!");

		} catch (Exception e) {
			System.out.println("\n Falha ao gravar arquivo!");

		}
	}

}
