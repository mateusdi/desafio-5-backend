package br.com.banco.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Conta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idConta;
	private String nomeResponsavel;
	
	@OneToMany(mappedBy = "conta", cascade= CascadeType.ALL)
	@JsonManagedReference
	private List<Transferencia> transferencias = new ArrayList<>();
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public List<Transferencia> getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

	@Override
	public String toString() {
		return "Conta [idConta=" + idConta + ", nomeResponsavel=" + nomeResponsavel + ", transferencias="
				+ transferencias + "]";
	}


	
	

}
