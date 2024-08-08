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
public class Pagamentos implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_pagamentos", sequenceName = "seq_pagamentos_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pagamentos", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataVcto;
    
    @Column(nullable = false, precision = 10, scale = 2)
    private Double valor;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataPgto;
    
    @Column(nullable = false, precision = 10, scale = 2)
    private Double valorPgto;
    
    @ManyToOne
    private Contratos contratos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataVcto() {
        return dataVcto;
    }

    public void setDataVcto(Calendar dataVcto) {
        this.dataVcto = dataVcto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Calendar getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Calendar dataPgto) {
        this.dataPgto = dataPgto;
    }

    public Double getValorPgto() {
        return valorPgto;
    }

    public void setValorPgto(Double valorPgto) {
        this.valorPgto = valorPgto;
    }
    
    public Contratos getContratos() {
        return contratos;
    }

    public void setContratos(Contratos contratos) {
        this.contratos = contratos;
    }
    
    public void gerarPagamento(int Integer) {
        double valorBase = this.contratos.getValorDesconto();

        this.valorPgto = valorBase;

        this.dataVcto = Calendar.getInstance();
        this.dataVcto.set(Calendar.MONTH, Integer);
        this.dataVcto.set(Calendar.DAY_OF_MONTH, this.dataVcto.getActualMaximum(Calendar.DAY_OF_MONTH));

        this.dataPgto = Calendar.getInstance();
        this.valor = valorBase;
    }
}
