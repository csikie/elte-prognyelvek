public class PrintedBook extends Book {
    private CoverType coverType;

    public PrintedBook() {
        super();
        this.coverType = CoverType.Hardcover;
        super.pages += 6;
    }

    public PrintedBook(String author, String title, int pages, CoverType coverType) {
        super(author, title, pages + 6);
        this.coverType = coverType;
    }

    @Override
    public int getPrice() {
        if (coverType == CoverType.Softcover) {
            return pages * 2;
        } else {
            return pages * 3;
        }
    }

    @Override
    public String toString() {
        if (coverType == CoverType.Softcover) {
            return super.toString() + " (softcover)";
        } else {
            return super.toString() + " (hardcover)";
        }
    }

    @Override
    public String createReference(String article, int from, int to) {
        return super.toString() + " [" + from + "-" + to + "] referenced in article: " + article;
    }
}