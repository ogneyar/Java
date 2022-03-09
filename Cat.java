public class Cat {

	private int weight; // вес кота
	private String name; // имя кота
	private String color; //окрас кота

	public static void main(String[] args) {
    }

	//кот ест
	public void eat(){
		System.out.print("Eating...\n");
	}

	//кот спит
	public void sleep(){
		System.out.print("Sleeping zz-z-z-z...\n");
	}

	//кот говорит
	public String speak(String words){ 
		String phrase = words + "...mauu...\n";
		return phrase;
	}

	//
	public int getWeight(){
		return this.weight;
	}

	//
	public String getName(){ 
		return this.name;
	}

	//
	public String getColor(){ 
		return this.color;
	}

}