package com.example.androidblockchaindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 4;

    private TextView bankInfo;
    private TextView medicalInfo;
    private TextView creditCardInfo;
    private TextView studentInfo;
    private TextView passportInfo;
    private TextView pizzaInfo;
    private TextView amazonInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String secretKey = "this is a password";
        //add our blocks to the blockchain ArrayList:

        bankInfo = findViewById(R.id.jsonPayloadBank);
        medicalInfo = findViewById(R.id.jsonPayloadMedical);
        creditCardInfo = findViewById(R.id.jsonPayloadCreditCard);
        studentInfo = findViewById(R.id.jsonPayloadStudent);
        passportInfo = findViewById(R.id.jsonPayloadPassport);
        pizzaInfo = findViewById(R.id.jsonPayloadPizza);
        amazonInfo = findViewById(R.id.jsonPayloadAmazon);

        System.out.println("Trying to Mine block 1... ");
        //call the addBlock method and pass a new block object with an AES encrypted POJO as the data for the block
        //the previous hash value passed into the new block object is zero because this is the genesis block
        BankingRecord bankRecord = new BankingRecord();
        bankRecord.setAccountNumber("1234");
        bankRecord.setAccountType("Savings");
        bankRecord.setTransactionType("Deposit");
        bankRecord.setTransactionAmount("100");
        bankRecord.setBalance("200");

        Gson gson = new Gson();
        String jsonBank = gson.toJson(bankRecord);

        String encryptedBankRecord = AES.encrypt(jsonBank, secretKey) ;

        addBlock(new Block(encryptedBankRecord, "0"));

        bankInfo.setText(jsonBank);

        System.out.println("Trying to Mine block 2... ");
        //call the addBlock method and pass a new block object with an AES encrypted POJO as the data for the block
        //the previous hash value passed into the new block object is zero because this is the genesis block
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.setDoctorName("Dr. Joseph Oakes");
        medicalRecord.setPatientID("54469");
        medicalRecord.setPatientName("Joseph Sliwka");
        medicalRecord.setProcedureCode("582");
        medicalRecord.setVisitDate("2/21/2019");

        String jsonMedical = gson.toJson(medicalRecord);

        String encryptedMedicalRecord = AES.encrypt(jsonMedical, secretKey);

        addBlock(new Block(encryptedMedicalRecord,blockchain.get(blockchain.size()-1).hash));
        medicalInfo.setText(jsonMedical);

        System.out.println("Trying to Mine block 3... ");
        //call the addBlock method and pass a new block object with an AES encrypted POJO as the data for the block
        //the previous hash value passed into the new block object is zero because this is the genesis block
        CreditCard creditCardTransaction = new CreditCard();
        creditCardTransaction.setBusinessName("Penn State University - Abington");
        creditCardTransaction.setCardholderName("Joseph Sliwka");
        creditCardTransaction.setDate("2/21/2019");
        creditCardTransaction.setStatus("Pending");
        creditCardTransaction.setTransactionType("PURCHASE");

        String jsonCreditCardTransaction = gson.toJson(creditCardTransaction);

        String jsonCreditCardTransactionEncrypted = AES.encrypt(jsonCreditCardTransaction, secretKey);

        addBlock(new Block(jsonCreditCardTransactionEncrypted,blockchain.get(blockchain.size()-1).hash));

        creditCardInfo.setText(jsonCreditCardTransaction);

        System.out.println("Trying to Mine block 4... ");
        //call the addBlock method and pass a new block object with an AES encrypted POJO as the data for the block
        //get the hash of the previous block in the arraylist and pass it into the block constructor
        Student student1 = new Student();
        student1.setStudentID("981493786");
        student1.setStudentName("Joseph Sliwka");
        student1.setStudentMajor("IST");

        String jsonStudent = gson.toJson(student1);

        String jsonStudentEncrypted = AES.encrypt(jsonStudent, secretKey);

        addBlock(new Block(jsonStudentEncrypted,blockchain.get(blockchain.size()-1).hash));

        studentInfo.setText(jsonStudent);

        System.out.println("Trying to Mine block 5... ");
        //call the addBlock method and pass a new block object with an AES encrypted POJO as the data for the block
        //the previous hash value passed into the new block object is zero because this is the genesis block
        Passport passport = new Passport();
        passport.setPassportID("s21098120");
        passport.setPassportName("Brian James Johnston");
        passport.setNationality("USA");
        passport.setDateOfBirth("11/26/1996");
        passport.setSex("Male");
        passport.setIssueDate("1/1/2019");
        passport.setExpirationDate("1/1/2029");

        String jsonPassport = gson.toJson(passport);

        String jsonPassportEncrypted = AES.encrypt(jsonPassport, secretKey);

        addBlock(new Block(jsonPassportEncrypted,blockchain.get(blockchain.size()-1).hash));

        passportInfo.setText(jsonPassport);

        System.out.println("Trying to Mine block 6... ");
        //call the addBlock method and pass a new block object with an AES encrypted POJO as the data for the block
        //the previous hash value passed into the new block object is zero because this is the genesis block
        PizzaOrder pizzaOrder = new PizzaOrder();
        pizzaOrder.setOrderID("70");
        pizzaOrder.setName("Brian Johnston");
        pizzaOrder.setPizzaSize("Extra Large");
        pizzaOrder.setMeats("Pepperoni, Bacon");
        pizzaOrder.setVeggies("None");
        pizzaOrder.setExtraToppings("Extra Cheese");
        pizzaOrder.setOrderMethod("Delivery");
        pizzaOrder.setPaymentMethod("Card");
        pizzaOrder.setCost("$25");


        String jsonPizzaOrder = gson.toJson(pizzaOrder);

        String jsonPizzaOrderEncrypted = AES.encrypt(jsonPizzaOrder, secretKey);

        addBlock(new Block(jsonPizzaOrderEncrypted,blockchain.get(blockchain.size()-1).hash));

        pizzaInfo.setText(jsonPizzaOrder);

        System.out.println("Trying to Mine block 7... ");
        //call the addBlock method and pass a new block object with an AES encrypted POJO as the data for the block
        //the previous hash value passed into the new block object is zero because this is the genesis block
        AmazonItem amazonItem = new AmazonItem();
        amazonItem.setOrderID("801-281320741");
        amazonItem.setCustomerName("Brian Johnston");
        amazonItem.setItemName("Legend of Zelda Link's Awakening - Nintendo Switch");
        amazonItem.setCost("$59.99");
        amazonItem.setPaymentMethod("Card");
        amazonItem.setItemStatus("Shipping");

        String jsonAmazonItem = gson.toJson(amazonItem);

        String jsonAmazonItemEncrypted = AES.encrypt(jsonAmazonItem, secretKey);

        addBlock(new Block(jsonAmazonItemEncrypted,blockchain.get(blockchain.size()-1).hash));

        amazonInfo.setText(jsonAmazonItem);

        //call the isChainValid() method to check the validity of the block hashes
        String blockchainJson = StringUtil.getJson(blockchain);
        System.out.println("\nThe block chain: ");
        System.out.println(blockchainJson);

        for(int i = 0; i < blockchain.size(); i++){
            System.out.println("\nDecrypted block data for block #" + (i+1) + ": " + AES.decrypt(blockchain.get(i).getData(), secretKey));
        }

    }
    //method for checking the integriy of the blockchain
    public static Boolean isChainValid() {
        //initialization of local variables for the method
        Block currentBlock;
        Block previousBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0', '0');

        //loop through the entire blockchain to check hashes:
        for(int i=1; i < blockchain.size(); i++) {
            //set the local variables to reference the current block in the chain and the previous block in the chain
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);
            //calculate the hash of the current block again and compare it to the current block's hash that was calculated before. If the hash changed in the time
            // since the block was initially created, the entire chain is invalid and return false
            if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
                System.out.println("Current Hashes not equal");
                return false;
            }
            //calculate the hash of the previous block again and compare it to the previous block's hash that was calculated before. If the hash changed in the time
            // since the block was initially created, the entire chain is invalid and return false
            if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
            //If the current block hasn't been processed through the mining method, assume the chain is invalid and return false.
            if(!currentBlock.hash.substring( 0, difficulty).equals(hashTarget)) {
                System.out.println("This block hasn't been mined");
                return false;
            }

        }
        //If everything looks ok, return true
        return true;
    }

    //method for adding a new block into the blockchain, accepts a Block object as a parameter
    public static void addBlock(Block newBlock) {
        //make the computer do work by mining the passed block before adding the block to the blockchain arraylist.
        // Pass in the difficulty of mining the block that was defined above.
        //This makes it harder or easier for the computer to mine the block.
        newBlock.mineBlock(difficulty);
        blockchain.add(newBlock);
    }
}
