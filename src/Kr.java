public class Kr {

    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return title + " (" + author + ")";
        }
    }

    static class Reader {
        private String fullName;
        private String cardNumber;
        private String faculty;
        private String birthDate;
        private String phone;

        public Reader(String fullName, String cardNumber, String faculty,
                      String birthDate, String phone) {
            this.fullName = fullName;
            this.cardNumber = cardNumber;
            this.faculty = faculty;
            this.birthDate = birthDate;
            this.phone = phone;
        }

        public String getFullName() { return fullName; }
        public String getCardNumber() { return cardNumber; }
        public String getFaculty() { return faculty; }
        public String getBirthDate() { return birthDate; }
        public String getPhone() { return phone; }

        public void takeBook(int bookCount) {
            System.out.println(fullName + " взял " + bookCount + " книги");
        }

        public void takeBook(String... bookTitles) {
            StringBuilder books = new StringBuilder(" взял книги: ");
            for (int i = 0; i < bookTitles.length; i++) {
                books.append(bookTitles[i]);
                if (i < bookTitles.length - 1) {
                    books.append(", ");
                }
            }
            System.out.println(fullName + books);
        }

        public void takeBook(Book... books) {
            StringBuilder bookList = new StringBuilder(" взял книги: ");
            for (int i = 0; i < books.length; i++) {
                bookList.append(books[i]);
                if (i < books.length - 1) {
                    bookList.append(", ");
                }
            }
            System.out.println(fullName + bookList);
        }

        public void returnBook(int bookCount) {
            System.out.println(fullName + " вернул " + bookCount + " книги");
        }

        public void returnBook(String... bookTitles) {
            StringBuilder books = new StringBuilder(" вернул книги: ");
            for (int i = 0; i < bookTitles.length; i++) {
                books.append(bookTitles[i]);
                if (i < bookTitles.length - 1) {
                    books.append(", ");
                }
            }
            System.out.println(fullName + books);
        }

        public void returnBook(Book... books) {
            StringBuilder bookList = new StringBuilder(" вернул книги: ");
            for (int i = 0; i < books.length; i++) {
                bookList.append(books[i]);
                if (i < books.length - 1) {
                    bookList.append(", ");
                }
            }
            System.out.println(fullName + bookList);
        }
    }

    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Петров В. В.", "001", "Физический", "01.01.1990", "+7(999)123-45-67"),
                new Reader("Иванова А. Б.", "002", "Математический", "15.05.1995", "+7(999)987-65-43"),
                new Reader("Сидоров К. Д.", "003", "Филологический", "20.12.1985", "+7(999)555-44-33")
        };

        Reader petrov = readers[0];
        Reader ivanova = readers[1];

        petrov.takeBook(3);
        petrov.takeBook("Приключения", "Словарь", "Энциклопедия");
        Book book1 = new Book("Война и мир", "Л. Толстой");
        Book book2 = new Book("Мастер и Маргарита", "М. Булгаков");
        petrov.takeBook(book1, book2);

        ivanova.returnBook(2);
        ivanova.returnBook("Ромео и Джульетта", "Гамлет");
        ivanova.returnBook(new Book("Преступление и наказание", "Ф. Достоевский"));
    }
}
