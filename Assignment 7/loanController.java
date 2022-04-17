package ranasiac.classwork;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class loanController implements Initializable {

    //Controls:
    @FXML private RadioButton yes;
    @FXML private RadioButton no;
    @FXML private CheckBox noMissedPayment;
    @FXML private CheckBox automaticWithdrawal;
    @FXML private ListView <String> numberOfYears;
    @FXML private Label finalTotal;
    @FXML private ComboBox<String> interestRates;
    @FXML private TextField loanAmount;

    //Variables:
    final double REDUCED_RATE=0.0025;
    final double RATE_CONVERTED=0.01;
    String ratePicked;
    double fRate;
    String numOfYearsPicked;
    double fNumOfYears=0.00;
    String loanAmountPicked;
    double fLoanAmount;
    String fAnnualPayment;
    double annualPayment;

    //Arrays of choices:
    String [] years={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
    String [] rates={"3.00","3.50","4.00","4.50","5.00","5.50","6.00","6.50","7.00","7.50"};

    //Methods:
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        numberOfYears.getItems().addAll(years);
        interestRates.getItems().addAll(rates);
        no.setSelected(true);
    }

    //getters:
    public double getFRate(){
        ratePicked =interestRates.getSelectionModel().getSelectedItem();
        fRate=Double.parseDouble(ratePicked);
        fRate=(fRate*RATE_CONVERTED);
        if(noMissedPayment.isSelected()){
            fRate=(fRate-REDUCED_RATE);
        }
        if(automaticWithdrawal.isSelected()){
            fRate=(fRate-REDUCED_RATE);
        }
        return fRate;
    }
    public double getFNumOfYears(){
        numOfYearsPicked =numberOfYears.getSelectionModel().getSelectedItem();
        fNumOfYears=Double.parseDouble(numOfYearsPicked);
        return fNumOfYears;
    }
    public double getFLoanAmount(){
        loanAmountPicked=loanAmount.getText();
        fLoanAmount=Double.parseDouble(loanAmountPicked);
        return fLoanAmount;
    }
    public double getAnnualPayment(){
        if(yes.isSelected()){
            annualPayment=0.00;
        }
        else if(no.isSelected()){
            annualPayment=((getFRate()*(getFLoanAmount()))/(1-(Math.pow((1+getFRate()),-getFNumOfYears()))));
        }
        return annualPayment;
    }

    //Event Handlers:
    public void pressedCalculate() {

        fAnnualPayment=Double.toString(getAnnualPayment());
        finalTotal.setText(fAnnualPayment);
    }
}