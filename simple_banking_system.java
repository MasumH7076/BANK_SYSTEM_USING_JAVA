import java.util.Scanner;

    abstract class bank
    {    
        public String Bank_Name="BANK OF INDIA";
        public String IFSC="BKID0004346";
        public String MICR="733013601";
        public String NAME="MASUM HOQUE";
        public String AC_NO="434610110003361";

        public void bankDetails()
        {
            System.out.println("BANK NAME: "+Bank_Name);
            System.out.println("IFSC CODE: "+IFSC);
            System.out.println("MICR CODE: "+MICR);
            System.out.println("ACCOUNT HOLDER NAME: "+NAME);
            System.out.println("ACCOUNT NUMBER: "+AC_NO);
        }
        abstract void Deposite();
        abstract void withdraw();
        abstract void checkBalance();
    }
    class bankService extends bank
    {
      private double bal=5000.55;
      private int pwd;
      public Double money;

      public void Deposite()
      {
        System.out.println("Enter your password: ");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==1234)
        {
            System.out.println("Enter your Deposite money: ");
            money=s.nextDouble();
            bal=bal+money;

            System.out.println("Deposite money: "+money);
            System.out.println("Total Balance: "+bal);
        }
        else
        {
            System.out.println("Sorry incorrect password...pls provided correct password");
        }
      }
      public void withdraw()
      {
        System.out.println("Enter your password: ");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==1234)
        {
            System.out.println("Enter your withdraw money: ");
            money=s.nextDouble();
            if(money>5000.55)
            {
                System.out.println("Sorry, your account does not have enough balance...so pls check your account balance");
            }
           // money=s.nextDouble();
            bal=bal-money;
             if(money<5000.55)
             {
            System.out.println("withdraw money: "+money);
            System.out.println("Total Balance: "+bal);
             }
        }
        else
        {
            System.out.println("Sorry incorrect password...pls provided correct password");
        }
      }
      public void checkBalance()
      {
        System.out.println("Enter your password: ");
        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();
        if(pwd==1234)
        {
            System.out.println("Total Balance: "+bal);
        }
        else
        {
            System.out.println("Sorry incorrect password...pls provided correct password");
        }
      }
    }
    class simple_banking_system
    {
        public static void main(String[] args){
            bankService b=new bankService();
            b.bankDetails();
            int ch;
             
            System.out.println(" 1.Deposite ");
            System.out.println(" 2.Withdraw ");
            System.out.println(" 3.Checkbalance ");

            System.out.println("Enter your choice: ");
            Scanner s2=new Scanner(System.in);
            ch=s2.nextInt();

            switch(ch)
            {
                case 1: b.Deposite();
                break;
                case 2: b.withdraw();
                break;
                case 3: b.checkBalance();
                break;

                default: System.out.println("Sorry Invalid choice...");
            }
        }
    }
