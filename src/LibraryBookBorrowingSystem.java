import java.util.ArrayList;

public class LibraryBookBorrowingSystem
{
    public static void main (String[] args)
    {
      /*
          This is a console + scanner-based program all in one file
          1. Stores a list of available books (at least 5)
          2. A user is able to borrow a book:
            - If the book exists - it is removed from the available list and this is confirmed.
            - If the book doesn't exist - an error message is printed
          3. A user is able to return a book:
            - It is added to the available list
          4. The user gets a menu:
            - Shows available books
            - Borrow a book
            - Return a book
            - Exit
          5. They can keep interacting until they choose exit

     */

      printWelcomeMessage();
      printMenuAndAskForOption();

      ArrayList<String> books = new ArrayList<String>();
      books.add("Harry Potter");
      books.add("Lord of the Rings");
      books.add("The Hobbit");
      books.add("Pride and Prejudice");
      books.add("To Kill a Mockingbird");
      books.add("Pride and Prejudice");
      books.add("Pride and Prejudice");


      chooseOption(books, 1);    //show available
      chooseOption(books, 2);       //borrow
      chooseOption(books, 3);       //return
      chooseOption(books, 4);       //exit
      chooseOption(books, 5);       //invalid input

      //borrow a book that doesn't exist in the library
      borrow("Wuthering Heights", books);

    }

    private static void chooseOption(ArrayList<String> books, int userOption)
    {
        int option = userOption;
        if(option == 1)
        {
            System.out.println(" " + option + "\n" + "");
            showAvailable(books);
            printMenuAndAskForOption();
        }
        else if(option == 2)
        {
          System.out.println(" " + option + "\n" + "");
          borrow("Pride and Prejudice", books);
          printMenuAndAskForOption();
        }
        else if(option == 3)
        {
            System.out.println(" " + option + "\n" + "");
            returnBook(books, "Pride and Prejudice");
            printMenuAndAskForOption();
        }
        else if(option == 4)
        {
            System.out.println(" " + option + "\n" + "");
            printGoodBye();
        }
        else
        {
            System.out.println(" " + option + "\n" + "");
            System.out.println("Please pick an option from 1 - 4");
        }
    }

    private static void printWelcomeMessage()
    {
        System.out.println(" \n" + "=== Welcome to the Library System === \n" 
                                 + "\n");
    }

    private static void printMenuAndAskForOption()
    {
        System.out.println("Menu: \n" + "1. Show available books \n"
                                      + "2. Borrow a book \n"
                                      + "3. Return a book \n"
                                      + "4. Exit \n");
        System.out.print("Choose an option: ");
    }

    private static void printNotAvailable(String unavailableBook)
    {
        System.out.println("Sorry, " + unavailableBook + " is not available");
    }

    private static void printReturnMessage(String bookName)
    {
        System.out.print("Enter the name of the book you want to return: ");

        String nameOfBook = "Pride and Prejudice";
        System.out.println(nameOfBook);
        System.out.println("You have returned: " + nameOfBook);
    }
    
    private static void printGoodBye()
    {
        System.out.println(" \n" + "Goodbye! Thank you for using the library system"
                                 + " \n");
    }


    private static void showAvailable(ArrayList<String> books)
    {
        System.out.println("Available books: \n" + "");
        for(int index = 0; index < books.size(); index++)  //traverse the ArrayList of books
        {
            System.out.println(books.get(index));  //print each book
        }
        System.out.println("");  //cosmetic
    }

    private static void borrow(String bookName, ArrayList<String> books)
    {
        // To borrow a book you need to:
          // 1 - check it's available
          // 2 - remove it - Also confirm to the user that it has been borrowed


        String nameOfBookToBorrow = bookName;
        System.out.print("Enter the name of the book you want to borrow: ");
        System.out.println(nameOfBookToBorrow);
         showAvailable(books);
        if(isBookPresent(books, nameOfBookToBorrow))
        {
            System.out.println("You have borrowed " + nameOfBookToBorrow);
            removeBook(books, nameOfBookToBorrow);
            showAvailable(books);
        }
        else
        {
            printNotAvailable(bookName);
        }
    }

    private static boolean isBookPresent(ArrayList<String> books, String inputName)
    {
        System.out.println("");
        String bookName = inputName;

       for(int index = 0; index < books.size(); index++)
        {
            if(bookName.equals(books.get(index)))
            {
                System.out.println("Found it!");
                return true;
            }
        }
        return false;
    }

    private static void removeBook(ArrayList<String> books, String bookToRemove)
    {
        String nameOfBook = bookToRemove;
        books.remove(String.valueOf(nameOfBook));  // remove the first occurrence of this book
    }

    private static void returnBook (ArrayList<String> books, String bookToReturn)
    {
        String nameOfBook = bookToReturn;
        printReturnMessage(nameOfBook);
        books.add(nameOfBook);
        showAvailable(books);
    }

}