/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model;
import java.io.*;
import java.util.*;
import javax.persistence.*;
/**
 *
 * @author 20221PF.CC0033
 */
@Entity
public class Professores extends Pessoas{
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataAdmissao;

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    @Override
    public String toString() {
        return this.getNome(); 
    }
    
}
