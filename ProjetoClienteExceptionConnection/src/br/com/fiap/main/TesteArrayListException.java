package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.excecoes.Excecao;

public class TesteArrayListException {
	
	public static int inteiro(String mensagem) {
        String input = JOptionPane.showInputDialog(null, mensagem);
        return Integer.parseInt(input);
    }

    public static String texto(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }

    public static double real(String mensagem) {
        String input = JOptionPane.showInputDialog(null, mensagem);
        return Double.parseDouble(input);
    }
	public static void main(String[] args) throws Excecao {
		List<Cliente> listaC = new ArrayList<Cliente>();
		Cliente objC = null;
		
		do {
			try {
				objC = new Cliente();
				objC.setNome(texto("Nome"));
				objC.setIdade(inteiro("Idade"));
				objC.setAltura(real("Altura"));
				listaC.add(objC);
			}catch(Exception e) {
				throw new Excecao(e);
			}
		}while(JOptionPane.showConfirmDialog(null, "Adicionar outro cliente?", "Cadastro de Clientes",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0);
		
		for(Cliente c : listaC) {
			System.out.println("Nome: " + c.getNome() +
					"\nIdade: " + c.getIdade() +
					"\nAltura: " + c.getAltura());
		}
	}

}
