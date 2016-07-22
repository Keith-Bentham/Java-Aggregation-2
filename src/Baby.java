public class Baby {

	private String name;
	private String gender;
	private Weight weight;

	public Baby(String n, String g, int p, int o) {

		name = n;
		gender = g;
		weight = new Weight(p, o);
	}

	public void print() {
		System.out.println("============");
		System.out.println("Baby Details");
		System.out.println("============");
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Weight: " + weight);
	}

	public void reset_Weight(int p, int o) {
		weight = new Weight(p, o);
	}
}