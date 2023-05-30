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
public class Prosciutto extends Topping {

	public Prosciutto(Pizza pizza) {
		this.pizza = pizza;
		this.nomeTopping = "prosciutto";
		this.calorie = 200;
		this.prezzo = 0.90;
	}

	public Prosciutto() {
		this.nomeTopping = "prosciutto";
		this.calorie = 200;
		this.prezzo = 0.90;
	}

	@Override
	public String getNome() {
		return pizza.getNome() + "prosciutto ";
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
		return nomeTopping + " prezzo: " + prezzo + ", calorie: " + calorie;
	}

}
