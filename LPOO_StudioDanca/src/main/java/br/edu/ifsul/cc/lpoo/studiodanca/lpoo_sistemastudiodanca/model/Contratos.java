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
public class Contratos implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_contratos", sequenceName = "seq_contratos_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_contratos", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataInicio;
    
    @Column(nullable = false)
    private Double valorDesconto;
    
    @Column(nullable = false, precision = 10, scale = 2)
    @Enumerated(EnumType.STRING)
    private FormaPgto formapgto;
    
    @ManyToOne
    private Alunos aluno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public FormaPgto getFormapgto() {
        return formapgto;
    }

    public void setFormapgto(FormaPgto formapgto) {
        this.formapgto = formapgto;
    }
    
    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }
    
}
