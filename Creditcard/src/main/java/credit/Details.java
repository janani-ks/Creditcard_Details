package credit;

class Details implements Cloneable{
    String name;
    long num;
    String exdate;
    Details(String n,long n1,String e){
        this.name=n;
        this.num=n1;
        this.exdate=e;
    }
    static boolean equals(Details obj,Details obj1) {
    	boolean b;
    	if(obj.num == obj1.num)
    		b = true;
    	else
    		b = false;
    	return b;
    }
    public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
    static Details cloneobj()throws CloneNotSupportedException{
		Creditcard.display.println("Enter the new Credit card Details :");
		Creditcard.display.print("Name = ");
		String name = Creditcard.scan.nextLine();
		Creditcard.display.print("Card Number = ");
		long number = Creditcard.scan1.nextLong();
		Creditcard.display.print("Expiry Date = ");
		String date = Creditcard.scan.nextLine();
		Details obj = new Details(name,number,date);
		return (Details)obj.clone();
	}
}