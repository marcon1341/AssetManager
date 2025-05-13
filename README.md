AssetManager Java Project

📄 Overview

AssetManager is a Java console application that manages different types of assets. It demonstrates object-oriented programming principles including inheritance, polymorphism, method overriding, constructor chaining, and downcasting.

This project includes:

A parent class: Asset

Two subclasses: House and Vehicle

A main class that stores and displays asset information using polymorphism and type-checking

🎓 Used

Java OOP: Classes, Inheritance, Constructors, Encapsulation

Polymorphism and Typecasting

Math operations (Math.pow)

Console formatting with System.out.printf()

🔹 Classes and Responsibilities

1. Asset.java

Base class for all asset types

Fields: description, dateAcquired, originalCost

Methods:

Getters

getValue() ➔ returns original cost (overridden by subclasses)

2. House.java

Extends Asset

Additional Fields: address, condition, squareFoot, lotSize

Constructor uses super() to initialize base fields

Overrides getValue() to calculate value based on condition and lot size

3. Vehicle.java

Extends Asset

Additional Fields: makeModel, year, odometer

Constructor uses super() to initialize base fields

Overrides getValue() to calculate depreciation by age and mileage

4. Main.java

Creates an ArrayList<Asset> with mixed asset types

Loops through assets twice:

displays all houses

displays all vehicles

Uses instanceof and downcasting to access subclass-specific fields

Formats values using System.out.printf() with %.2f

Sample output-->
![Screenshot 2025-05-13 110816](https://github.com/user-attachments/assets/009e5786-d356-4d62-a226-1773f9444263)
![Screenshot 2025-05-13 110809](https://github.com/user-attachments/assets/1afb8c38-fdce-474e-a286-61a77280019e)
