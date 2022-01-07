import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator= new Calculator();
        boolean isRunning = true;

        while (isRunning){
            System.out.println("Welcome to calculator");
            System.out.println("1-add");
            System.out.println("2-minus");
            System.out.println("3-multiply");
            System.out.println("4-devide");
            System.out.println("5-square root");
            System.out.println("6-derivative");
            System.out.println("7-integral");
            System.out.println("8-factorial");
            System.out.println("9-mod");
            System.out.println("10-absolute");
            System.out.println("0-exit");
            System.out.print("Select:");
            int select=scanner.nextInt();
            if(select<0 ||select >10){
                System.out.println("!!! Not in the menu please try again !!! ");
                continue;
            }if(select==0){
                isRunning=false;
            }
            else if(select==1){
                System.out.print("How many number will you enter:");
                int num = scanner.nextInt();
                double result=0;
                if(num>0) {
                    double[] nums = new double[num];
                    for (int i=0;i<num;i++){
                        System.out.print((i+1)+". number:");
                        nums[i]=scanner.nextDouble();
                    }
                    result = calculator.add(nums);
                }
                System.out.println("Result ="+result);
            }
            else if(select==2){
                System.out.print("First number:");
                double num1 = scanner.nextDouble();
                System.out.print("Second number:");
                double num2 = scanner.nextDouble();
                double result = calculator.minus(num1,num2);
                System.out.println("Result ="+result);
            }
            else if(select==3){
                System.out.print("How many number will you enter:");
                int num = scanner.nextInt();
                double result=0;
                if(num>0) {
                    double[] nums = new double[num];
                    for (int i=0;i<num;i++){
                        System.out.print((i+1)+". number:");
                        nums[i]=scanner.nextDouble();
                    }
                    result = calculator.multiply(nums);
                    System.out.println("Result ="+result);
                }else  System.out.println("Wrong input ");
            }
            else if(select==4){
                System.out.print("First number:");
                double num1 = scanner.nextDouble();
                System.out.print("Second number:");
                double num2 = scanner.nextDouble();
                try {
                    double result = calculator.divide(num1,num2);
                    System.out.println("Result ="+result);
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }
            else if (select==5){
                System.out.print("Number:");
                double num = scanner.nextDouble();
                if(num>0){
                    System.out.print(calculator.squareRoot(num));
                }else System.out.println("Result:"+"must be pozitif value");
            }
            else if (select==6){
                System.out.print("Degree of derivative:");
                int degree = scanner.nextInt();
                if(degree>=0){
                    double[] nums = new double[degree+1];
                    for (int i = degree;i>=0;i--){
                    System.out.print("coefficient of x^"+i+" :");
                    nums[degree-i]=scanner.nextInt();
                    }
                    System.out.println("Result: "+calculator.derivative(degree,nums));
                }else System.out.println("Degree must be greater than zero");

            }
            else if (select==7){
                System.out.print("Degree of integral:");
                int degree = scanner.nextInt();
                if(degree>=0){
                    double[] nums = new double[degree+1];
                    for (int i = degree;i>=0;i--){
                        System.out.print("coefficient of x^"+i+" :");
                        nums[degree-i]=scanner.nextInt();
                    }
                    System.out.println("Result: "+calculator.integral(degree,nums));
                }else System.out.println("Degree must be greater than zero");
            }
            else if (select==8){
                System.out.print("Number:");
                int num = scanner.nextInt();
                if(num>0){
                    System.out.println("Result:"+calculator.factorial(num));
                }else System.out.println("must be pozitif value");
            }
            else if (select==9){
                System.out.print("Number:");
                int num = scanner.nextInt();
                System.out.print("Mod:");
                int mod = scanner.nextInt();
                if(num>0 && mod >0){
                    System.out.println("Result:"+calculator.mod(num,mod));
                }else System.out.println("must be pozitif value");
            }
            else if (select==10){
                System.out.print("Number:");
                int num = scanner.nextInt();
                    System.out.println("Result:"+calculator.absolute(num));
            }

            System.out.print("Exit(e) or continue:");
            scanner.next();
            String ask = scanner.nextLine();
            if(ask.equals("e")){
                isRunning=false;
            }
        }
    }
}
