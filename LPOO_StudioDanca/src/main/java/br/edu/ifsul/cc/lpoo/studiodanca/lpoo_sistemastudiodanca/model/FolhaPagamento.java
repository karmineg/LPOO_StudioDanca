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
public class FolhaPagamento implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_modalidade", sequenceName = "seq_modalidade_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_modalidade", strategy = GenerationType.SEQUENCE) 
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataPgto;
    
    @Column(nullable = false, precision = 10, scale = 2)
    private Double valorReceber;
    
    @ManyToOne
    private Professores professor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Calendar getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Calendar dataPgto) {
        this.dataPgto = dataPgto;
    }

    public Double getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(Double valorReceber) {
        this.valorReceber = valorReceber;
    }
    
    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public void calcularFolhaMes() {
        double salarioBase = 3000.00;
        double bonus = 200.00;
        double descontos = 100.00;

        this.valorReceber = salarioBase + bonus - descontos;

        this.dataPgto = Calendar.getInstance();
    }
    
}
