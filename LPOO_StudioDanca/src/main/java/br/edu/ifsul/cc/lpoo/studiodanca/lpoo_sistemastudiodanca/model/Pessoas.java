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
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoas implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_pessoas", sequenceName = "seq_pessoas_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pessoas", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = true, length = 50)
    private String nome;
    
    @Column(nullable = true, length = 15)
    private String fone;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataAniver;
    
    @Column(nullable = true, length = 100)
    private String email;
    
    @Column(nullable = true, length = 100)
    private String endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Calendar getDataAniver() {
        return dataAniver;
    }

    public void setDataAniver(Calendar dataAniver) {
        this.dataAniver = dataAniver;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
