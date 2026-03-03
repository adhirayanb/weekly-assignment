import java.util.Scanner;

// ============================================================
// Java Programming Elements - All Practice Solutions
// CodInClub / BridgeLabz
//
// Best Programming Practices:
// 1. All values stored as variables (no hard coding)
// 2. Proper camelCase naming conventions
// 3. Proper class names
// 4. Proper indentation
// 5. Comments explaining each step
//
// NOTE: To run a specific program, uncomment its method call in main()
// ============================================================

public class AllJavaSolutions {

    public static void main(String[] args) {

        // -------------------------------------------------------
        // Uncomment the program you want to run:
        // -------------------------------------------------------

        // === LEVEL 1 ===
        level1Program1_HarryAge();
        // level1Program2_SamAverageMarks();
        // level1Program3_KmToMiles();
        // level1Program4_ProfitAndLoss();
        // level1Program5_DividePens();
        // level1Program6_UniversityFeeDiscount();
        // level1Program7_VolumeOfEarth();
        // level1Program8_KmToMilesInput();
        // level1Program9_FeeWithDiscountInput();
        // level1Program10_HeightConverter();

        // === LEVEL 2 ===
        // level2Program1_BasicCalculator();
        // level2Program2_TriangleArea();
        // level2Program3_SquareSide();
        // level2Program4_DistanceConverter();
        // level2Program5_PurchasePrice();
        // level2Program6_QuotientRemainder();
        // level2Program7_IntOperations();

        // === LEVEL 3 ===
        // level3Program1_CelsiusToFahrenheit();
        // level3Program2_FahrenheitToCelsius();
        // level3Program3_TotalIncome();
        // level3Program4_TravelComputation();
        // level3Program5_SwapNumbers();
        // level3Program6_AthleteRounds();
        // level3Program7_DivideChocolates();
        // level3Program8_SimpleInterest();
        // level3Program9_PoundsToKg();
    }

    // ===========================================================
    //                      LEVEL 1
    // ===========================================================

    // -----------------------------------------------------------
    // Level 1 - Program 1: Harry's Age
    // Find age of Harry if birth year is 2000, current year 2024
    // I/P: NONE  |  O/P: Harry's age in 2024 is ___
    // -----------------------------------------------------------
    static void level1Program1_HarryAge() {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in " + currentYear + " is " + age);
    }

    // -----------------------------------------------------------
    // Level 1 - Program 2: Sam's Average Marks
    // Maths=94, Physics=95, Chemistry=96. Find average PCM mark.
    // I/P: NONE  |  O/P: Sam's average mark in PCM is ___
    // -----------------------------------------------------------
    static void level1Program2_SamAverageMarks() {
        double mathMarks = 94;
        double physicsMarks = 95;
        double chemistryMarks = 96;
        double totalSubjects = 3;
        double averageMarks = (mathMarks + physicsMarks + chemistryMarks) / totalSubjects;
        System.out.println("Sam's average mark in PCM is " + averageMarks);
    }

    // -----------------------------------------------------------
    // Level 1 - Program 3: Km to Miles (Fixed Distance)
    // Convert 10.8 km to miles. Hint: 1 km = 1.6 miles
    // I/P: NONE  |  O/P: The distance ___ km in miles is ___
    // -----------------------------------------------------------
    static void level1Program3_KmToMiles() {
        double distanceKm = 10.8;
        double milesPerKm = 1.6;
        double distanceMiles = distanceKm * milesPerKm;
        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }

    // -----------------------------------------------------------
    // Level 1 - Program 4: Profit and Loss
    // Cost price = INR 129, Selling price = INR 191
    // I/P: NONE  |  O/P: Cost Price, Selling Price, Profit, Profit%
    // -----------------------------------------------------------
    static void level1Program4_ProfitAndLoss() {
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercentage = profit / costPrice * 100;
        System.out.println("The Cost Price is INR " + costPrice +
                " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit +
                " and the Profit Percentage is " + profitPercentage + "%");
    }

    // -----------------------------------------------------------
    // Level 1 - Program 5: Divide Pens Among Students
    // 14 pens, 3 students. Pens per student and remaining?
    // I/P: NONE  |  O/P: Pens per student and remaining pens
    // -----------------------------------------------------------
    static void level1Program5_DividePens() {
        int totalPens = 14;
        int numberOfStudents = 3;
        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;
        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
    }

    // -----------------------------------------------------------
    // Level 1 - Program 6: University Fee with Discount
    // Fee = INR 125000, Discount = 10%
    // I/P: NONE  |  O/P: Discount amount and final discounted fee
    // -----------------------------------------------------------
    static void level1Program6_UniversityFeeDiscount() {
        double fee = 125000;
        double discountPercent = 10;
        double discount = fee * discountPercent / 100;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + discountedFee);
    }

    // -----------------------------------------------------------
    // Level 1 - Program 7: Volume of Earth
    // Volume of Sphere = (4/3) * pi * r^3, radius = 6378 km
    // I/P: NONE  |  O/P: Volume in cubic km and cubic miles
    // -----------------------------------------------------------
    static void level1Program7_VolumeOfEarth() {
        double pi = 3.14159265358979;
        double radiusEarthKm = 6378;
        double kmPerMile = 1.60934;
        double radiusEarthMiles = radiusEarthKm / kmPerMile;
        double volumeKm = (4.0 / 3.0) * pi * radiusEarthKm * radiusEarthKm * radiusEarthKm;
        double volumeMiles = (4.0 / 3.0) * pi * radiusEarthMiles * radiusEarthMiles * radiusEarthMiles;
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);
    }

    // -----------------------------------------------------------
    // Level 1 - Program 8: Km to Miles (User Input)
    // I/P: km  |  O/P: The total miles is ___ mile for the given ___ km
    // -----------------------------------------------------------
    static void level1Program8_KmToMilesInput() {
        Scanner input = new Scanner(System.in);
        double km;
        System.out.print("Enter distance in km: ");
        km = input.nextDouble();
        double milesPerKm = 1.6;
        double miles = km * milesPerKm;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }

    // -----------------------------------------------------------
    // Level 1 - Program 9: Fee with Discount (User Input)
    // I/P: fee, discountPercent
    // O/P: The discount amount is INR ___ and final discounted fee is INR ___
    // -----------------------------------------------------------
    static void level1Program9_FeeWithDiscountInput() {
        Scanner input = new Scanner(System.in);
        double fee, discountPercent;
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();
        System.out.print("Enter the discount percent: ");
        discountPercent = input.nextDouble();
        double discount = fee * discountPercent / 100;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + discountedFee);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 1 - Program 10: Height cm to Feet and Inches
    // Hint: 1 foot = 12 inches, 1 inch = 2.54 cm
    // I/P: height (cm)  |  O/P: Height in cm, feet and inches
    // -----------------------------------------------------------
    static void level1Program10_HeightConverter() {
        Scanner input = new Scanner(System.in);
        double heightCm;
        System.out.print("Enter your height in cm: ");
        heightCm = input.nextDouble();
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;
        double totalInches = heightCm / cmPerInch;
        int feet = (int)(totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;
        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet + " and inches is " + inches);
        input.close();
    }

    // ===========================================================
    //                      LEVEL 2
    // ===========================================================

    // -----------------------------------------------------------
    // Level 2 - Program 1: Basic Calculator
    // Take 2 floating point numbers, perform all 4 operations
    // I/P: number1, number2  |  O/P: addition, subtraction, multiplication, division
    // -----------------------------------------------------------
    static void level2Program1_BasicCalculator() {
        Scanner input = new Scanner(System.in);
        double number1, number2;
        System.out.print("Enter number1: ");
        number1 = input.nextDouble();
        System.out.print("Enter number2: ");
        number2 = input.nextDouble();
        double addition       = number1 + number2;
        double subtraction    = number1 - number2;
        double multiplication = number1 * number2;
        double division       = number1 / number2;
        System.out.println("The addition, subtraction, multiplication, and division value of "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 2 - Program 2: Area of Triangle
    // Hint: Area = 0.5 * base * height, 1 in = 2.54 cm
    // I/P: base, height  |  O/P: Area in sq in and sq cm
    // -----------------------------------------------------------
    static void level2Program2_TriangleArea() {
        Scanner input = new Scanner(System.in);
        double base, height;
        System.out.print("Enter base in cm: ");
        base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        height = input.nextDouble();
        double cmPerInch = 2.54;
        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / (cmPerInch * cmPerInch);
        System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                " and sq cm is " + areaSqCm);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 2 - Program 3: Side of Square from Perimeter
    // Hint: Perimeter = 4 * side
    // I/P: perimeter  |  O/P: The length of the side is ___
    // -----------------------------------------------------------
    static void level2Program3_SquareSide() {
        Scanner input = new Scanner(System.in);
        double perimeter;
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 2 - Program 4: Distance in Yards and Miles
    // Hint: 1 mile = 1760 yards, 1 yard = 3 feet
    // I/P: distanceInFeet  |  O/P: Distance in yards and miles
    // -----------------------------------------------------------
    static void level2Program4_DistanceConverter() {
        Scanner input = new Scanner(System.in);
        double distanceInFeet;
        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();
        double feetPerYard = 3;
        double yardsPerMile = 1760;
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;
        System.out.println("The distance in yards is " + distanceInYards +
                " while the distance in miles is " + distanceInMiles);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 2 - Program 5: Total Purchase Price
    // I/P: unitPrice, quantity  |  O/P: Total purchase price
    // -----------------------------------------------------------
    static void level2Program5_PurchasePrice() {
        Scanner input = new Scanner(System.in);
        double unitPrice;
        int quantity;
        System.out.print("Enter unit price (INR): ");
        unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 2 - Program 6: Quotient and Remainder
    // Hint: use / for quotient, % for remainder
    // I/P: number1, number2  |  O/P: Quotient and Reminder
    // -----------------------------------------------------------
    static void level2Program6_QuotientRemainder() {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.print("Enter number1: ");
        number1 = input.nextInt();
        System.out.print("Enter number2: ");
        number2 = input.nextInt();
        int quotient  = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 2 - Program 7: Integer Operations (Operator Precedence)
    // Operations: a+b*c, a*b+c, c+a/b, a%b+c
    // I/P: a, b, c  |  O/P: Results of 4 int operations
    // -----------------------------------------------------------
    static void level2Program7_IntOperations() {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter value of a: ");
        a = input.nextInt();
        System.out.print("Enter value of b: ");
        b = input.nextInt();
        System.out.print("Enter value of c: ");
        c = input.nextInt();
        // Operator precedence: * / % execute before + -
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        System.out.println("The results of Int Operations are "
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        input.close();
    }

    // ===========================================================
    //                      LEVEL 3
    // ===========================================================

    // -----------------------------------------------------------
    // Level 3 - Program 1: Celsius to Fahrenheit
    // Hint: (C x 9/5) + 32 = F
    // I/P: celsius  |  O/P: The ___ celsius is ___ fahrenheit
    // -----------------------------------------------------------
    static void level3Program1_CelsiusToFahrenheit() {
        Scanner input = new Scanner(System.in);
        double celsius;
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();
        double farenheitResult = (celsius * 9.0 / 5.0) + 32;
        System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit");
        input.close();
    }

    // -----------------------------------------------------------
    // Level 3 - Program 2: Fahrenheit to Celsius
    // Hint: (F - 32) x 5/9 = C
    // I/P: fahrenheit  |  O/P: The ___ fahrenheit is ___ celsius
    // -----------------------------------------------------------
    static void level3Program2_FahrenheitToCelsius() {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
        input.close();
    }

    // -----------------------------------------------------------
    // Level 3 - Program 3: Total Income
    // I/P: salary, bonus  |  O/P: Salary, bonus, and total income
    // -----------------------------------------------------------
    static void level3Program3_TotalIncome() {
        Scanner input = new Scanner(System.in);
        double salary, bonus;
        System.out.print("Enter salary (INR): ");
        salary = input.nextDouble();
        System.out.print("Enter bonus (INR): ");
        bonus = input.nextDouble();
        double totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + totalIncome);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 3 - Program 4: Travel Computation (User Input)
    // Rewrite of Sample Program 2 with all user inputs
    // I/P: name, cities, distances, times
    // O/P: Total distance and total time of travel
    // -----------------------------------------------------------
    static void level3Program4_TravelComputation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter traveller name: ");
        String name = input.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = input.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();
        System.out.print("Enter to city: ");
        String toCity = input.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (km): ");
        double distanceFromToVia = input.nextDouble();
        System.out.print("Enter time (minutes) from " + fromCity + " to " + viaCity + ": ");
        int timeFromToVia = input.nextInt();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (km): ");
        double distanceViaToFinalCity = input.nextDouble();
        System.out.print("Enter time (minutes) from " + viaCity + " to " + toCity + ": ");
        int timeViaToFinalCity = input.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
        input.close();
    }

    // -----------------------------------------------------------
    // Level 3 - Program 5: Swap Two Numbers
    // I/P: number1, number2  |  O/P: The swapped numbers are ___ and ___
    // -----------------------------------------------------------
    static void level3Program5_SwapNumbers() {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.print("Enter number1: ");
        number1 = input.nextInt();
        System.out.print("Enter number2: ");
        number2 = input.nextInt();
        // Swap using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 3 - Program 6: Athlete Rounds in Triangular Park
    // Hint: Perimeter = side1+side2+side3, rounds = 5000m / perimeter
    // I/P: side1, side2, side3 (meters)  |  O/P: Number of rounds
    // -----------------------------------------------------------
    static void level3Program6_AthleteRounds() {
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        System.out.print("Enter side1 (meters): ");
        side1 = input.nextDouble();
        System.out.print("Enter side2 (meters): ");
        side2 = input.nextDouble();
        System.out.print("Enter side3 (meters): ");
        side3 = input.nextDouble();
        double targetDistanceMeters = 5000;
        double perimeter = side1 + side2 + side3;
        double numberOfRounds = targetDistanceMeters / perimeter;
        System.out.println("The total number of rounds the athlete will run is " +
                numberOfRounds + " to complete 5 km");
        input.close();
    }

    // -----------------------------------------------------------
    // Level 3 - Program 7: Divide Chocolates Among Children
    // I/P: numberOfChocolates, numberOfChildren
    // O/P: Chocolates per child and remaining chocolates
    // -----------------------------------------------------------
    static void level3Program7_DivideChocolates() {
        Scanner input = new Scanner(System.in);
        int numberOfChocolates, numberOfChildren;
        System.out.print("Enter number of chocolates: ");
        numberOfChocolates = input.nextInt();
        System.out.print("Enter number of children: ");
        numberOfChildren = input.nextInt();
        int chocolatesPerChild    = numberOfChocolates / numberOfChildren;
        int remainingChocolates   = numberOfChocolates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                " and the number of remaining chocolates are " + remainingChocolates);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 3 - Program 8: Simple Interest
    // Hint: SI = Principal * Rate * Time / 100
    // I/P: principal, rate, time  |  O/P: Simple Interest
    // -----------------------------------------------------------
    static void level3Program8_SimpleInterest() {
        Scanner input = new Scanner(System.in);
        double principal, rate, time;
        System.out.print("Enter Principal amount: ");
        principal = input.nextDouble();
        System.out.print("Enter Rate of Interest (%): ");
        rate = input.nextDouble();
        System.out.print("Enter Time (years): ");
        time = input.nextDouble();
        double simpleInterest = principal * rate * time / 100;
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
        input.close();
    }

    // -----------------------------------------------------------
    // Level 3 - Program 9: Pounds to Kilograms
    // Hint: 1 pound = 2.2 kg
    // I/P: weight (pounds)  |  O/P: Weight in pounds and kg
    // -----------------------------------------------------------
    static void level3Program9_PoundsToKg() {
        Scanner input = new Scanner(System.in);
        double weightPounds;
        System.out.print("Enter weight in pounds: ");
        weightPounds = input.nextDouble();
        double poundsPerKg = 2.2;
        double weightKg = weightPounds / poundsPerKg;
        System.out.println("The weight of the person in pounds is " + weightPounds +
                " and in kg is " + weightKg);
        input.close();
    }

}