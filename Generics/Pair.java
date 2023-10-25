import java.util.Date;
import java.util.Objects;
class Pair<K,V> 
{
    private K key;
    private V value;   
    public Pair(K key, V value){
        if (key instanceof String && value instanceof String)//Condition-a
        {
            this.key=key; 
            this.value=value;
        }
        else if(key instanceof String && value instanceof Date)//COndition b
        {
            this.key=key; 
            this.value=value;
        }
        else
        {
            throw new IllegalArgumentException("Key and value must be of type String or Date.");
        }
       
    }
    public K getKey() {
        return key;
      }
    public V getValue() {
        return value;
      }
    public void setKey()
    {
      if (key instanceof String){
         this.key=key;
      }
      else {
        throw new IllegalArgumentException("Key must be of type String.");
      }
    }
    public void setValue()
    {
      if (value instanceof String || value instanceof Date){
         this.value=value;
      }
      else {
        throw new IllegalArgumentException("Key must be of type String.");
      }
    }
@Override
  public String toString() {
    return "(" + key + ", " + value + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Pair<?, ?> other = (Pair<?, ?>) obj;
    return key.equals(other.key) && value.equals(other.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  
    public static void main(String[] args)
    {
        Pair<String, String> stringPair = new Pair<>("key", "value");
        Pair<String, Date> datePair = new Pair<>("key", new Date());
        System.out.println(stringPair);
        System.out.println(datePair);
    }
}
