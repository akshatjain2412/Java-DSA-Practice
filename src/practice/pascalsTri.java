package practice;

public class pascalsTri {
    public static int factorial(int fact)
    {
        int a=1;
        for(int i=1;i<=fact;i++){
           a=a*i;
        }
        return a;
    }
    public static void main(String[] args) {
        int num=5;
        int arr[][]={{1},{1,2},{1,2,3},{1,2,3,4},{1,2,3,4,5}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j==0||i==j) {
                 arr[i][j]=1;
                }
                else {
                    int n = factorial(i);
                    int r = factorial(j);
                    int diff = factorial(i - j);
                    int combi = n / (r * diff);
                    arr[i][j] = combi;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
