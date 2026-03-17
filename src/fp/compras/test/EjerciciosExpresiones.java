package fp.compras.test;
import fp.compras.Compra;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import fp.compras.Compra;

public class EjerciciosExpresiones {
	public static void main(String[] args) {
		Compra compra1 = new Compra("40961226C","Mercadona","Cadiz",LocalDateTime.of(2019, 2, 24, 05, 33),LocalDateTime.of(2019, 2, 24, 05, 57),8.65);
		Compra compra2 = new Compra("86302030G","Mercadona","Malaga",LocalDateTime.of(2019, 2, 24, 10, 01),LocalDateTime.of(2019, 2, 24, 10, 34),188.65);
		Compra compra3 = new Compra("37089432T","Mas","Granada",LocalDateTime.of(2019, 2, 24, 10, 9),LocalDateTime.of(2019, 2, 24, 12, 56),60.43);
		Compra compra4 = new Compra("97785005E","Mercadona","Malaga",LocalDateTime.of(2019, 2, 24, 13, 58),LocalDateTime.of(2019, 2, 24, 15, 48),17.43);
		
		if (compra1.getProvincia().equals("Malaga")&&compra1.getTotalCompra()>60) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if (compra3.getFechaSalida().isBefore(LocalDateTime.of(2019, 2, 28, 17, 35))) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		boolean ej3 = compra1.getSupermercado().equals("Mercadona")||compra3.getSupermercado().equals("Mercadona");
			System.out.println(ej3);
		
		boolean ej4 = compra2.getSupermercado().equals("Mercadona") && compra3.getSupermercado().equals("Mercadona");
			System.out.println(ej4);
		
		boolean ej5 = compra1.getFechaLlegada().getDayOfMonth() == (compra4.getFechaLlegada().getDayOfMonth()) && compra1.getFechaSalida().isBefore(compra4.getFechaSalida());
		System.out.println(ej5);
		
		boolean ej6 = (compra1.getTotalCompra()+compra2.getTotalCompra()+compra3.getTotalCompra()+compra4.getTotalCompra())/4 > 100;
		System.out.println(ej6);
		
		
		boolean ej7 = compra2.getFechaLlegada().getMonthValue() % 2 == 0;
		System.out.println(ej7);
		
		boolean ej8 = compra3.getFechaLlegada().toLocalTime().isAfter(LocalTime.of(15, 00)) && (compra3.getFechaSalida().toLocalTime().isBefore(LocalTime.of(21, 00)));
		System.out.println(ej8);
		
		boolean ej9 = compra4.getFechaLlegada().getDayOfWeek().equals(java.time.DayOfWeek.MONDAY);
		System.out.println(ej9);
		
		String dni = compra1.getDNI();
		char ej11 = dni.charAt(dni.length()-1);
		System.out.println(ej11);
		
		
		
		
		}
}
