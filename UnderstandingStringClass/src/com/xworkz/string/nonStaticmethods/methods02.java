package com.xworkz.string.nonStaticmethods;

public class methods02
{
    public static void main(String[] args) {

        String name="Adhya";
        System.out.println(name.length()); ///return the length of the string/no of characters in th string

        String box="hello";
        System.out.println(box.isEmpty()); ///return true if length of string is 0 or else always returns false
        String box2="";
        System.out.println(box2.isEmpty());

        System.out.println(name.charAt(2)); ///returns the character present at the given index

        System.out.println(name.codePointAt(4)); ///returns something called as unicode (0 to 1,114,111) representing character in any language

        System.out.println(name.codePointBefore(4));/// gives the unicode of character which is before the given index

        System.out.println(name.codePointCount(0, 3)); ///same as length() function but give actual no of character
        /// in length emoji=2 char but in codePointCount emoji=1char ,so it gives the exact no of characters

        char[] arr=new char[5];
        name.getChars(1,3,arr,1);
        System.out.println(arr);
        /// copies the characters at given srcBeging(starting index) to srcEnd(ending index)  into the destination array from the index specified(dstBegin)
    }
}
