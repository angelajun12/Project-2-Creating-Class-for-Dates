# Project 2: Creating a Class for Dates

Assignment from CS 212 (Object Oriented Programming in JAVA) with Professor Kenneth Lord

Course taken @ Queens College Fall 2016

￼￼￼￼￼Create a class called Date212 to represent a date. It will store the year, month and day as integers (not as a String), so you will need three private instance variables. Two constructors should be provided, one that takes three integer parameters, and one that takes a String (representing the date as in project 1). The constructor with the String parameter should validate the parameter as in project 1, and then use the substring method of class String to pull out the month, day and year, parse them as integers and call the three-argument constructor. The three-argument constructor should make sure that the month and day values are legal. To call another constructor from within a constructor, use the method this:

The format of the input file will be the same as Project 1.

Create a class called DateNode which has fields for the data (a Date212) and next (DateNode) instance variables. 
Include a one-argument constructor which takes a Date as a parameter.

The instance variables should have protected access. There will not be any get and set methods for the two instance variables.

Create linked list class called DateList. This should be a linked list with head node as described in lecture. 
Modify it so that the data type in the nodes is Date212. The no-argument constructor should create an empty list with first 
and last pointing to an empty head node, and length equal to zero.

Include two methods in class DateList: append and insert. 
The append method will add the new node to the end of the list; 
the insert method will add the node in the proper position to keep the list sorted in order by date.

Instantiate two linked lists, and for every date read from the file, add it to the first list using append, and to the second list using insert. 
You will end up with the first list having the dates from the input file in the order they were read, and in the second list the dates will be in sorted order. 
Display the unsorted and sorted dates in the GUI just as in project 1.

ToString() for Class Date212:
Create a toString method in lass Date212 the will return the date in the form mm/dd/yyyy. Use this method to display the dates in the GUI.
