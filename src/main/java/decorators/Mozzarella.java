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
public class Mozzarella extends Topping {

	public Mozzarella(Pizza pizza) {
		this.pizza = pizza;
		this.nomeTopping = "mozzarella";
		this.calorie = 100;
		this.prezzo = 0.50;
	}

	public Mozzarella() {
		this.nomeTopping = "mozzarella";
		this.calorie = 100;
		this.prezzo = 0.50;
	}

	@Override
	public String getNome() {
		return pizza.getNome() + "mozzarella ";
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
