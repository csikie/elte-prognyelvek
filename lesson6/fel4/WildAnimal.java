public enum WildAnimal {
    MONKEY("banan", 5),
    ELEPHANT("malna", 30),
    GIRAFFE("alma", 10),
    RACCON("mogyoro", 20);

    private final String food;
    private final int amount;

    WildAnimal(String food, int amount) {
        this.food = food;
        this.amount = amount;
    }

    public static String listAllAnimals() {
        StringBuilder sb = new StringBuilder();
        for (WildAnimal animal : WildAnimal.values()) {
            sb.append(animal.ordinal()).append(": ");
            sb.append(animal.name());
            sb.append(" szeretne enni ").append(animal.amount*7).append(" ");
            sb.append("egy héten.");
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    public String toString() {
        return "A(z) " + this.name() + " eszik " + this.amount + " " + this.food + " egy nap";
    }
}