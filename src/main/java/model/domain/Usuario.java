package model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    private String nome;
    @Column(name = "dt_nasc")
    private Date dtNasc;
    private String sexo;
    private String logradouro;
    private Integer numero;
    private String setor;
    private String cidade;
    private String uf; 


    public Usuario() {}

    public Usuario(String nome, Date dtNasc, String sexo, String logradouro, Integer numero, String setor, String cidade, String uf) {
    
        this.setNome(nome);
        this.dtNasc = dtNasc;
        this.sexo = sexo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.setor = setor;
        this.cidade = cidade;
        this.uf = uf;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}