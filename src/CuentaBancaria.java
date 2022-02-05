public class CuentaBancaria {
    //Atributos de la Clase cuentaBancaria
    private int accountNumber;
    protected boolean activated;
    public String accountHolder;
    private int balance;
    public String Bank;


    //constructor vacío para la Clase CuentaBancaria
    public CuentaBancaria(){    };

    // Constructor para la Clase Cuenta Bancaria. 
    public CuentaBancaria(int accountNumber, 
                          boolean activated, 
                          String accountHolder, 
                          int balance, 
                          String bank) {
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.accountHolder = accountHolder;
        this.balance = balance;
        Bank = bank;
    }

    //Metodos Set y Get para los atributos de la Clase

    //metodo get para el atributo accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }
    //metodo set para el atributo accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //metodo get para el atributo accountNumber
    public boolean isActivated() {
        return activated;
    }
    //metodo set para el atributo activated
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

        //metodo get para el atributo accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }
    //metodo set para el atributo accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    //metodo get para el atributo balance
    public int getBalance() {
        return balance;
    }
    //metodo set para el atributo balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

    //metodo get para el atributo bank
    public String getBank() {
        return Bank;
    }
    //metodo set para el atributo bank
    public void setBank(String bank) {
        Bank = bank;
    }

    

    
    
}
