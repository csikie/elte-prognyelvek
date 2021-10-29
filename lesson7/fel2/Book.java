public class Book {
    static enum Genre {
        FANTASY, SATIRE, SCIFI, PHILOSOPHY, EDUCATIONAL;
    }

    private String author;
    private String title;
    private int reservePrice;
    private int id;
    private Genre genre;

    private static int lastId;
    public static void resetId() { lastId = 0; }
    public int getId() { return id; }

    private Book(String author, String title, Genre genre, int reservePrice) {
        this.author = author;
        this.title = title;
        this.reservePrice = reservePrice;
        this.genre = genre;

        id = lastId++;
    }

    public static Book make(String author, String title, String genreName, String reservePriceStr) {
        try {
            int reservePrice = Integer.parseInt(reservePriceStr);

            if (author == null || title == null || title.length() < 2 || reservePrice <= 0) {
                return null;
            }

            Genre genre = Genre.valueOf(genreName);

            int i = 0;
            while (i < title.length()) {
                char c = title.charAt(i);
                if (Character.isLetter(c) || Character.isDigit(c) || Character.isWhitespace(c)) {
                    i++;
                }
                else {
                    return null;
                }
            }
            return new Book(author, title, genre, reservePrice);
        }
        catch (NumberFormatException e) {
            return null;
        }
        catch (IllegalArgumentException e) {
            return null;
        }
    }
}