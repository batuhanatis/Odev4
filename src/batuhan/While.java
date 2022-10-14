package batuhan;

public class While {

	public static void main(String[] args) {
	int fact=1;
	int multiplier=1;
	while (multiplier <10) {
		fact=fact*multiplier;
		System.out.println(multiplier + "faktöriyel = " + fact);
		multiplier++;
	}
	}

}
