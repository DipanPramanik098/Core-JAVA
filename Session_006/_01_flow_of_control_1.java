public class _01_flow_of_control_1 {

    public static void main(String[] args) {

        // =====================================================
        // 1. SIMPLE IF STATEMENT
        // =====================================================

        int age = 20;

        // Executes only when condition is true
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        System.out.println();


        // =====================================================
        // 2. IF - ELSE STATEMENT
        // =====================================================

        int marks = 35;

        // If condition is true -> if block executes
        // Otherwise -> else block executes

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println();


        // =====================================================
        // 3. IF - ELSE IF LADDER
        // =====================================================

        int score = 85;

        // Used when multiple conditions exist

        if (score >= 90) {
            System.out.println("Grade A");
        }
        else if (score >= 80) {
            System.out.println("Grade B");
        }
        else if (score >= 70) {
            System.out.println("Grade C");
        }
        else if (score >= 60) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }

        System.out.println();


        // =====================================================
        // 4. NESTED IF
        // =====================================================

        int userAge = 25;
        boolean hasLicense = true;

        // One if statement inside another if statement

        if (userAge >= 18) {

            System.out.println("Age requirement satisfied.");

            if (hasLicense) {
                System.out.println("Allowed to drive.");
            } else {
                System.out.println("License required.");
            }

        } else {
            System.out.println("Too young to drive.");
        }

        System.out.println();


        // =====================================================
        // 5. SWITCH STATEMENT
        // =====================================================

        int day = 3;

        /*
         * switch checks a value
         * and jumps to matching case
         */

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
        }

        System.out.println();


        // =====================================================
        // SWITCH WITHOUT BREAK (FALL THROUGH)
        // =====================================================

        int num = 2;

        switch (num) {

            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");

            default:
                System.out.println("Default");
        }

        /*
         * Output:
         * Two
         * Three
         * Default
         *
         * Because break is missing.
         * Execution falls through next cases.
         */
    }
}