

class CustomerDetails 
{
String cId,cName,cDob;
void getCDetails() 
{
System.out.println("Customer's   Id: "+ cId);
System.out.println("Customer's Name: "+ cName);
System.out.println("Customer's  DOB: "+cDob+ "\n");
}
}

class CustomerAddress 
{
String cHNo,cStreetName,cCity,cDist,cState,cCountry;
int cPinCode;
void getCAddress()
{
System.out.println("Customer's    House no: "+cHNo);
System.out.println("Customer's Street Name: "+cStreetName);
System.out.println("Customer's        City: "+cCity);
System.out.println("Customer's     Pincode: "+cPinCode);
System.out.println("Customer's    District: "+cDist);
System.out.println("Customer's       State: "+cState);
System.out.println("Customer's     Country: "+cCountry+ "\n");
}
}

class CustomerContact
{
long cMobileNo;
String cMailId;
void getCContact()
{
System.out.println("Customer's  Phone No: "+cMobileNo);
System.out.println("Customer's   Mail Id: "+cMailId+ "\n");
}
}

class CAccountDetails
{
long cAccNo;
String cAccType,cAccStatus,cAccActivDate;
float cAccBal;
void getCAccountDetails()
{
System.out.println("Customer's              Account No: "+cAccNo);
System.out.println("Customer's            Account Type: "+cAccType);
System.out.println("Customer's          Account Status: "+cAccStatus);
System.out.println("Customer's Account Activation Date: "+cAccActivDate);
System.out.println("Customer's         Account Balance: "+cAccBal+ "\n");
}
}

class CustomerDocuments
{
String cPanNo;
long cAadhaarNo,cDebitCardNo,cCreditCardNo;
void getCDocDetails()
{  
System.out.println("Customer's         PAN No: "+cPanNo);
System.out.println("Customer's     AADHAAR No: "+cAadhaarNo);
System.out.println("Customer's  Debit Card No: "+cDebitCardNo);
System.out.println("Customer's Credit Card No: "+cCreditCardNo+ "\n");
}
}

class CustomerTransactions
{
float cAmtWithd,cAmtDeposit;
String cAmtWithddate, cAmtDepodate;
void getCTransDetails()
{
System.out.println("Customer's     Amount Withdrawn : "+cAmtWithd);
System.out.println("Customer's Amount Withdrawn Date: "+cAmtWithddate);
System.out.println("Customer's      Amount Deposited: "+cAmtDeposit);
System.out.println("Customer's Amount Deposited Date: "+cAmtDepodate+ "\n");
}
}

class CBanksDetails
{
String cBankName, cBankBranchName, cBankIFSC, cBankEmail;
long cBankPhone;
void getCBanksDetails()
{
System.out.println("Customer's        Bank Name: "+cBankName);
System.out.println("Customer's Bank Branch Name: "+cBankBranchName);
System.out.println("Customer's   Bank IFSC code: "+cBankIFSC);
System.out.println("Customer's     Bank's Email: "+cBankEmail);
System.out.println("Customer's   Bank's PhoneNo: "+cBankPhone+ "\n");
}
}

class BankCustomerMainClass
{
public static void main (String args[])
{
CustomerDetails cd = new CustomerDetails();
CustomerAddress ca = new CustomerAddress();
CustomerContact cc = new CustomerContact();
CAccountDetails cad = new CAccountDetails();
CustomerDocuments cdd = new CustomerDocuments();
CustomerTransactions ct = new CustomerTransactions();
CBanksDetails cbd= new CBanksDetails();

cd. cId = "SB78654";
cd. cName = "Harry";
cd. cDob = "29/02/1996";
cd.getCDetails();

ca.cHNo = "69J";
ca.cStreetName ="subhash marg";
ca.cCity="Jay nagar";
ca.cDist="Hyderabad";
ca.cState="Telangana";
ca.cCountry="India";
ca.cPinCode=564323;
ca.getCAddress();

cc.cMobileNo=5678761234l;
cc.cMailId="Harry@gmail.com";
cc.getCContact();

cad.cAccNo=45670987123l;
cad.cAccType="SAVINGS";
cad.cAccStatus="Active";
cad.cAccActivDate="12/02/2017";
cad.cAccBal=8450060.62f;
cad.getCAccountDetails();

cdd.cPanNo="GH567JK879";
cdd.cAadhaarNo=786546752343l;
cdd.cDebitCardNo=456789560987l;
cdd.cCreditCardNo=456389076120l;
cdd.getCDocDetails();

ct.cAmtWithd=56000;
ct.cAmtDeposit=95300;
ct.cAmtWithddate="12/01/2022";
ct.cAmtDepodate="18/12/2021";
ct.getCTransDetails();

cbd.cBankName="State Bank of India";
cbd.cBankBranchName ="Jay Nagar";
cbd.cBankIFSC="SBIN0008976";
cbd.cBankEmail="customercare@sbi.com";
cbd.cBankPhone=8796564341l;
cbd.getCBanksDetails();

}
}
