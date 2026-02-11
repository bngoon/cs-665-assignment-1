
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | BOOKER NGOON               |
| Date         | 2/7/2026                   |
| Course       | Fall / Spring / Summer     |
| Assignment # | 1                          |

# Assignment Overview
The objective of this assignment was to design and implement a beverage vending machine system using OOP. The system
supports multiple beverage types and allows condiments such as milk and sugar. The implementation shows separation of
responsibilities. Each beverage has a base price and condiments are handed separately for modular behavior. 
Testing is done with JUnit.

# GitHub Repository Link:
https://github.com/bngoon/cs-665-assignment-1

# Implementation Description
This is a flexible design.

The implementation is flexible because the beverage type is represented as a subclass of the abstract Beverage class.
If a new beverage needs to be added in the future, the only things needed are:
  -Create a new class that extends Beverage
  -Set the name and basePrice
  -Add a brew method in BeverageMachine
This design isolates change and keeps modifications localized. 

By design it is simple and shows each class has clear responsibility. 
This avoids duplicate code by placing shared logic within abstract Beverage class. 
Price calculation and condiment handling are centralized instead of being repeated in every beverage class. 

The CondimentSet class encapsulates condiment validation and pricing logic. 
This prevents repeated validation logic across multiple beverage classes


No formal design pattern used for this assignment. 