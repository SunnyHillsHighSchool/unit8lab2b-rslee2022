class Main {
  public static void main(String[] args) {
    String[][] instructors = {{"Abarca, Josue","Agredano,Magaly", "Alessi, Tyler"},{"Baker,Craig","Barsamian, Aram", "Bove, Gina"}, {"Smith, Arnetta", "Smith, Benjamen","Smith, Charmaine"}, {"Koci, Kenneth", "Allen, Donald", "Nguyen, Sue"}};
     ProfNames names = new ProfNames();
    System.out.println("The number of instructors that have the last name of Smith is "+ names.countNames(instructors,"Smith"));
  }
}
//output should be
//The number of instructors that have the last name of Smith is 3