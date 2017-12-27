
package calculator;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "calculatorBean")
@RequestScoped
public class CalculatorBean {
    
    private int param1;
    private int param2;
    private String result;

    public CalculatorBean() {
    }

    public int getParam1() {
        return param1;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public int getParam2() {
        return param2;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
  
    public String add(){
    result = Integer.toString(param1 + param2);
    return "";
    
    }
    
    public String substract(){
    result = Integer.toString(param1 - param2);
    return "";
    
    }
    public String multiply(){
    result = Integer.toString(param1 * param2);
    return "";
    
    }
    public String divide(){
    result = param2 ==0 ? "n/a" : Double.toString(param1 / (double)param2);
    return "";
    
    }
    
    
    
    
    
}
