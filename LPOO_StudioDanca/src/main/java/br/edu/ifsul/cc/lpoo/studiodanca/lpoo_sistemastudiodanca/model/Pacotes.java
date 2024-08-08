/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studiodanca.lpoo_sistemastudiodanca.model;
import java.io.*;
import javax.persistence.*;
/**
 *
 * @author 20221PF.CC0033
 */
@Entity
public class Pacotes implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_pacotes", sequenceName = "seq_pacotes_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pacotes", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = true, length = 120)
    private String descricao;
    
    @Column(nullable = false, precision = 10, scale = 2)
    private Double valor;
    
    @ManyToOne
    private Modalidade modalidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
    
}
