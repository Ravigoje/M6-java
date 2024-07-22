abstract class RBI {
	 RBI()
	 {
	 	super();
	 }
	 abstract void rateOfInterest();
	 abstract void withdrawLimit();
	 abstract void depositLimit();
	}
	abstract class SBI extends RBI
	{
		String accountname;
		String accounttype;

		SBI(String accountname,String accounttype)
		{
			super();

			this.accountname = accountname;
			this.accounttype = accounttype;
		}

		void displayDeatils()
		{
			System.out.println("accountname : "+this.accountname);
			System.out.println("accounttype : "+this.accounttype);
		}
	}

	class saving extends SBI
	{
		saving(String accountname,String accounttype)
		{
		super(accountname,accounttype);
	    }
		void rateOfInterest()
		{
			System.out.println("Rate of Interest : saving account");
		}
		void withdrawLimit()
		{
			System.out.println("withdrawLimit is : 5000");
		}
		void depositLimit()
		{
			System.out.println("depositLimit : 50000");
		}
	}
	class current extends SBI
	{
		current(String accountname, String accounttype)
		{
			super(accountname, accounttype);
		}
		void rateOfInterest()
		{
			System.out.println("Rate of Interest : 7.5");
		}
		void withdrawLimit()
		{
			System.out.println("withdrawLimit :  200000");
		}
		void depositLimit()
		{
			System.out.println("depositLimit : 20000000");
		}
	}

	class Abstractmeth1
	{
		public static void main(String[] args) 
		{
		  saving obj = new saving("Ramesh","Svaing");
		  obj.displayDeatils();
		  obj.rateOfInterest();
		  obj.withdrawLimit();
		  obj.depositLimit();

		  current obj1 = new current("Suresh", "current");
		  obj.displayDeatils();
		  obj1.withdrawLimit();
		  obj1.rateOfInterest();
		  obj1.depositLimit();	
		}
	}