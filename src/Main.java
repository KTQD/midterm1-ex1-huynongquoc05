public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("Hay Trao Cho Anh", "A best song", "123", 100f, 240);
        Book book = new Book("Dragon Ball", "Manga", "456", 30.01f, "Author Name", 300, "Fiction");

        System.out.println("Information of MP3:");
        mp3.showInfo();

        System.out.println("\nInformation of Book:");
        book.showInfo();
    }
}
