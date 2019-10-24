/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

/**
 *
 * @author MELO
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas
 */
public class NotaFiscalTable extends AbstractTableModel {
    private String[] columnNames = {" NumNota "," descricaoNota "," ValNota "};

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        //implementado
        return NotaFiscalDAO.conta();
         
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        //implementado
        NotaFiscal nota;
        nota = NotaFiscalDAO.linha(row);
        if (col==0)
            return nota.getNumNota();
        if (col==1)
        return nota.getDescricaoNota();
        
        return nota.getValNota();
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}