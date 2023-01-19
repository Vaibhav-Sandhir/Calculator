package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import org.controlsfx.control.action.Action;

public class HelloController {
    @FXML
    private String operation;
    private String firstNumber = "";
    private String currentNumber = "";
    @FXML
    private TextField textarea;
    @FXML
    private Text history;
    @FXML
    private RadioButton bradian;
    @FXML
    private RadioButton bdegree;
    @FXML
    void activateDegree(ActionEvent event) {

    }

    @FXML
    void activateRadian(ActionEvent event) {

    }

    @FXML
    public void add(ActionEvent event) {
        calculateSet("+");
    }

    @FXML
    void divide(ActionEvent event) {
        calculateSet("/");
    }

    @FXML
    void exponent(ActionEvent event) {
        calculateSet("^");
    }

    @FXML
    void multilply(ActionEvent event) {
        calculateSet("*");
    }

    @FXML
    void remainder(ActionEvent event) {
        calculateSet("%");
    }

    @FXML
    void subtract(ActionEvent event) {
        calculateSet("-");
    }

    @FXML
    void number1(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    void number2(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    void number3(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    void number4(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    void number5(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    void number6(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    void number7(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    void number8(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    void number9(ActionEvent event) {
        addNumber("9");
    }

    @FXML
    void numberPI(ActionEvent event) {
        addNumber("π");
    }

    @FXML
    void numberE(ActionEvent event) {
        addNumber("e");
    }

    @FXML
    void number0(ActionEvent event) {
        addNumber("0");
    }

    @FXML
    void deleteone(ActionEvent event){
        currentNumber = currentNumber.substring(0, currentNumber.length()-1);
        updateTextField();
    }

    @FXML
    void ln(ActionEvent event) {
        double num;
        if(currentNumber.equals("e"))
            num = Math.E;
        else if(currentNumber.equals("π"))
            num = Math.PI;
        else
            num = Double.parseDouble(currentNumber);
        double ans;
        ans = Math.log(num);
        currentNumber = String.valueOf(ans);
        history.setText("ln( " + num + ") = " + ans);
        textarea.setText(String.valueOf(ans));
    }

    @FXML
    void log(ActionEvent event) {
        double num;
        if(currentNumber.equals("e"))
            num = Math.E;
        else if(currentNumber.equals("π"))
            num = Math.PI;
        else
            num = Double.parseDouble(currentNumber);
        double ans;
        ans = Math.log10(num);
        currentNumber = String.valueOf(ans);
        history.setText("tan( " + num + ") = " + ans);
        textarea.setText(String.valueOf(ans));
    }

    @FXML
    void sin(ActionEvent event) {
        double num;
        if(currentNumber.equals("e"))
            num = Math.E;
        else if(currentNumber.equals("π"))
            num = Math.PI;
        else
            num = Double.parseDouble(currentNumber);
        double ans;
        if(bdegree.isSelected())
            ans = Math.sin(Math.toRadians(num));
        else
            ans = Math.sin(num);
        currentNumber = String.valueOf(ans);
        history.setText("tan( " + num + ") = " + ans);
        textarea.setText(String.valueOf(ans));
    }

    @FXML
    void cos(ActionEvent event) {
        double num;
        if(currentNumber.equals("e"))
            num = Math.E;
        else if(currentNumber.equals("π"))
            num = Math.PI;
        else
            num = Double.parseDouble(currentNumber);
        double ans;
        if(bdegree.isSelected())
            ans = Math.cos(Math.toRadians(num));
        else
            ans = Math.cos(num);
        currentNumber = String.valueOf(ans);
        history.setText("cos( " + num + ") = " + ans);
        textarea.setText(String.valueOf(ans));
    }

    @FXML
    void tan(ActionEvent event) {
        double num;
        if(currentNumber.equals("e"))
            num = Math.E;
        else if(currentNumber.equals("π"))
            num = Math.PI;
        else
            num = Double.parseDouble(currentNumber);
        double ans;
        if(bdegree.isSelected())
            ans = Math.tan(Math.toRadians(num));
        else
            ans = Math.tan(num);
        currentNumber = String.valueOf(ans);
        history.setText("tan( " + num + ") = " + ans);
        textarea.setText(String.valueOf(ans));
    }

    @FXML
    void underoot(ActionEvent event) {
        double num;
        if(currentNumber.equals("e"))
            num = Math.E;
        else if(currentNumber.equals("π"))
            num = Math.PI;
        else
            num = Double.parseDouble(currentNumber);
        double ans = Math.sqrt(num);
        currentNumber = String.valueOf(ans);
        history.setText("√" + num + " = " + ans);
        textarea.setText(String.valueOf(ans));
    }
    @FXML
    void calculate(ActionEvent event){
        double firstDouble;
        double secondDouble;
        double ans;
        if(firstNumber.equals("e"))
            firstDouble = Math.E;
        else if(firstNumber.equals("π"))
            firstDouble = Math.PI;
        else {
            firstDouble = Double.parseDouble(firstNumber);
        }
        if(currentNumber.equals("e"))
            secondDouble = Math.E;
        else if(currentNumber.equals("π"))
            secondDouble = Math.PI;
        else {
            secondDouble = Double.parseDouble(currentNumber);
        }
        switch(operation){
            case "+":
                ans = firstDouble + secondDouble;
                history.setText(firstNumber + " + " + currentNumber + " = " + ans);
                currentNumber = String.valueOf(ans);
                textarea.setText(currentNumber);
                break;
            case "-":
                ans = firstDouble - secondDouble;
                history.setText(firstNumber + " - " + currentNumber + " = " + ans);
                currentNumber = String.valueOf(ans);
                textarea.setText(currentNumber);
                break;
            case "*":
                ans = firstDouble * secondDouble;
                history.setText(firstNumber + " * " + currentNumber + " = " + ans);
                currentNumber = String.valueOf(ans);
                textarea.setText(currentNumber);
                break;
            case "/":
                ans = firstDouble / secondDouble;
                history.setText(firstNumber + " / " + currentNumber + " = " + ans);
                currentNumber = String.valueOf(ans);
                textarea.setText(currentNumber);
                break;
            case "%":
                ans = firstDouble % secondDouble;
                history.setText(firstNumber + " % " + currentNumber + " = " + ans);
                currentNumber = String.valueOf(ans);
                textarea.setText(currentNumber);
                break;
            case "^":
                ans = Math.pow(firstDouble,secondDouble);
                history.setText(firstNumber + " ^ " + currentNumber + " = " + ans);
                currentNumber = String.valueOf(ans);
                textarea.setText(currentNumber);
        }
    }
    @FXML
    void cleartext(ActionEvent event){
        currentNumber = "";
        textarea.setText("");
        history.setText("");
    }
    public void calculateSet(String operation){
        this.operation = operation;
        firstNumber = currentNumber;
        currentNumber = "";
        history.setText(firstNumber + " " + operation);
    }
    public void updateTextField(){
        textarea.setText(currentNumber);
    }
    public void addNumber(String number){
        currentNumber += number;
        updateTextField();
    }
}