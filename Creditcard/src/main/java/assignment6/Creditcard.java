package assignment6;
import java.util.logging.Logger;
class Details implements Cloneable{
    String name;
    String num;
    String exdate;
    Details(String n,String n1,String e){
        this.name=n;
        this.num=n1;
        this.exdate=e;
    }
    public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
}

public class Creditcard
{
	public static void main(String[] args) throws CloneNotSupportedException{
		Logger l = Logger.getLogger("com.api.jar");
		Details c = new Details("JANANI","35464246562","08-01-2024");
		Details c1 = new Details("KOKILA","7385657657","17-03-2023");
		Details c3 = (Details)c.clone();
		l.info(""+(c.num).equals(c1.num));
		l.info("Credit card Name : "+c3.name+"\nCredit card Number : "+c3.num+"\nExpired Date : "+c3.exdate);
	}
}
