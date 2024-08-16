package java14;

public class SwitchExpression {
    public static void main(String[] args) {
        //Traditional approach
        int num = 2;
        String result;
        switch (num) {
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            default:
                result = "Unknown";
                break;
        }
        System.out.println(result);

        //enhanced switch
        result = switch (num) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Unknown";
        };
        System.out.println(result);
    }
}
