package arrays;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class NotasEscolaresListaBidimensionalExercício {

	public static void main(String[] args) {

		try {

			ArrayList<ArrayList<Float>> notasDosAlunos = new ArrayList<>();

			ArrayList<Float> linhaAluno = new ArrayList<>();
			ArrayList<Float> colunaDisciplina = new ArrayList<>();

			String entradaLinha = JOptionPane.showInputDialog("Digite a nota ou aperte em cancelar");
			String entradaColuna = JOptionPane.showInputDialog("Digite a nota ou aperte em cancelar");

			while (entradaLinha != null || entradaColuna != null) {
				float conversaoLinhaFloat = Float.parseFloat(entradaLinha);
				float conversaoColunaFloat = Float.parseFloat(entradaColuna);
				linhaAluno.add(conversaoLinhaFloat);
				colunaDisciplina.add(conversaoColunaFloat);

				entradaLinha = JOptionPane.showInputDialog("Digite a nota ou aperte em cancelar");
				entradaColuna = JOptionPane.showInputDialog("Digite a nota ou aperte em cancelar");
			}

			notasDosAlunos.addAll(Arrays.asList(linhaAluno, colunaDisciplina));

			for (int linha = 0; linha < notasDosAlunos.size(); linha++) {
				for (int coluna = linha; coluna < notasDosAlunos.size(); coluna++) {
					JOptionPane.showMessageDialog(null, notasDosAlunos.get(linha).get(coluna));
				}
			}
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Erro de conversão\n " + erro.toString(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		} catch (NullPointerException erro) {
			JOptionPane.showMessageDialog(null, "Tecla cancel precionada\n " + erro.toString(),
					"Cancelado pelo usuário", JOptionPane.ERROR_MESSAGE);
		}
	}
}
