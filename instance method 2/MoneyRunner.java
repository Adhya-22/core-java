class MoneyRunner
{
    public static void main(String[] args) 
	{
        Money money1 = new Money();
        money1.deposit();
        money1.withdraw();
        money1.transfer();
        money1.save();
        money1.spend();
        money1.invest();
        money1.donate();
        money1.checkBalance();
        money1.printReceipt();
        money1.calculateTax();
        money1.convertCurrency();
        money1.addInterest();
        money1.removeInterest();
        money1.freezeAccount();
        money1.activateAccount();

		Money money2 = new Money();
        money2.deposit();
        money2.withdraw();
        money2.transfer();
        money2.save();
        money2.spend();
        money2.invest();
        money2.donate();
        money2.checkBalance();
        money2.printReceipt();
        money2.calculateTax();
        money2.convertCurrency();
        money2.addInterest();
        money2.removeInterest();
        money2.freezeAccount();
        money2.activateAccount();

        
        Money.currencyName();
        Money.digitalPayment();
        Money.inflation();
        Money.globalUsage();
        Money.economicRole();
    }
}