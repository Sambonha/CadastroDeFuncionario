package repositories;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import entities.Funcionario;
import interfaces.FuncionarioRepository;

public class FuncionarioRepositoryJsonImpl implements FuncionarioRepository {

	public void exportar(Funcionario funcionario) {

		try {
			var arquivo = "c:\\temp\\funcionario_" + funcionario.getId() + ".json";

			var objectMapper = new ObjectMapper();

			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

			objectMapper.writeValue(new File(arquivo), funcionario);

		} catch (Exception e) {
			System.out.println("\nErro ao gravar arquivo JSON: " + e.getMessage());
		}
	}

}
