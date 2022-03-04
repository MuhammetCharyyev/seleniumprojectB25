package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class JavaFaker_Practice {
//JavaFaker is using for generating a lot of fake info to show in tests
    @Test
    public void test1() {
        //creating faker object to reach method
        Faker faker = new Faker(new Locale("en"));
        //you can indicate language and country with 'new Locale'
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        //printed random first name -> faker.name().firstName() = Merlin
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        //printed random last name ->faker.name().lastName() = Howell
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        //printed random full name ->faker.name().fullName() = Roxann Strosin DDS

        System.out.println("faker.numerify(\"###-###-####\") = "
                + faker.numerify("###-###-####"));
//generate fake phone number ->faker.numerify("###-###-####") = 839-333-1932

        System.out.println("faker.letterify(\"???-????\") = "
                + faker.letterify("???-????"));
        //will return random letters where we enter "?"
        //printed->faker.letterify("???-????") = rja-vylu

        System.out.println("faker.bothify(\"###?#-##?#-#?#-#?#?\") = "
                + faker.bothify("###?#-##?#-#?#-#?#?"));
        //printed->faker.bothify("###?#-##?#-#?#-#?#?") = 119q3-32x3-5t3-5m2i

        System.out.println("faker.finance().creditCard().replaceAll(\"-\", \"\") = "
                + faker.finance().creditCard().replaceAll("-", ""));
        //printed ->faker.finance().creditCard().replaceAll("-", "") = 4063045393307


        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        //generating fun facts randomly.
        // You can also make faker.chuckNorris().fact().replaceAll and replace "Chuck Noris"
        //by any name for fun
//printed->Chuck Norris solved the Travelling Salesman problem in O(1) time

    }
}
