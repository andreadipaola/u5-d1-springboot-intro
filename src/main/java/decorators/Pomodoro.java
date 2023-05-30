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
public class Pomodoro extends Topping {

	public Pomodoro(Pizza pizza) {
		this.pizza = pizza;
		this.nomeTopping = "pomodoro";
		this.calorie = 50;
		this.prezzo = 0.50;
	}

	public Pomodoro() {
		this.nomeTopping = "pomodoro";
		this.calorie = 50;
		this.prezzo = 0.50;
	}

	@Override
	public String getNome() {
		return pizza.getNome() + "pomodoro ";
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
