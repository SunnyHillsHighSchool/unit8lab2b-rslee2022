public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
    int count = 0;
    for(String[] rowNames : nameArray)
    {
      for(String name : rowNames)
      {
        String[] splitName = name.split(", ");
        if(splitName[0].equals(lastName))
        {
          count++;
        }
      }
    }
    return count;
  }
}