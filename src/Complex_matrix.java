import java.util.Scanner;
public class Complex_matrix {
    static Scanner console = new Scanner(System.in);
    private Complex[][] complexArray;
    private Complex[][] complexArray_1;
    private Complex[][] array;

    public Complex_matrix() {
        super();
        this.complexArray = null;
    }
    public static void Complex_mat()  {

        double real = 0;
        double img = 0;
        int flag = 0;
        int flag_1 = 0;
        System.out.println("If you want to add complex matrix - 1, simple matrix - 2");
        flag =console.nextInt();
        int rows, cols, rows_1, cols_1;
        if(flag == 1){
            System.out.println("Enter rows and cols for complex matrix ");
            rows = console.nextInt();
            cols = console.nextInt();
            Complex[][] complexArray= new Complex[rows][cols];
            System.out.println("Enter elements a b for complex matrix");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    complexArray[i][j] = new Complex(console.nextInt(), console.nextInt());
                }
            }
            System.out.println("Your complex matrix:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(complexArray[i][j] + " ");
                }
                System.out.print("\n");
            }
            System.out.println("Choose next action: 1 - fold, 2 - multiply, 3 - transpose");
            flag_1 = console.nextInt();
            if(flag_1 == 1){
                System.out.println("Enter the size of the second matrix");
                rows_1 = console.nextInt();
                cols_1 = console.nextInt();
                Complex complexArray_1[][] = new Complex[rows_1][cols_1];
                System.out.println("Enter elements a b for second complex matrix");
                for (int i = 0; i < rows_1; i++) {
                    for (int j = 0; j < cols_1; j++) {
                        complexArray_1[i][j] = new Complex(console.nextInt(), console.nextInt());
                    }
                }
                System.out.println("Your second complex matrix:");

                for (int i = 0; i < rows_1; i++) {
                    for (int j = 0; j < cols_1; j++) {
                        System.out.print(complexArray_1[i][j] + " ");
                    }
                    System.out.print("\n");
                }
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        complexArray[i][j].re = complexArray[i][j].re + complexArray_1[i][j].re;
                        complexArray[i][j].im = complexArray[i][j].im + complexArray_1[i][j].im;
                    }
                }
                System.out.println("Your result matrix:");

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(complexArray[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
            if (flag_1 == 2) {
                System.out.println("Enter the size of the second matrix");
                rows_1 = console.nextInt();
                cols_1 = console.nextInt();
                Complex complexArray_1[][] = new Complex[rows_1][cols_1];

                System.out.println("Enter elements a b for second complex matrix");
                for (int i = 0; i < rows_1; i++) {
                    for (int j = 0; j < cols_1; j++) {
                        complexArray_1[i][j] = new Complex(console.nextInt(), console.nextInt());
                    }
                }
                System.out.println("Your second complex matrix:");
                Complex res[][] = new Complex[complexArray.length][complexArray_1[0].length];
                for (int i = 0; i < complexArray.length; i++) {
                    for (int j = 0; j < complexArray_1[0].length; j++) {
                        res[i][j] = new Complex(0, 0);
                    }
                }
                for (int i = 0; i < rows_1; i++) {
                    for (int j = 0; j < cols_1; j++) {
                        System.out.print(complexArray_1[i][j] + " ");
                    }
                    System.out.print("\n");
                }
                for (int i = 0; i <complexArray.length ; i++) {
                    for (int j = 0; j < complexArray_1[0].length; j++) {
                        for (int k = 0; k < complexArray_1.length; k++) {
                            res[i][j].re += (complexArray[i][k].re * complexArray_1[k][j].re) - (complexArray[i][k].im * complexArray_1[k][j].im);
                            res[i][j].im += (complexArray[i][k].re * complexArray_1[k][j].im) + (complexArray[i][k].im * complexArray_1[k][j].re);
                        }
                    }
                }
                System.out.println("Your result matrix:");

                for (int i = 0; i < complexArray.length; i++) {
                    for (int j = 0; j < complexArray_1[0].length; j++) {
                        System.out.print(res[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
            if (flag_1 == 3){
                System.out.println("Your result matrix:");
                Complex[][] temp = new Complex[cols][rows];
                for (int i = 0; i < cols; i++) {
                    for (int j = 0; j < rows; j++) {
                        temp[i][j] = new Complex(0, 0);
                    }
                }
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        temp[j][i].re = complexArray[i][j].re;
                        temp[j][i].im = complexArray[i][j].im;
                    }
                }
                for (int i = 0; i < cols; i++) {
                    for (int j = 0; j < rows; j++) {
                        System.out.print(temp[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
        }

        if (flag == 2) {
            System.out.println("Enter rows and cols for simple matrix");
            rows = console.nextInt();
            cols = console.nextInt();
            int[][] array = new int[rows][cols];
            System.out.println("Enter elements for simple matrix");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = console.nextInt();
                }
            }
            System.out.println("Your simple matrix:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Choose next action: 1 - fold, 2 - multiply, 3 - transpose");
            flag_1 = console.nextInt();
            if(flag_1 == 1) {
                System.out.println("Enter the size of the second matrix");
                rows_1 = console.nextInt();
                cols_1 = console.nextInt();
                int[][] array_1 = new int[rows_1][cols_1];
                System.out.println("Enter elements for second complex matrix");
                for (int i = 0; i < rows_1; i++) {
                    for (int j = 0; j < cols_1; j++) {
                        array_1[i][j] = console.nextInt();
                    }
                }
                System.out.println("Your second complex matrix:");

                for (int i = 0; i < rows_1; i++) {
                    for (int j = 0; j < cols_1; j++) {
                        System.out.print(array_1[i][j] + " ");
                    }
                    System.out.print("\n");
                }

                System.out.println("Your result matrix:");

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(array[i][j] + array_1[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
            if (flag_1 == 2) {
                System.out.println("Enter the size of the second matrix");
                rows_1 = console.nextInt();
                cols_1 = console.nextInt();
                int[][] array_1 = new int[rows_1][cols_1];
                
                System.out.println("Enter elements for second complex matrix");
                for (int i = 0; i < rows_1; i++) {
                    for (int j = 0; j < cols_1; j++) {
                        array_1[i][j] = console.nextInt();
                    }
                }
                int[][] res = new int[array.length][array_1[0].length];
                System.out.println("Your second complex matrix:");

                for (int i = 0; i < rows_1; i++) {
                    for (int j = 0; j < cols_1; j++) {
                        System.out.print(array_1[i][j] + " ");
                    }
                    System.out.print("\n");
                }
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array_1[0].length; j++) {
                        for (int k = 0; k < array_1.length; k++) {
                            res[i][j] += array[i][k] * array_1[k][j];
                        }
                    }
                }
                System.out.println("Your result matrix:");

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array_1[0].length; j++) {
                        System.out.print(res[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
            if (flag_1 == 3){
                System.out.println("Your result matrix:");
                int[][] temp = new int[cols][rows];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        temp[j][i] = array[i][j];
                    }
                }
                for (int i = 0; i < cols; i++) {
                    for (int j = 0; j < rows; j++) {
                        System.out.print(temp[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
        }
    }

}
