package com.pluralsight;


import java.util.Scanner;

public class NeighborhoodLibrary {

    private static Book[] books = new Book[10];

    private static int numOfBooks = 5;

    public static void main(String[] args) {

        books[0] = new Book(1234,"123-45","Dune", false, "" );
        books[1] = new Book(4231,"456-78","McBeth", false, "" );
        books[2] = new Book(2121,"890-12","Moby Dick", false, "" );
        books[3] = new Book(8965,"345-67","Holes", false, "" );
        books[4] = new Book(5462,"912-23","Roots", false, "" );

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nWelcome! ");
            System.out.println("Type 1 to Show available books: ");
            System.out.println("Type 2 to Show checked out books: ");
            System.out.println("Type 3 to Exit: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch(command){
                case 1:
                    System.out.println("\nBook Inventory: ");
                    for (int i = 0; i < numOfBooks ; i++){
                        if (!books[i].isCheckedOut()) {
                            System.out.println(books[i]);
                        }
                    }
                    System.out.println("\nTo checkout enter book ID or type 0 to return:");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();

                    if (bookId == 0) break;
                    boolean bookAvailable = false;
                    for (int i =0; i < numOfBooks; i++){
                        if (books[i].getId() == bookId && !books[i].isCheckedOut()){
                            System.out.println("Please enter your name: ");
                            String myName = scanner.nextLine();;
                            books[i].checkOut(myName);
                            System.out.println("Book checked out!");
                            bookAvailable = true;
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Checked out Books: ");
                    for (int i = 0; i < numOfBooks; i++) {
                        if (books[i].isCheckedOut()) {
                            System.out.println(books[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!: ");
                    return;

                default:
                    System.out.println("Invalid choice , Please select choice 1-3 ");


            }

        }


    }

    private static void findBooksByName (Scanner scanner){
        System.out.println("Enter book title: ");
        String title = scanner.nextLine();




    }


}

