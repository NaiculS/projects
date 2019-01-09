import java.util.HashMap;
/*
Allows you to store books in a sort of library list, once you finish one you just mark it as true in the HashMap. Running will print out all books marked as true.
*/
public class Library{
  public Library(){
    
  }
  
  public void getFinishedBooks(HashMap<String, Boolean> library){
    if(library.size()<1){
      System.out.println("You need to input books!");
    }
    else{
      for (String book : library.keySet()){
        if (library.get(book)== true){
          System.out.println(book);
        }
      }
    }
  }
  
  public static void main(String[] args){
    HashMap<String, Boolean> myBooks = new HashMap <String, Boolean>();
    
    myBooks.put("Road Down the Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3d Food Printing", false);
    
    Library myLibrary = new Library();
      myLibrary.getFinishedBooks(myBooks);
  }
  
}
