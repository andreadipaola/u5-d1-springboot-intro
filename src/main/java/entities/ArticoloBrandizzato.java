package entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Scope("prototype")
public class ArticoloBrandizzato extends Prodotto {
	public ArticoloBrandizzato(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return nome + " , prezzo: " + prezzo;
	}
}
