class Number {
    protected double value;

    public Number(double value) {
        this.value = value;
    }
}

// Child class for comparing numbers
class BigNumber extends Number {
    public BigNumber(double value) {
        super(value);
    }

    public void compare(BigNumber other) {
        if (this.value > other.value) {
            System.out.println(this.value + " is bigger.");
        } else if (other.value > this.value) {
            System.out.println(other.value + " is bigger.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}

public class Demo035{
    public static void main(String[] args) {
        BigNumber num1 = new BigNumber(10.5);
        BigNumber num2 = new BigNumber(20.7);

        num1.compare(num2);
    }
}

