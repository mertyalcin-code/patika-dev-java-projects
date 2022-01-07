public class Calculator {

    public double add(double ...nums){
    double result=0;
    for(double num :nums){
        result+=num;
    }
    return result;
    }
    public double minus(double num1, double num2){
        return num1-num2;
    }
    public double multiply(double ...nums){
       double result=1;
       for(double num:nums){
           result *=num;
       }
       return result;
    }
    public double divide(double num1,double num2){
       if(num2==0){
           throw new ArithmeticException("divide by zero");
       }
       else return num1/num2;
    }
    public double power(double num1,double num2){
        double result = num1;
        for (int i = 1; i < num2; i++) {
            result*=num1;
        }
        return result;
    }
    public double squareRoot(double num){
        // Newton's iteration is an algorithm for computing the square root of a number via the recurrence equation: X(n+1) = (X(n) + number/X(n))/2
        double result = num/2;
        double temp ;
        do
        {
            temp = result;
            result = (temp + (num / temp)) / 2;
        }
        while ((temp - result) != 0);
        return result;
    }
    public String derivative(int degree, double ...coefficients){
        StringBuilder result = new StringBuilder();

        for (int i= degree;i>=1;i--){
            if(i==1){
                result.append(coefficients[degree - i] * i);
            }else result.append(coefficients[degree - i] * i).append("x^").append(i - 1).append("+");
        }
        return result.toString();
    }
    public String integral(int degree, double ...coefficients){
        String result = "";

        for (int i= degree;i>=0;i--){
            if(i==0){
                result+=coefficients[degree]+"x";

            }else result+=coefficients[degree-i]/(i+1)+"x^"+(i+1)+"+";
        }
        return result.toString();
    }
    public int factorial(int num){
        if(num==1){
            return 1;
        }
        else return num*factorial(num-1);
    }
    public int mod(int num,int mod){
        return num%mod;
    }
    public int absolute(int num){
        if(num<0){
            return -num;
        }else return num;
    }

}
