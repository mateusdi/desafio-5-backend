package br.com.banco.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.com.banco.enums.Tipo;

@Entity
public class Transferencia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Timestamp dataTransferencia;
	private Double valor;
	
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	private String nomeOperadorTransacao;
	
	@ManyToOne
	@JoinColumn(name="conta_id", referencedColumnName = "idConta")
	@JsonBackReference
	private Conta conta;
	
	public Transferencia() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getDataTransferencia() {
		return dataTransferencia;
	}

	public void setDataTransferencia(Timestamp dataTransferencia) {
		this.dataTransferencia = dataTransferencia;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNomeOperadorTransacao() {
		return nomeOperadorTransacao;
	}

	public void setNomeOperadorTransacao(String nomeOperadorTransacao) {
		this.nomeOperadorTransacao = nomeOperadorTransacao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", dataTransferencia=" + dataTransferencia + ", valor=" + valor + ", tipo="
				+ tipo + ", nomeOperadorTransacao=" + nomeOperadorTransacao + ", conta=" + conta + "]";
	}


	

}
