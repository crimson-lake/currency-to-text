package pl.zielinska.numbers.languages;

import java.util.HashMap;

public class American extends English{
	
	public American() {
		super();
		
		currency = new HashMap<>();
		currency.put("singular", "dollar");
		currency.put("plural", "dollars");
		currency.put("genitiveCase", "dollars");

		billions = new HashMap<>();
		billions.put("singular", "billion ");
		billions.put("plural", "billions ");
		billions.put("genitiveCase", "billions ");

		trillions = new HashMap<>();
		trillions.put("singular", "trillion ");
		trillions.put("plural", "trillions ");
		trillions.put("genitiveCase", "trillions ");

		quadrillions = new HashMap<>();
		quadrillions.put("singular", "quadrillion ");
		quadrillions.put("plural", "quadrillions ");
		quadrillions.put("genitiveCase", "quadrillions ");

		sextillions = new HashMap<>();
		sextillions.put("singular", "sextillion ");
		sextillions.put("plural", "sextillions ");
		sextillions.put("genitiveCase", "sextillions ");

		cardinalNumbers = new HashMap<>();
		cardinalNumbers.put(1_000L, thousands);
		cardinalNumbers.put(1_000_000L, millions);
		cardinalNumbers.put(1_000_000_000L, billions);
		cardinalNumbers.put(1_000_000_000_000L, trillions);
		cardinalNumbers.put(1_000_000_000_000_000L, quadrillions);
		cardinalNumbers.put(1_000_000_000_000_000_000L, sextillions);

		positions = new HashMap<>();
		positions.put(1, hundreds);
		positions.put(2, tens);
		positions.put(3, units);
	}
	
}
