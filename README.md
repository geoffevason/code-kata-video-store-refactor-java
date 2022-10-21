# Code Dojo - Video Store Refactoring Kata

## Kata Focus

This purpose of this kata is practice refactoring. 
Refactoring can be used to make code easier to read and maintain.
In the code provided, there are some code smells.
A big problem with hard to read code is that it's also hard to modify.
To trigger a need to refactor, this kata introduces a new requirement.

## Starting Point

This software is used at a local video rental store.

Videos each have a price code.
The price code determines the cost per day.
Some price codes have discounts for extended rentals.
For example, a "Regular" video rental costs $2.00 for teh first 2 days plus $1.50 per additional day.

The video store also offers a loyalty "frequent renter points" program.
These frequent renter points are assigned based on the type of video.

- A `Movie` has a `title` and a `priceCode`
- A `Rental` represent a `Movie` being rented for `daysRented` number of days.
- A `Customer` has a `name` and can be assigned any number of `Rentals`.

Given a `Customer`, and a list of `Rentals`, this software can generate a text statement.
The statement includes:
- the list of rentals (name and cost)
- amount owed
- frequent renter points

The software comes with tests that cover the existing interface.

## New Requirement

** Coming soon

## Suggestions

- Think out loud: Share ideas, discuss approaches, and talk about naming (assuming it's a group exercise)
- Leave the interface as it is (so you don't have to change the tests)
- Run the tests often
- Aim for clean code:
  - objects and functions that do only 1 thing (Single Responsibilty Principle)
  - short functions and classes (bonus challenge - can you do this with no functions > 5 lines?)
  