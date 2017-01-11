package net.rodrigobrito.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contato {
	
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private String telefone;
	
	public Contato() { }
	
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", telefone=" + telefone + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (this.getClass() != obj.getClass()){
			return false;
		}
		Contato contato = (Contato) obj;
		return this.getId() == contato.getId() &&
				this.getNome() == contato.getNome() &&
				this.getTelefone() == contato.getTelefone();
	}
}
