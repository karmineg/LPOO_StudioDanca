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
public class itensContrato implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_ItensContrato", sequenceName = "seq_ItensContrato_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_ItensContrato", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    private Contratos contrato;

    @ManyToOne
    private Pacotes pacote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contratos getContrato() {
        return contrato;
    }

    public void setContrato(Contratos contrato) {
        this.contrato = contrato;
    }

    public Pacotes getPacote() {
        return pacote;
    }

    public void setPacote(Pacotes pacote) {
        this.pacote = pacote;
    }
    
}
