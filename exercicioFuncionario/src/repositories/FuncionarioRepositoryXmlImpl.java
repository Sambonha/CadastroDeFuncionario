package repositories;

import java.io.PrintWriter;

import entities.Funcao;
import entities.Funcionario;
import interfaces.FuncionarioRepository;

public class FuncionarioRepositoryXmlImpl implements FuncionarioRepository {

	public void exportar(Funcionario funcionario) {

		try {
			var printWriter = new PrintWriter("c:\\temp\\funcionario_" + funcionario.getId() + ".xml");
			printWriter.write("<?xml version='1.0' encoding='ISO-8859-1'?>");

			printWriter.write("<Funcionario>\n");
			printWriter.write("<Id> " + funcionario.getId() + " </Id>");
			printWriter.write("<Nome> " + funcionario.getNome() + " </Nome>");
			printWriter.write("<Cpf> " + funcionario.getCpf() + " </Cpf>");
			printWriter.write("<Matricula> " + funcionario.getMatricula() + " </Matricula>");
			printWriter.write("<Salario> " + funcionario.getSalario() + " </Salario>");
			printWriter.write("<Setor> " + funcionario.getSetor().getNome()+ " </Setor>");
			printWriter.write("<Funcoes>\n");
			var i = 1;
			for (Funcao funcao : funcionario.getFuncoes()) {
			    printWriter.write("<Funcao>" +i+ " "+funcao.getFuncao()+" " +i+ "</Funcao>\n");
			    i++;
			}
			printWriter.write("</Funcoes>\n");
			
			printWriter.write("</Funcionario>\n");

			printWriter.close();

		} catch (Exception e) {

			System.out.println("Erro ao gravar XML do funcionario: " + e.getMessage());
		}

	}

}
