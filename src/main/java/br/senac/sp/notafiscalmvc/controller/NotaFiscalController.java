/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author melo
 */
public class NotaFiscalController {

    public static boolean salvar(int numeroNota, String descricaodaNota, double valorNota) {

        NotaFiscal nota = new NotaFiscal();
        System.out.println("agora estou no controle");
        nota.setValNota(valorNota);
        nota.setDescricaoNota(descricaodaNota);
        nota.setNumNota(numeroNota);
        NotaFiscalDAO dao = new NotaFiscalDAO();
        dao.addNota(nota);
        return true;
    }

    public boolean getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
