package esercizio_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import decorators.Ananas;
import decorators.Mozzarella;
import decorators.Pomodoro;
import decorators.Prosciutto;
import entities.ArticoloBrandizzato;
import entities.Drink;
import entities.Pizza;
import entities.Topping;
import esercizio_1.U5D1SpringbootIntroApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(U5D1SpringbootIntroApplication.class, args);
		log.info("It's me!! Mario");
		menu();
	}

	public static void menu() {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		Pizza pizza = (Pizza) new Pizza();

		Pizza margherita = new Pomodoro(new Mozzarella(pizza));
		Pizza crudoEMozzarella = new Pomodoro(new Mozzarella(new Prosciutto(pizza)));
		Pizza hawaiiana = new Pomodoro(new Mozzarella(new Prosciutto(new Ananas(pizza))));

		Topping t1 = new Ananas();
		Topping t2 = new Mozzarella();
		Topping t3 = new Pomodoro();
		Topping t4 = new Prosciutto();

		Drink d1 = new Drink("CocaCola", 2.50, 250);
		Drink d2 = new Drink("Fanta", 2.50, 300);
		Drink d3 = new Drink("Acqua Naturale", 2, 0);
		Drink d4 = new Drink("Birra alla spina", 3, 125);

		ArticoloBrandizzato a1 = new ArticoloBrandizzato("Cappellino", 10);
		ArticoloBrandizzato a2 = new ArticoloBrandizzato("T-Shirt", 20);
		ArticoloBrandizzato a3 = new ArticoloBrandizzato("Portachiavi", 5);

		System.out.printf("%nMENU%n");

		System.out.printf("%n%nLE NOSTRE PIZZE:%n");

		System.out.println("Margherita: " + margherita.getNome() + ", prezzo: €" + margherita.getPrezzo()
				+ ", calorie: " + margherita.getCalorie());

		System.out.println("Prosciutto Crudo e Mozzarella: " + crudoEMozzarella.getNome() + ", prezzo: €"
				+ crudoEMozzarella.getPrezzo() + " | calorie: " + crudoEMozzarella.getCalorie());
		System.out.println("Hawaiiana: " + hawaiiana.getNome() + ", prezzo: €" + hawaiiana.getPrezzo() + ", calorie: "
				+ hawaiiana.getCalorie());

		System.out.printf("%n%nCOMPONI LA TUA PIZZA AGGIUNGENDO GLI EXTRA CHE PREFERISCI:%n");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);

		System.out.printf("%n%nLE NOSTRE BEVENDE:%n");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

		System.out.printf("%n%nI NOSTRI GADGETS:%n");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		ctx.close();
	}

}
