package com.xworkz.string.staticMethods;

public class methods01
{
    public static void main(String[] args) {

        String name="Adhya";

        /// copyValueOf(char[] data) ---> copies all character in array and converts into String
        char[] name2={'h','e','l','l','o'};
        String result2=String.copyValueOf(name2);
        System.out.println(result2);


        /// copyValueOf copies the character from the given offset till the count mentioned
        /// .toCharArray() ---> converts string int array of characters
        /// offset ---> start from which index
        /// count ---> till how many character from the given offset
        /// if the count becomes more than the length of char array "StringIndexOutOfBoundsException" occurs
        /// returns String
        String result1=String.copyValueOf(name.toCharArray(),0,2);
        System.out.println(result1);

        ///valueOf() with different parameters converts different datatypes into String

        char[] name3={'a','b','c'};
        String result3=String.valueOf(name3);  ///valueOf(char[] char) ---> converts char[] into string
        System.out.println(result3);  /// "abc"

        String result4=String.valueOf(name3,1,2);  ///same functionality as copyValueOf(char[],int,int) ---> because copyValueOf(char[], int ,int) internally calls valueOf(char[] ,int, int)
        System.out.println(result4);

        int a=3;
        System.out.println(String.valueOf(a)); ///valueOf(int i) ---> coverts int into string "3"

        double b=3.0;
        System.out.println(String.valueOf(b)); ///valueOf(double d) ---> coverts double into string "3.0"

        long c=234567890L;
        System.out.println(String.valueOf(c)); ///valueOf(long l) ---> coverts long into string "234567890"

        char d='a';
        System.out.println(String.valueOf(d)); ///valueOf(char c) ---> coverts char into string  "a"

        float e=3.0f;
        System.out.println(String.valueOf(e)); ///valueOf(float f) ---> coverts float into string  "3.0"

        System.out.println(String.valueOf(true)); ///valueOf(boolean b) ---> coverts boolean into string "true"

        MotorExample motorExample=new MotorExample(400);
        System.out.println(String.valueOf(motorExample));  ///valueOf(Object obj) ---> internally cals the toString of class whose ref is passed

        System.out.println(String.valueOf((Object)null)); ///prints null as String ---> "null"

        //System.out.println(String.valueOf(null));
        ///throws nullPointerException because it depends on which overloaded method is called
        /// there are 2 possibilities char[] and Object that accepts null --- but  char[] is more specific
        /// more specific means lower in inheritance hierarchy (char[] is Object, Object is not char[]) , so it chooses char[] here.
        /// inside valueOf(char[] data) method it is trying to return data which null --> therefore nullPointerExecption

        String result5=String.join(" ","Cat","is","on","the","table.");
        System.out.println(result5); ///used to join different strings using a delimiter
        /// delimiter is connecting element between the all the strings to be joined
        /// in this case delimiter is " "(space) , it can be anything

        int age=21;
        String result6=String.format("my name is %s and I am %d years old.",name,age);
        System.out.println(result6);  ///used with format specifiers



    }
}
