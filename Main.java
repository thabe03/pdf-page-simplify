import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    String txt = "74-75,90-103,107-119,122-128,158-170,172-175,193-218,222-258";
    String[] tmp = txt.split(",");
    for (int j = 0; j < tmp.length; j++) {
      if (tmp[j].contains("-")) {
        String[] aTxt = tmp[j].split("-");
        int start = Integer.parseInt(aTxt[0]);
        int end = Integer.parseInt(aTxt[1]);
        for (int i = start; i <= end; i++)
          al.add(i);
      } else if (!tmp[j].contains("-")) {
        al.add(Integer.parseInt(tmp[j]));
      }
    }
    for (int i = 0; i < al.size(); i++)
      System.out.printf("%d, ",al.get(i));
  }
}