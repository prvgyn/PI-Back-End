package com.ecomerce.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import java.sql.Date;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

// import com.ecomerce.enumerador.TipoCliente;
@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String cpfOuCnpj;
	// private TipoCliente tipo;
	private String telefone;
	// private Date dataNasc;
	private String senha;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos = new ArrayList<>();
	
	
	//Construtor Vazio
	public Cliente() {
	}
	
	//Construtor com todos os atributos
	public Cliente(Long id, String nome, String sobrenome, String email, String cpfOuCnpj, String telefone,
			String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.cpfOuCnpj = cpfOuCnpj;
		this.telefone = telefone;
		this.senha = senha;	
		}
		
	//Getters and Setters
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}
	
	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	
	// HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	// Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}