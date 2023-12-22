import java.util.Hashtable;

class TabSimb {
	
  private Hashtable<String, Integer> map =
		  new Hashtable<String, Integer>();

  private int contVar = 0;
  
  private int contLabel = 0;
  
  public void addSymbol(String s) { map.put(s, contVar); ++contVar; }
  
  public void addSymbol(String s, int tam) { map.put(s, contVar); contVar += tam; }
  
  public int getSymbol(String s) {
    Integer r = map.get(s); if (r == null) return -1; else return r; }

  public int getSize() { return contVar; }
  
  public String genLabel() { ++contLabel; return "L" + contLabel; }
}
