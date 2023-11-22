package model;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class tabelaPessoas extends AbstractTableModel{

	private ArrayList<pessoas> lista;
	private String[] colunas ={"Nome", "CPF ", "Telefone","Idade","Peso","Altura" };

	public tabelaPessoas(ArrayList<pessoas> lista) {
		this.lista=lista;
	}

	@Override
	public int getRowCount() {
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		pessoas p = lista.get(rowIndex);
		if(columnIndex == 0) {
			return p.getNome();
		} else if(columnIndex == 1) {
			return p.getCpf();
		} else if(columnIndex == 2) {
			return p.getTelefone();
		} else if(columnIndex == 3) {
			return p.getIdade();
		} else if(columnIndex == 4) {
			return p.getPeso();
		} else if(columnIndex == 5) {
			return p.getAltura();
		}

		return null;
	}

	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}


}
