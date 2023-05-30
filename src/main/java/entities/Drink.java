package entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Scope("prototype")
public class Drink extends Prodotto {

	public Drink(String nome, double prezzo, int calorie) {
		super(nome, prezzo, calorie);
	}

	@Override
	public String toString() {
		return nome + " prezzo: " + prezzo + ", calorie: " + calorie;
	}
}
