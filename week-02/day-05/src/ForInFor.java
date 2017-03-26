
import java.util.ArrayList;
import java.util.Scanner;


public class ForInFor {

  public static void main(String[] args) {

    ArrayList<Integer> listOne = Numberlist("first list element");
    ArrayList<Integer> listTwo = Numberlist("second list element");
    System.out.println(listOne);
    System.out.println(listTwo);

    String finalResult = SecondListIsInTheFirstOne(listOne, listTwo);
    System.out.println(finalResult);

//    ArrayList<Integer> togetherList = InsideBothLists(listOne, listOne);
//    System.out.printf(togetherList);
    InsideBothLists(listOne, listOne);


  }

  public static ArrayList<Integer> Numberlist(String lll) {
    ArrayList<Integer> ourlist = new ArrayList<>();
    do {
      System.out.print(lll);
      int numberToAdd = UserInput();
      if (numberToAdd == 999){return ourlist;};
      ourlist.add(numberToAdd);
//      System.out.println(ourlist);
    } while (ourlist.size() > 0);
    return ourlist;
  }

  public static int UserInput() {
    System.out.println("Please enter the number:");
    Scanner nubersIntput = new Scanner(System.in);
    int number = nubersIntput.nextInt();
    return number;
  }

  public static String SecondListIsInTheFirstOne (ArrayList<Integer> alist, ArrayList<Integer> blist){
    if (alist.containsAll(blist)){
      return "The fist list contains the second list";
    }
    return "The fist list does NOT contains the second list";
  }

  public static void InsideBothLists (ArrayList<Integer> alist, ArrayList<Integer> blist) {
    ArrayList<Integer> clist = new ArrayList<>();
    clist.addAll(alist);
    clist.addAll(blist);


    System.out.println(clist);


  }

}

//while (UserInput() != 0);

//        for(int i=0;i<5;i++){
//        int numberToAdd=UserInput();
//        ourlist.add(numberToAdd);
//        }