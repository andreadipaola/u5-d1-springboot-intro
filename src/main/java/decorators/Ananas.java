package decorators;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import entities.Pizza;
import entities.Topping;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@Scope("prototype")
public class Ananas extends Topping {

	public Ananas(Pizza pizza) {
		this.pizza = pizza;
		this.nomeTopping = "ananas";
		this.calorie = 2000;
		this.prezzo = 10;
	}

	public Ananas() {
		this.nomeTopping = "ananas";
		this.calorie = 2000;
		this.prezzo = 10;
	}

	@Override
	public String getNome() {
		return pizza.getNome() + "ananas ";
	}

	@Override
	public double getPrezzo() {
		return pizza.getPrezzo() + prezzo;
	}

	@Override
	public int getCalorie() {
		return pizza.getCalorie() + calorie;
	}

	@Override
	public String toString() {
		return nomeTopping + ", prezzo: " + prezzo + ", calorie: " + calorie;
	}

}
