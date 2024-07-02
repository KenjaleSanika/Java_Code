public class SwapTwoNosWithoutArithmeticOperator {
    public static void main(String[]args){
        int n1=2;
        int n2=3;
        System.out.println("Before swaapping  "+n1+" , "+n2);
        n1=n1^n2;//n1=2^3;//1
        n2=n1^n2;//n2=1^3;//2
        n1=n1^n2;//n1=1^2//3
        System.out.println("Before swaapping  "+n1+" , "+n2);
    }

}


/*EOR operation
| A | B | A XOR B |
|---|---|---------|
| 0 | 0 |    0    |
| 0 | 1 |    1    |
| 1 | 0 |    1    |
| 1 | 1 |    0    |

int n1 = 2;  // binary: 0010
int n2 = 3;  // binary: 0011

n1 = n1 ^ n2; // n1 = 0010 ^ 0011 = 0001
n2 = n1 ^ n2; // n2 = 0001 ^ 0011 = 0010
n1 = n1 ^ n2; // n1 = 0001 ^ 0010 = 0011*/